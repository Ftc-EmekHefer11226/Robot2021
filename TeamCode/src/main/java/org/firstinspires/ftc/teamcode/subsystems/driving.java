package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class driving extends LinearOpMode {
    private DcMotor Lmotor1;
    private DcMotor Lmotor2;
    private DcMotor Rmotor1;
    private DcMotor Rmotor2;
    private static  driving instance;
    public driving(){
        instance= new driving();
    }

    public static driving getInstance() {
        return instance;
    }

    @Override
    public void runOpMode() throws InterruptedException {
    }
}
