package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class driving extends LinearOpMode {
    private DcMotor lDrive1 = null;
    private DcMotor lDrive2 = null;
    private DcMotor rDrive1 = null;
    private DcMotor rDrive2 = null;
    private static driving instance;
    private double Gear = 1;
    public driving() {
        instance = new driving();
    }

    public static driving getInstance() {
        return instance;
    }

    public void DriveForward(double speed) {
        rDrive1.setPower(speed * Gear);
        rDrive2.setPower(speed * Gear);
        lDrive1.setPower(speed * Gear);
        lDrive2.setPower(speed * Gear);
    }
    public void Turn(double speed){
        rDrive1.setPower(speed * Gear);
        rDrive2.setPower(speed * Gear);
        lDrive1.setPower(-speed * Gear);
        lDrive2.setPower(-speed * Gear);
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

    @Override
    public void runOpMode() throws InterruptedException {
        lDrive1 = hardwareMap.get(DcMotor.class, "lDrive1");
        lDrive2 = hardwareMap.get(DcMotor.class, "lDrive2");
        rDrive1 = hardwareMap.get(DcMotor.class, "rDrive1");
        rDrive2 = hardwareMap.get(DcMotor.class, "rDrive2");

        lDrive1.setDirection(DcMotor.Direction.REVERSE);
        lDrive2.setDirection(DcMotor.Direction.REVERSE);
        rDrive1.setDirection(DcMotor.Direction.FORWARD);
        rDrive2.setDirection(DcMotor.Direction.FORWARD);
    }
}