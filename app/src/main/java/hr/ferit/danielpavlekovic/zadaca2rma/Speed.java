package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Context;
import android.util.Log;

import static java.lang.Math.pow;

/**
 * Created by danielpavlekovic on 01.04.2017..
 */

class Speed {
    private Context context;

    private String inputSpeedType;
    private Double inputSpeed;
    private String outputSpeedType;
    private String[] speedTypes;

    public Speed(Context c_context){
        context=c_context;
        speedTypes = context.getResources().getStringArray(R.array.SpeedUnits);
    }

    public void setInput(Double i_speed, String i_type, String o_type){
        inputSpeed = i_speed;
        inputSpeedType = i_type;
        outputSpeedType=o_type;
    }

    public String getInputSpeedType(){
        return inputSpeedType;
    }

    public String getOutputSpeedType(){
        return outputSpeedType;
    }

    public Double Convert(){
        Double convertedSpeed=0.0;
        try {
            if (outputSpeedType.equals(speedTypes[0])) { //km/h
                if (inputSpeedType.equals(speedTypes[0])) {
                    convertedSpeed = inputSpeed; //km/h to km/h
                } else if (inputSpeedType.equals(speedTypes[1])) {
                    convertedSpeed = inputSpeed * 1.61; //mph to kmph
                } else if (inputSpeedType .equals(speedTypes[2]) ) {
                    convertedSpeed = inputSpeed * 3.6; // m/s to km/h
                } else if (inputSpeedType .equals(speedTypes[3])) {
                    convertedSpeed = inputSpeed * 5793.6384; // miles per second to km/h
                } else if (inputSpeedType .equals(speedTypes[4])) {
                    //knots to km/h
                    convertedSpeed = inputSpeed * 1.852;
                } else if (inputSpeedType .equals(speedTypes[5]) ) {
                    //yard per second to km/h
                    convertedSpeed = inputSpeed * 3.29184;
                } else if (inputSpeedType .equals(speedTypes[6]) ) {
                    //speed of light to km/h
                    convertedSpeed = inputSpeed * (1.07925285 * pow(10, 9));
                }
            }
            else if(outputSpeedType.equals(speedTypes[1])){
                if(inputSpeedType.equals(speedTypes[0])){
                    convertedSpeed=inputSpeed/1.61; //km/h to mph
                }
                else if(inputSpeedType.equals(speedTypes[1])){
                    convertedSpeed=inputSpeed; //mph to mph
                }
                else if(inputSpeedType.equals(speedTypes[2])){
                    convertedSpeed=inputSpeed*2.23693629; // m/s to mph
                }
                else if(inputSpeedType.equals(speedTypes[3])){
                    convertedSpeed=inputSpeed*3600; // miles per second to mph
                }
                else if(inputSpeedType.equals(speedTypes[4])){
                    //knots to mph
                    convertedSpeed=inputSpeed*1.15077945;
                }
                else if(inputSpeedType.equals(speedTypes[5])){
                    //yard per second to mph
                    convertedSpeed=inputSpeed*2.04545455;
                }
                else if(inputSpeedType.equals(speedTypes[6])){
                    //speed of light to mph
                    convertedSpeed=inputSpeed*670616629;
                }
            }
            else if(outputSpeedType.equals(speedTypes[2])){
                if(inputSpeedType.equals(speedTypes[0])){
                    convertedSpeed=inputSpeed*0.277777778; //km/h to m/s
                }
                else if(inputSpeedType.equals(speedTypes[1])){
                    convertedSpeed=inputSpeed*0.44704; //mph to m/s
                }
                else if(inputSpeedType.equals(speedTypes[2])){
                    convertedSpeed=inputSpeed; // m/s to m/s
                }
                else if(inputSpeedType.equals(speedTypes[3])){
                    convertedSpeed=inputSpeed*1609.344; // miles per second to m/s
                }
                else if(inputSpeedType.equals(speedTypes[4])){
                    //knots to m/s
                    convertedSpeed=inputSpeed*0.514444444;
                }
                else if(inputSpeedType.equals(speedTypes[5])){
                    //yard per second to m/s
                    convertedSpeed=inputSpeed*0.9144;
                }
                else if(inputSpeedType.equals(speedTypes[6])){
                    //speed of light to m/s
                    convertedSpeed=inputSpeed*299792458;
                }
            }
            else if(outputSpeedType.equals(speedTypes[3]))
            {
                if(inputSpeedType.equals(speedTypes[0])){
                    convertedSpeed=inputSpeed*0.000172603109; //km/h to mi/s
                }
                else if(inputSpeedType.equals(speedTypes[1])){
                    convertedSpeed=inputSpeed*0.000277777778; //mph to mi/s
                }
                else if(inputSpeedType.equals(speedTypes[2])){
                    convertedSpeed=inputSpeed*0.000621371192; // m/s to mi/s
                }
                else if(inputSpeedType.equals(speedTypes[3])){
                    convertedSpeed=inputSpeed; // miles per second to mi/s
                }
                else if(inputSpeedType.equals(speedTypes[4])){
                    //knots to mi/s
                    convertedSpeed=inputSpeed*0.000319660958;
                }
                else if(inputSpeedType.equals(speedTypes[5])){
                    //yard per second to mi/s
                    convertedSpeed=inputSpeed*0.000568181818;
                }
                else if(inputSpeedType.equals(speedTypes[6])){
                    //speed of light to mi/s
                    convertedSpeed=inputSpeed*186282.397;
                }
            }
            else if(outputSpeedType.equals(speedTypes[4])){
                if(inputSpeedType.equals(speedTypes[0])){
                    convertedSpeed=inputSpeed*0.539956803; //km/h to knots
                }
                else if(inputSpeedType.equals(speedTypes[1])){
                    convertedSpeed=inputSpeed*0.868976242; //mph to knots
                }
                else if(inputSpeedType.equals(speedTypes[2])){
                    convertedSpeed=inputSpeed*1.94384449; // m/s to knots
                }
                else if(inputSpeedType.equals(speedTypes[3])){
                    convertedSpeed=inputSpeed*3128.31447; // miles per second to knots
                }
                else if(inputSpeedType.equals(speedTypes[4])){
                    //knots to knots
                    convertedSpeed=inputSpeed;
                }
                else if(inputSpeedType.equals(speedTypes[5])){
                    //yard per second to knots
                    convertedSpeed=inputSpeed*1.7774514;
                }
                else if(inputSpeedType.equals(speedTypes[6])){
                    //speed of light to knots
                    convertedSpeed=inputSpeed*582749918;
                }
            }
            else if(outputSpeedType.equals(speedTypes[5])){
                if(inputSpeedType.equals(speedTypes[0])){
                    convertedSpeed=inputSpeed*0.303781472; //km/h to yps
                }
                else if(inputSpeedType.equals(speedTypes[1])){
                    convertedSpeed=inputSpeed*0.488888889; //mph to yps
                }
                else if(inputSpeedType.equals(speedTypes[2])){
                    convertedSpeed=inputSpeed*1.0936133; // m/s to yps
                }
                else if(inputSpeedType.equals(speedTypes[3])){
                    convertedSpeed=inputSpeed*1760; // miles per second to yps
                }
                else if(inputSpeedType.equals(speedTypes[4])){
                    //knots to yps
                    convertedSpeed=inputSpeed*0.562603286;
                }
                else if(inputSpeedType.equals(speedTypes[5])){
                    //yard per second to yps
                    convertedSpeed=inputSpeed;
                }
                else if(inputSpeedType.equals(speedTypes[6])){
                    //speed of light to yps
                    convertedSpeed=inputSpeed*327857019;
                }
            }
            else if(outputSpeedType.equals(speedTypes[6])){
                if(inputSpeedType.equals(speedTypes[0])){
                    convertedSpeed=inputSpeed/(1.07925285*pow(10,9)); //km/h to c
                }
                else if(inputSpeedType.equals(speedTypes[1])){
                    convertedSpeed=inputSpeed/670616629; //mph to c
                }
                else if(inputSpeedType.equals(speedTypes[2])){
                    convertedSpeed=inputSpeed/299792458; // m/s to c
                }
                else if(inputSpeedType.equals(speedTypes[3])){
                    convertedSpeed=inputSpeed/186282.397; // miles per second to c
                }
                else if(inputSpeedType.equals(speedTypes[4])){
                    //knots to c
                    convertedSpeed=inputSpeed/582749918;
                }
                else if(inputSpeedType.equals(speedTypes[5])){
                    //yard per second to c
                    convertedSpeed=inputSpeed/327857019;
                }
                else if(inputSpeedType.equals(speedTypes[6])){
                    //speed of light to c
                    convertedSpeed=inputSpeed;
                }
            }
        }
        catch (Exception err){
            Log.e("Convert_error",err.toString());
        }
        return  convertedSpeed;
    }

}
