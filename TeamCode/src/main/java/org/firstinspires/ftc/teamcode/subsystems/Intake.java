package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Intake extends LinearOpMode {
    private DcMotor IntakeMotor;
    private static Intake instanse;
    public Intake(

    )

    public void setSpeed(double speed)
    {
        IntakeMotor.setPower(speed);
    }

    public static Intake getInstance()
    {
        return instanse;
    }
    public void stopMotors()
    {
        IntakeMotor.setPower(0);
    }
    public void restoreFactoryDefault() {
        IntakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        IntakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        IntakeMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
    @Override
    public void runOpMode() throws InterruptedException {
        IntakeMotor = hardwareMap.get(DcMotor.class, "IntakeMotor");

        IntakeMotor.setDirection(DcMotor.Direction.REVERSE);

        IntakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
}