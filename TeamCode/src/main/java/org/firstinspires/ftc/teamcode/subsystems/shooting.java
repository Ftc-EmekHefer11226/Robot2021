package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class shooting extends LinearOpMode {
    private DcMotor Shooting;
    private static shooting instance;
    public shooting() {
        instance = new shooting();
    }
    public void Shoot(){
            Shooting.setPower(1);
    }
    public static shooting getInstance() {
        return instance;
    }
    @Override
    public void runOpMode() throws InterruptedException {
       Shooting = hardwareMap.get(DcMotor.class, "Shooting");
    }
}
