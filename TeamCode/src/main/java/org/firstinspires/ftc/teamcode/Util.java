package org.firstinspires.ftc.teamcode;

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