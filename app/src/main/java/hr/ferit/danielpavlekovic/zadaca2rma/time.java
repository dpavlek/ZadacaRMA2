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
            if (outputtimeType.equals(timeTypes[0])) { //km/h
                if (inputtimeType.equals(timeTypes[0])) {
                    convertedtime = inputtime; //km/h to km/h
                } else if (inputtimeType.equals(timeTypes[1])) {
                    convertedtime = inputtime * 1.61; //mph to kmph
                } else if (inputtimeType .equals(timeTypes[2]) ) {
                    convertedtime = inputtime * 3.6; // m/s to km/h
                } else if (inputtimeType .equals(timeTypes[3])) {
                    convertedtime = inputtime * 5793.6384; // miles per second to km/h
                } else if (inputtimeType .equals(timeTypes[4])) {
                    //knots to km/h
                    convertedtime = inputtime * 1.852;
                } else if (inputtimeType .equals(timeTypes[5]) ) {
                    //yard per second to km/h
                    convertedtime = inputtime * 3.29184;
                } else if (inputtimeType .equals(timeTypes[6]) ) {
                    //time of light to km/h
                    convertedtime = inputtime * (1.07925285 * pow(10, 9));
                }
            }
            else if(outputtimeType.equals(timeTypes[1])){
                if(inputtimeType.equals(timeTypes[0])){
                    convertedtime=inputtime/1.61; //km/h to mph
                }
                else if(inputtimeType.equals(timeTypes[1])){
                    convertedtime=inputtime; //mph to mph
                }
                else if(inputtimeType.equals(timeTypes[2])){
                    convertedtime=inputtime*2.23693629; // m/s to mph
                }
                else if(inputtimeType.equals(timeTypes[3])){
                    convertedtime=inputtime*3600; // miles per second to mph
                }
                else if(inputtimeType.equals(timeTypes[4])){
                    //knots to mph
                    convertedtime=inputtime*1.15077945;
                }
                else if(inputtimeType.equals(timeTypes[5])){
                    //yard per second to mph
                    convertedtime=inputtime*2.04545455;
                }
                else if(inputtimeType.equals(timeTypes[6])){
                    //time of light to mph
                    convertedtime=inputtime*670616629;
                }
            }
            else if(outputtimeType.equals(timeTypes[2])){
                if(inputtimeType.equals(timeTypes[0])){
                    convertedtime=inputtime*0.277777778; //km/h to m/s
                }
                else if(inputtimeType.equals(timeTypes[1])){
                    convertedtime=inputtime*0.44704; //mph to m/s
                }
                else if(inputtimeType.equals(timeTypes[2])){
                    convertedtime=inputtime; // m/s to m/s
                }
                else if(inputtimeType.equals(timeTypes[3])){
                    convertedtime=inputtime*1609.344; // miles per second to m/s
                }
                else if(inputtimeType.equals(timeTypes[4])){
                    //knots to m/s
                    convertedtime=inputtime*0.514444444;
                }
                else if(inputtimeType.equals(timeTypes[5])){
                    //yard per second to m/s
                    convertedtime=inputtime*0.9144;
                }
                else if(inputtimeType.equals(timeTypes[6])){
                    //time of light to m/s
                    convertedtime=inputtime*299792458;
                }
            }
            else if(outputtimeType.equals(timeTypes[3]))
            {
                if(inputtimeType.equals(timeTypes[0])){
                    convertedtime=inputtime*0.000172603109; //km/h to mi/s
                }
                else if(inputtimeType.equals(timeTypes[1])){
                    convertedtime=inputtime*0.000277777778; //mph to mi/s
                }
                else if(inputtimeType.equals(timeTypes[2])){
                    convertedtime=inputtime*0.000621371192; // m/s to mi/s
                }
                else if(inputtimeType.equals(timeTypes[3])){
                    convertedtime=inputtime; // miles per second to mi/s
                }
                else if(inputtimeType.equals(timeTypes[4])){
                    //knots to mi/s
                    convertedtime=inputtime*0.000319660958;
                }
                else if(inputtimeType.equals(timeTypes[5])){
                    //yard per second to mi/s
                    convertedtime=inputtime*0.000568181818;
                }
                else if(inputtimeType.equals(timeTypes[6])){
                    //time of light to mi/s
                    convertedtime=inputtime*186282.397;
                }
            }
            else if(outputtimeType.equals(timeTypes[4])){
                if(inputtimeType.equals(timeTypes[0])){
                    convertedtime=inputtime*0.539956803; //km/h to knots
                }
                else if(inputtimeType.equals(timeTypes[1])){
                    convertedtime=inputtime*0.868976242; //mph to knots
                }
                else if(inputtimeType.equals(timeTypes[2])){
                    convertedtime=inputtime*1.94384449; // m/s to knots
                }
                else if(inputtimeType.equals(timeTypes[3])){
                    convertedtime=inputtime*3128.31447; // miles per second to knots
                }
                else if(inputtimeType.equals(timeTypes[4])){
                    //knots to knots
                    convertedtime=inputtime;
                }
                else if(inputtimeType.equals(timeTypes[5])){
                    //yard per second to knots
                    convertedtime=inputtime*1.7774514;
                }
                else if(inputtimeType.equals(timeTypes[6])){
                    //time of light to knots
                    convertedtime=inputtime*582749918;
                }
            }
            else if(outputtimeType.equals(timeTypes[5])){
                if(inputtimeType.equals(timeTypes[0])){
                    convertedtime=inputtime*0.303781472; //km/h to yps
                }
                else if(inputtimeType.equals(timeTypes[1])){
                    convertedtime=inputtime*0.488888889; //mph to yps
                }
                else if(inputtimeType.equals(timeTypes[2])){
                    convertedtime=inputtime*1.0936133; // m/s to yps
                }
                else if(inputtimeType.equals(timeTypes[3])){
                    convertedtime=inputtime*1760; // miles per second to yps
                }
                else if(inputtimeType.equals(timeTypes[4])){
                    //knots to yps
                    convertedtime=inputtime*0.562603286;
                }
                else if(inputtimeType.equals(timeTypes[5])){
                    //yard per second to yps
                    convertedtime=inputtime;
                }
                else if(inputtimeType.equals(timeTypes[6])){
                    //time of light to yps
                    convertedtime=inputtime*327857019;
                }
            }
            else if(outputtimeType.equals(timeTypes[6])){
                if(inputtimeType.equals(timeTypes[0])){
                    convertedtime=inputtime/(1.07925285*pow(10,9)); //km/h to c
                }
                else if(inputtimeType.equals(timeTypes[1])){
                    convertedtime=inputtime/670616629; //mph to c
                }
                else if(inputtimeType.equals(timeTypes[2])){
                    convertedtime=inputtime/299792458; // m/s to c
                }
                else if(inputtimeType.equals(timeTypes[3])){
                    convertedtime=inputtime/186282.397; // miles per second to c
                }
                else if(inputtimeType.equals(timeTypes[4])){
                    //knots to c
                    convertedtime=inputtime/582749918;
                }
                else if(inputtimeType.equals(timeTypes[5])){
                    //yard per second to c
                    convertedtime=inputtime/327857019;
                }
                else if(inputtimeType.equals(timeTypes[6])){
                    //time of light to c
                    convertedtime=inputtime;
                }
            }
        }
        catch (Exception err){
            Log.e("Convert_error",err.toString());
        }
        return  convertedtime;
    }
}
