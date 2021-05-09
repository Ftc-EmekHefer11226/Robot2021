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
        if (gamepad2.right_trigger > 0.2) {
            FlyWheel.getInstance().Shoot();
        }
        else {
            FlyWheel.getInstance().stopMotors();
        }
    }
    public void IntakeControls(){
        if (gamepad2.left_trigger > 0.2) {
                Intake.getInstance().setSpeed(0.69);
        }
        else if (gamepad2.dpad_left){
                Intake.getInstance().setSpeed(-0.69);
        }
        else {
            Intake.getInstance().stopMotors();
        }
    }
    public void MagazineControls(){
        if (gamepad2.x){
            Magazine.getInstance().Reload();
        }
    }
}