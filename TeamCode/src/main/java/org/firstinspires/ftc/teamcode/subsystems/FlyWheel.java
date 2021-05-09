package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class FlyWheel extends LinearOpMode {
    private DcMotor FlyWheelMotor;

    private static FlyWheel instance;
    public FlyWheel() {
        instance = new FlyWheel();
    }
    public void Shoot(){
        FlyWheelMotor.setPower(1);
    }
    public static FlyWheel getInstance() {
        return instance;
    }
    public void stopMotors() {
        FlyWheelMotor.setPower(0);
    }
    public void restoreFactoryDefault() {
        FlyWheelMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        FlyWheelMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        FlyWheelMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
     @Override
    public void runOpMode() throws InterruptedException{
            FlyWheelMotor = hardwareMap.get(DcMotor.class, "FlyWheelMotor");
            restoreFactoryDefault();
    }
}