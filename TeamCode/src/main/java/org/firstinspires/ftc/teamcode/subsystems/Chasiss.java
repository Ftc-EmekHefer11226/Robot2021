package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Chasiss extends LinearOpMode {
    private DcMotor rDrive1 = null;
    private DcMotor rDrive2 = null;
    private DcMotor lDrive1 = null;
    private DcMotor lDrive2 = null;
    private static Chasiss instance;
    private double Gear = 1;
    public Chasiss() { instance = new Chasiss(); }

    public static Chasiss getInstance() {
        return instance;
    }

    public void DriveForward(double speed) {
        rDrive1.setPower(speed * Gear);
        rDrive2.setPower(speed * Gear);
        lDrive1.setPower(speed * Gear);
        lDrive2.setPower(speed * Gear);
    }
    public void Turn(double speed){
        rDrive1.setPower(-speed * Gear);
        rDrive2.setPower(-speed * Gear);
        lDrive1.setPower(speed * Gear);
        lDrive2.setPower(speed * Gear);
    }
    public void SideDrive(double speed){
        rDrive1.setPower(-speed * Gear);
        rDrive2.setPower(speed * Gear);
        lDrive1.setPower(speed * Gear);
        lDrive2.setPower(-speed * Gear);
    }
    public void Gear(double Speed){
        Gear = Speed;
    }

    public void stopMotors(){
        rDrive1.setPower(0);
        rDrive2.setPower(0);
        lDrive1.setPower(0);
        lDrive2.setPower(0);
    }
    public void restoreFactoryDefault(){
        rDrive1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rDrive2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lDrive1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lDrive2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        rDrive1.setDirection(DcMotorSimple.Direction.REVERSE);
        rDrive2.setDirection(DcMotorSimple.Direction.REVERSE);
        lDrive1.setDirection(DcMotorSimple.Direction.FORWARD);
        lDrive2.setDirection(DcMotorSimple.Direction.FORWARD);

        rDrive1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rDrive2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        lDrive1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        lDrive2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    @Override
    public void runOpMode() throws InterruptedException {
        rDrive1 = hardwareMap.get(DcMotor.class, "lDrive1");
        rDrive2 = hardwareMap.get(DcMotor.class, "lDrive2");
        lDrive1 = hardwareMap.get(DcMotor.class, "rDrive1");
        lDrive2 = hardwareMap.get(DcMotor.class, "rDrive2");
        restoreFactoryDefault();
    }
}