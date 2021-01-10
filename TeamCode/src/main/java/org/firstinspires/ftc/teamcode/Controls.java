package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystems.driving;
import org.firstinspires.ftc.teamcode.subsystems.shooting;

public class Controls extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DrivingControls();
        ShootingControls();
    }

    public void DrivingControls() {
        if (Math.abs(gamepad1.right_stick_y) > 0.2 && Math.abs(gamepad1.left_stick_x) < 0.2) {
            driving.getInstance().DriveForward(gamepad1.right_stick_y);
        }
        if (Math.abs(gamepad1.left_stick_x) > 0.2 && Math.abs(gamepad1.right_stick_y) < 0.2) {
            driving.getInstance().Turn(gamepad1.left_stick_x);
        }
        if (Math.abs(gamepad1.right_stick_x) > 0.2) {
            driving.getInstance().SideDrive(gamepad1.right_stick_x);
        }
        if (gamepad1.a) {
            driving.getInstance().Gear(1);
        }
        if (gamepad1.b) {
            driving.getInstance().Gear(0.5);
        }
    }

    public void ShootingControls() {
        if (gamepad2.right_trigger > 0.2) {
            shooting.getInstance().Shoot();
        }
    }
}
