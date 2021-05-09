package org.firstinspires.ftc.teamcode.automations;

import org.firstinspires.ftc.robotcore.internal.android.dx.cf.code.SwitchList;
import org.firstinspires.ftc.teamcode.Command;
import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.Util;
import org.firstinspires.ftc.teamcode.subsystems.sensors;


public class Findpath extends Command {
    private String path="a";
    private double distance; //inch
    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        super.execute();
        if(Util.Tolerance(Constants.sensorHight, Util.convertIRtoInch(sensors.getInstance().getStrength()), 0.2)){
            path="a";
        }
        else if(Util.Tolerance(Constants.sensorHight-3, Util.convertIRtoInch(sensors.getInstance().getStrength()), 0.2)){
            path="b";
        }
        else if(Util.Tolerance(Constants.sensorHight-0.75, Util.convertIRtoInch(sensors.getInstance().getStrength()), 0.2)) {
            path = "c";
        }
    }

    @Override
    public void end() {
        super.end();
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }

    public Findpath() {
        super();
    }

    public String getPath() {
        return path;
    }

    @Override
    public void runOpMode() throws InterruptedException {
        super.runOpMode();
    }
}
