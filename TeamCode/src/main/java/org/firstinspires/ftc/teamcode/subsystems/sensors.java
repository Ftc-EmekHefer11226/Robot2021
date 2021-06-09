package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;

public class sensors extends LinearOpMode {
    private IrSeekerSensor IRsensor;
    private static sensors instance;

    public sensors(){
        instance = new sensors();
    }
    public static sensors getInstance(){
        return instance;
    }
    public double getStrength(){
        return  IRsensor.getStrength();
    }


    @Override
    public void runOpMode() throws InterruptedException {
        IRsensor = hardwareMap.get(IrSeekerSensor.class, "IrSensor");
    }
}
