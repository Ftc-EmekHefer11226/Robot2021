package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystems.Chasiss;
import org.firstinspires.ftc.teamcode.subsystems.FlyWheel;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Magazine;

public class Robot {
    LinearOpMode opMode;
    Chasiss chasiss;
    FlyWheel flyWheel;
    Intake intake;
    Magazine magazine;

    public Robot(LinearOpMode opMode) {
        this.opMode = opMode;
        chasiss = new Chasiss(opMode);
        flyWheel = new FlyWheel(opMode);
        intake = new Intake(opMode);
        magazine = new Magazine(opMode);
    }

    public void run() {
        ChasissControls();
        FlyWheelControls();
        IntakeControls();
        MagazineControls();
    }


    public void ChasissControls() {
        if (Math.abs(opMode.gamepad1.left_stick_y) > 0.2) {
            chasiss.Drive(opMode.gamepad1.left_stick_y);
        } else if (Math.abs(opMode.gamepad1.left_stick_x) > 0.2) {
            chasiss.SideDrive(opMode.gamepad1.left_stick_x);
        } else if (opMode.gamepad1.left_trigger > 0.2) {
            chasiss.Turn(-0.5);
        } else if (opMode.gamepad1.right_trigger > 0.2) {
            chasiss.Turn(0.5);
        } else {
            chasiss.stopMotors();
        }
        if (opMode.gamepad1.a) {
            chasiss.Gear(1);
        } else if (opMode.gamepad1.b) {
            chasiss.Gear(0.5);
        }
    }

    public void FlyWheelControls() {
        if (opMode.gamepad2.a) {
            magazine.toggle = true;
        }
        if (opMode.gamepad2.b) {
            magazine.toggle = false;
        }
        if (magazine.toggle = true) {
            flyWheel.Shoot();
        } else {
            flyWheel.stopMotors();
        }
    }

    public void IntakeControls() {
        if (opMode.gamepad2.left_trigger > 0.2) {
            intake.setSpeed(1);
        } else if (opMode.gamepad2.dpad_left) {
            intake.setSpeed(-1);
        } else {
            intake.stopMotors();
        }
    }

    public void MagazineControls() {
        if (opMode.gamepad2.right_trigger > 0.8) {
            magazine.Reload();
        } else {
            magazine.reset_servo();
        }
    }
}
