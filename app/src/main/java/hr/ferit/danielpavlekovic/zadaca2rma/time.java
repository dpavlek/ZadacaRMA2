package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Context;
import android.util.Log;

import static java.lang.Math.pow;

/**
 * Created by danielpavlekovic on 02.04.2017..
 */

class time {
    private Context context;

    private String inputtimeType;
    private Double inputtime;
    private String outputtimeType;
    private String[] timeTypes;

    public time(Context c_context){
        context=c_context;
        timeTypes = context.getResources().getStringArray(R.array.TimeUnits);
    }

    public void setInput(Double i_time, String i_type, String o_type){
        inputtime = i_time;
        inputtimeType = i_type;
        outputtimeType=o_type;
    }

    public String getInputtimeType(){
        return inputtimeType;
    }

    public String getOutputtimeType(){
        return outputtimeType;
    }

    public Double Convert(){
        Double convertedtime=0.0;
        try {
            if (outputtimeType.equals(timeTypes[0])) { //years
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime; //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime / 365.242199; //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / 52.177457; //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime / 8765.81277; //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime / 525948.766;
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime / 31556926;
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime / (3.1556926 * pow(10, 10));
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/(3.1556926 * pow(10, 13));
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/(3.1556926 * pow(10, 16));
                } else if(inputtimeType.equals(timeTypes[9])){
                    //to picoseconds
                    convertedtime=inputtime/(3.1556926 * pow(10, 19));
                }
            }
            else if (outputtimeType.equals(timeTypes[1])) { //days
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime*365.242199; //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime; //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / 0.142857143; //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime / 24; //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime / (24*60);
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime /(24*60*60);
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime / (8.64 * pow(10, 7));
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/(8.64 * pow(10, 10));
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/(8.64 * pow(10, 13));
                } else if(inputtimeType.equals(timeTypes[9])){
                    //to picoseconds
                    convertedtime=inputtime/(8.64 * pow(10, 16));
                }
            }
            else if (outputtimeType.equals(timeTypes[2])) { //weeks
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime/0.0191653649; //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime/7; //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime; //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime / (7*24); //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime / (7*24*60);
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime / (7*24*60*60);
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime / (7*(8.64 * pow(10, 7)));
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/(7*(8.64 * pow(10, 10)));
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/(7*(8.64 * pow(10, 13)));
                } else if(inputtimeType.equals(timeTypes[9])){
                    //to picoseconds
                    convertedtime=inputtime/(7*(8.64 * pow(10, 16)));
                }
            }
            else if (outputtimeType.equals(timeTypes[3])) { //hours
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime/0.000114079553; //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime/0.0416666667; //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / 0.00595238095; //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime; //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime / 60;
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime / (60*60);
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime / 3600000;
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/(3.6*pow(10,9));
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/(3.6 * pow(10, 11));
                } else if(inputtimeType.equals(timeTypes[9])){
                    //to picoseconds
                    convertedtime=inputtime/(3.6 * pow(10, 14));
                }
            }
            else if (outputtimeType.equals(timeTypes[4])) { //minutes
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime/(1.90132588*pow(10,-6)); //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime/0.000694444444; //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / (9.92063492*pow(10,-5)); //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime*60; //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime;
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime /60;
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime / 60000;
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/(6*pow(10,7));
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/(6 * pow(10, 10));
                } else if(inputtimeType.equals(timeTypes[9])){
                    //to picoseconds
                    convertedtime=inputtime/(6 * pow(10, 13));
                }
            }
            else if (outputtimeType.equals(timeTypes[4])) { //seconds
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime/(3.16887646*pow(10,-8)); //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime/(1.15740741*pow(10,-5)); //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / (1.65343915*pow(10,-6)); //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime/0.000277777778; //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime*60;
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime;
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime / 1000;
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/1000000;
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/1000000000;
                } else if(inputtimeType.equals(timeTypes[9])) {
                    //to picoseconds
                    convertedtime = inputtime / pow(10, 12);
                }
            }
            else if (outputtimeType.equals(timeTypes[5])) { //miliseconds
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime/(3.16887646*pow(10,-11)); //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime/(1.15740741*pow(10,-8)); //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / (1.65343915*pow(10,-9)); //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime/(2.77777778*pow(10,-7)); //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime/(1.6666667*pow(10,-5));
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime/0.001;
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime;
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/1000;
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/1000000;
                } else if(inputtimeType.equals(timeTypes[9])) {
                    //to picoseconds
                    convertedtime = inputtime / pow(10, 6);
                }
            }
            else if (outputtimeType.equals(timeTypes[6])) { //microseconds
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime/(3.16887646*pow(10,-14)); //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime/(1.15740741*pow(10,-11)); //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / (1.65343915*pow(10,-12)); //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime/(2.77777778*pow(10,-10)); //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime/(1.6666667*pow(10,-8));
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime/pow(10,-6);
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime/0.001;
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime;
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/1000;
                } else if(inputtimeType.equals(timeTypes[9])) {
                    //to picoseconds
                    convertedtime = inputtime / 1000000;
                }
            }
            else if (outputtimeType.equals(timeTypes[7])) { //nanoseconds
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime/(3.16887646*pow(10,-17)); //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime/(1.15740741*pow(10,-14)); //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / (1.65343915*pow(10,-15)); //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime/(2.77777778*pow(10,-13)); //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime/(1.6666667*pow(10,-11));
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime/pow(10,-9);
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime/pow(10,-6);
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/0.001;
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime;
                } else if(inputtimeType.equals(timeTypes[9])) {
                    //to picoseconds
                    convertedtime = inputtime / 1000;
                }
            }
            else if (outputtimeType.equals(timeTypes[8])) { //picoseconds
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime/(3.16887646*pow(10,-20)); //to years
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime/(1.15740741*pow(10,-17)); //to days
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime / (1.65343915*pow(10,-18)); //to weeks
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime/(2.77777778*pow(10,-16)); //to hours
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //to minutes
                    convertedtime = inputtime/(1.6666667*pow(10,-14));
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //to seconds
                    convertedtime = inputtime/pow(10,-12);
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //to miliseconds
                    convertedtime = inputtime/pow(10,-9);
                } else if(inputtimeType.equals(timeTypes[7])){
                    //to microseconds
                    convertedtime=inputtime/pow(10,-6);
                } else if(inputtimeType.equals(timeTypes[8])){
                    //to nanoseconds
                    convertedtime=inputtime/0.001;
                } else if(inputtimeType.equals(timeTypes[9])) {
                    //to picoseconds
                    convertedtime = inputtime;
                }
            }
        }
        catch (Exception err){
            Log.e("Convert_error",err.toString());
        }
        return  convertedtime;
    }
}
