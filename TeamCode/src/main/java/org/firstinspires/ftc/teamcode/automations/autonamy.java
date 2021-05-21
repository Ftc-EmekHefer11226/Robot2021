package org.firstinspires.ftc.teamcode.automations;

import org.firstinspires.ftc.teamcode.Command;
import org.firstinspires.ftc.teamcode.Commands.Chasiss.DriveToTarget;
import org.firstinspires.ftc.teamcode.ShootingCommand;
import org.firstinspires.ftc.teamcode.Util;

import javax.swing.Timer;

public class autonamy extends Command {

    @Override
    public void initialize() {

    }

    @Override
    public void execute()
    {
        new DriveToTarget(Util.cmToTicks(203.2));
        new ShootingCommand();
    }

    @Override
    public void end() {
        super.end();
    }

    @Override
    public boolean isFinished() {
        return time>=30;
    }

    public autonamy() {
        super();
    }

    @Override
    public void runOpMode() throws InterruptedException {
        super.runOpMode();
        new autonamy();
    }
}
