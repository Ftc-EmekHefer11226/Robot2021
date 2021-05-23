package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Magazine extends LinearOpMode {
    private Servo MagazineServo;
    public static Magazine instanse;
    public static Magazine getInstance(){return instanse;}
    public boolean toggle;
    public void Reload() {
            MagazineServo.setPosition(0.4);
            sleep(500);
            MagazineServo.setPosition(0);
        }
    public void reset_servo(){
        MagazineServo.setPosition(0);
    }


    @Override
    public void runOpMode() throws InterruptedException {
        MagazineServo = hardwareMap.get(Servo.class, "MagazineServo" );
        MagazineServo.setPosition(0);
    }
}
