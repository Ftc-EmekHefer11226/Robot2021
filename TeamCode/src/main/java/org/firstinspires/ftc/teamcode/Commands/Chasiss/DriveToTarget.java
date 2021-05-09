package org.firstinspires.ftc.teamcode.Commands.Chasiss;

import org.firstinspires.ftc.teamcode.Command;
import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.PIDController;
import org.firstinspires.ftc.teamcode.subsystems.Chasiss;

public class DriveToTarget extends Command {
    private double target;
    boolean isFinished = false;
    PIDController pidController;
    int startPos;
    public DriveToTarget(double target){
        super();
        this.target = target;
    }
    @Override
    public void initialize() {
        pidController.reset();
        pidController.setPID(Constants.Kp,Constants.Ki,Constants.Kd);
        pidController.setSetpoint(target);
        pidController.setTolerance(Constants.tolarance);
        startPos = Chasiss.getInstance().getMotorPos();
    }

    @Override
    public void execute() {
        Chasiss.getInstance().Drive(pidController.performPID(Chasiss.getInstance().getEncoderY() - startPos));
    }

    @Override
    public void end() {
        Chasiss.getInstance().stopMotors();
    }

    @Override
    public boolean isFinished() {
        return Math.abs(Chasiss.getInstance().getMotorPos() - target - startPos) < Constants.tolarance;
    }

}