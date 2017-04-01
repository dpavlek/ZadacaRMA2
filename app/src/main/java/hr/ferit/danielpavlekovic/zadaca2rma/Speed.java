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
    private String outputSpeedType;
    private Double inputSpeed;
    private Double outputSpeed;
    private String[] speedTypes = new String[7];

    public Speed(Context c_context){
        context=c_context;
        speedTypes = context.getResources().getStringArray(R.array.SpeedUnits);
    }

    public void setInput(Double i_speed, String i_type){
        inputSpeed = i_speed;
        inputSpeedType = i_type;
    }

    public void setOutput(Double o_speed, String o_type){
        outputSpeed = o_speed;
        outputSpeedType = o_type;
    }

    public Double toKmh(){
        Double convertedSpeed=0.0;
        try{
            if(inputSpeedType==speedTypes[0]){
                convertedSpeed=inputSpeed; //km/h to km/h
            }
            else if(inputSpeedType==speedTypes[1]){
                convertedSpeed=inputSpeed*1.61; //mph to kmph
            }
            else if(inputSpeedType==speedTypes[2]){
                convertedSpeed=inputSpeed*3.6; // m/s to km/h
            }
            else if(inputSpeedType==speedTypes[3]){
                convertedSpeed=inputSpeed*5793.6384; // miles per second to km/h
            }
            else if(inputSpeedType==speedTypes[4]){
                //knots to km/h
                convertedSpeed=inputSpeed*1.852;
            }
            else if(inputSpeedType==speedTypes[5]){
                //yard per second to km/h
                convertedSpeed=inputSpeed*3.29184;
            }
            else if(inputSpeedType==speedTypes[6]){
                //speed of light to km/h
                convertedSpeed=inputSpeed*(1.07925285*pow(10,9));
            }
        }
        catch (Exception err){
            Log.e("toKmh_error",err.toString());
        }
        return  convertedSpeed;
    }

    public Double toMph(){
        Double convertedSpeed=0.0;
        try{
            if(inputSpeedType==speedTypes[0]){
                convertedSpeed=inputSpeed/1.61; //km/h to mph
            }
            else if(inputSpeedType==speedTypes[1]){
                convertedSpeed=inputSpeed; //mph to mph
            }
            else if(inputSpeedType==speedTypes[2]){
                convertedSpeed=inputSpeed*2.23693629; // m/s to mph
            }
            else if(inputSpeedType==speedTypes[3]){
                convertedSpeed=inputSpeed*3600; // miles per second to mph
            }
            else if(inputSpeedType==speedTypes[4]){
                //knots to mph
                convertedSpeed=inputSpeed*1.15077945;
            }
            else if(inputSpeedType==speedTypes[5]){
                //yard per second to mph
                convertedSpeed=inputSpeed*2.04545455;
            }
            else if(inputSpeedType==speedTypes[6]){
                //speed of light to mph
                convertedSpeed=inputSpeed*670616629;
            }
        }
        catch (Exception err){
            Log.e("toMph_error",err.toString());
        }
        return  convertedSpeed;
    }

}
