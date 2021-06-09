//package org.firstinspires.ftc.teamcode.automations;
//
//import org.firstinspires.ftc.teamcode.Command;
//import org.firstinspires.ftc.teamcode.Commands.Chasiss.DriveSideWaysToTarget;
//import org.firstinspires.ftc.teamcode.Commands.Chasiss.DriveToTarget;
//import org.firstinspires.ftc.teamcode.Constants;
//import org.firstinspires.ftc.teamcode.Util;
//import org.firstinspires.ftc.teamcode.subsystems.sensors;
//
//
//public class Findpath extends Command {
//    private String path="a";
//    Command torun;
//    private double distance; //inch
//    @Override
//    public void initialize() {
//        super.initialize();
//    }
//
//    @Override
//    public void execute() {
//      new DriveSideWaysToTarget(Constants.hoopspoint[0]);//does calling this calls it until it is finished
//        new DriveToTarget(Constants.hoopspoint[1]);
//
//      if(Util.Tolerance(Constants.sensorHight, Util.convertIRtoInch(sensors.getInstance().getStrength()), 0.2)){
//            path="a";
//        }
//        else if(Util.Tolerance(Constants.sensorHight-3, Util.convertIRtoInch(sensors.getInstance().getStrength()), 0.2)){
//            path="b";
//        }
//        else if(Util.Tolerance(Constants.sensorHight-0.75, Util.convertIRtoInch(sensors.getInstance().getStrength()), 0.2)) {
//            path = "c";
//        }
//    }
//
//    @Override
//    public void end() {
//        super.end();
//    }
//
//    @Override
//    public boolean isFinished() {
//        return super.isFinished();
//    }
//
//    public Findpath() {
//        super();
//    }
//
//    public String getPath() {
//        return path;
//    }
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        super.runOpMode();
//    }
//}
