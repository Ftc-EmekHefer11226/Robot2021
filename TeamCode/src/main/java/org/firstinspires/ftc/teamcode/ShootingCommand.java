package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.subsystems.FlyWheel;
import org.firstinspires.ftc.teamcode.subsystems.Magazine;

public class ShootingCommand extends Command{
    int counter;

    @Override
    public void initialize() {
        super.initialize();
        counter = 0;
    }

    @Override
    public void execute() {
        FlyWheel.getInstance().Shoot();
        Magazine.getInstance().Reload();
        counter ++;
    }

    @Override
    public void end() {
        FlyWheel.getInstance().stopMotors();
    }

    @Override
    public boolean isFinished(){
        return counter == 3;
    }

    public ShootingCommand() {
        super();
    }

    @Override
    public void runOpMode() throws InterruptedException {
        super.runOpMode();
    }
}
