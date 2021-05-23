package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystems.Chasiss;
import org.firstinspires.ftc.teamcode.subsystems.FlyWheel;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Magazine;

public class Controls extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        ChasissControls();
        FlyWheelControls();
        IntakeControls();
        MagazineControls();
    }


    public void ChasissControls() {
        if (Math.abs(gamepad1.left_stick_y) > 0.2) {
            Chasiss.getInstance().Drive(gamepad1.left_stick_y);
        }
        if (Math.abs(gamepad1.left_stick_x) > 0.2) {
            Chasiss.getInstance().SideDrive(gamepad1.left_stick_x);
        }
        if (gamepad1.left_trigger > 0.2) {
            Chasiss.getInstance().Turn(-0.5);
        }
        if (gamepad1.right_trigger > 0.2) {
            Chasiss.getInstance().Turn(0.5);
        }
        if (gamepad1.a) {
            Chasiss.getInstance().Gear(1);
        }
        if (gamepad1.b) {
            Chasiss.getInstance().Gear(0.5);
        }
    }

    public void FlyWheelControls() {
        if (gamepad2.a) {
            Magazine.getInstance().toggle = true;
        }
        if (gamepad2.b){
            Magazine.getInstance().toggle = false;
        }
        if (Magazine.getInstance().toggle = true) {
            Magazine.getInstance().Reload();
        }
    }
    public void IntakeControls(){
        if (gamepad2.left_trigger > 0.2) {
            Intake.getInstance().setSpeed(1);
        } else if (gamepad2.dpad_left) {
            Intake.getInstance().setSpeed(-1);g
        } else {
            Intake.getInstance().stopMotors();
        }
    }
    public void MagazineControls(){
        if (gamepad2.right_trigger > 0.8) {
            Magazine.getInstance().Reload();
        } else {
            Magazine.getInstance().reset_servo();
        }
    }
}
