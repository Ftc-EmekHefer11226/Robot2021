package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Intake {
    private DcMotor IntakeMotor;

    public Intake(LinearOpMode opMode) {
        IntakeMotor = opMode.hardwareMap.get(DcMotor.class, "IntakeMotor");

        IntakeMotor.setDirection(DcMotor.Direction.REVERSE);

        IntakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void setSpeed(double speed) {
        IntakeMotor.setPower(speed);
    }


    public void stopMotors() {
        IntakeMotor.setPower(0);
    }

    public void restoreFactoryDefault() {
        IntakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        IntakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        IntakeMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}