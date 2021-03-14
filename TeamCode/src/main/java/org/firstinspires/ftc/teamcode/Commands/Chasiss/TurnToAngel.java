package org.firstinspires.ftc.teamcode.Commands.Chasiss;

import org.firstinspires.ftc.teamcode.PIDController;
import org.firstinspires.ftc.teamcode.subsystems.Chasiss;

public class TurnToAngel {
    double pos;
    double turnSpeed;
    double targetAngel;
    boolean isFinished = false;
    PIDController pidController;

    public TurnToAngel(double angel) {
        this.targetAngel = angel;
    }


    public void initialize() {
        Chasiss.getInstance().restoreFactoryDefault();
        pidController.reset();
        pidController.setPID(0, 0, 0);
        pidController.setSetpoint(targetAngel);
        pidController.setTolerance(5);
    }

    public void execute() {
        while (pidController.onTarget()) {
            if (targetAngel < pos) {
                Chasiss.getInstance().Turn(pidController.performPID(pos));
            }
        }
    }
    public void end(){
        Chasiss.getInstance().stopMotors();
        isFinished = true;
    }
    public boolean isFinished(){
        return isFinished;
    }
}