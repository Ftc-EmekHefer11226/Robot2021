package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcore.internal.android.dx.rop.cst.Constant;
import org.firstinspires.ftc.teamcode.Commands.Chasiss.DriveToTarget;
import org.firstinspires.ftc.teamcode.Constants;

public class Util {
    public static double cmToTicks(double cm){
        double cmCircumference = Constants.Circumference / 10;
        double TicksPerCm = Constants.TicksPerRevolution / cmCircumference;
        return cm * TicksPerCm;
    }
    public static boolean Tolerance(double wanted, double current, double tolerance){
        return Math.abs(wanted - current) < tolerance;
    }

}