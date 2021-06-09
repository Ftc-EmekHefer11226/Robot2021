package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Magazine {
    private Servo MagazineServo;
    LinearOpMode opMode;

    public Magazine(LinearOpMode opMode) {
        this.opMode = opMode;
        MagazineServo = opMode.hardwareMap.get(Servo.class, "MagazineServo");
        MagazineServo.setPosition(0);
    }

    public boolean toggle;

    public void Reload() {
        MagazineServo.setPosition(0.4);
        opMode.sleep(500);
        MagazineServo.setPosition(0);
    }

    public void reset_servo() {
        MagazineServo.setPosition(0);
    }
}
