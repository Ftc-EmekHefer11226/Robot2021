package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class FlyWheel {
    private DcMotor FlyWheelMotor;


    public FlyWheel(LinearOpMode opMode) {
        restoreFactoryDefault();
        FlyWheelMotor = opMode.hardwareMap.get(DcMotor.class, "FlyWheelMotor");
    }

    public void Shoot() {
        FlyWheelMotor.setPower(1);
    }


    public void stopMotors() {
        FlyWheelMotor.setPower(0);
    }

    public void restoreFactoryDefault() {
        FlyWheelMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        FlyWheelMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        FlyWheelMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

}