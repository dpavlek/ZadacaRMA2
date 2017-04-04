package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Context;
import android.util.Log;

import static java.lang.Math.pow;

/**
 * Created by danielpavlekovic on 04.04.2017..
 */

class distance {
    private Context context;

    private String inputDistanceType;
    private Double inputDistance;
    private String outputDistanceType;
    private String[] DistanceTypes;

    public distance(Context c_context){
        context=c_context;
        DistanceTypes = context.getResources().getStringArray(R.array.DistanceUnits);
    }

    public void setInput(Double i_Distance, String i_type, String o_type){
        inputDistance = i_Distance;
        inputDistanceType = i_type;
        outputDistanceType=o_type;
    }

    public String getInputDistanceType(){
        return inputDistanceType;
    }

    public String getOutputDistanceType(){
        return outputDistanceType;
    }

    public Double Convert(){
        Double convertedDistance=0.0;
        try {
            if (outputDistanceType.equals(DistanceTypes[0])) { //km
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance; //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance *1.609344; //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance / 100000; //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance / 1000000; //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance / 10000;
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance / 3280.8399;
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance / 1093.6133;
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance/39370.0787;
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance*(1.05702341 * pow(10, 13));
                }
            }
            else if (outputDistanceType.equals(DistanceTypes[1])) { //mi
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance/1.609344; //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance; //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance / 160934.4; //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance / 1609344; //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance / 16093.44;
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance / 5280;
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance / 1760;
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance/63360;
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance*(1.70111428 * pow(10, 13));
                }
            }
            else if (outputDistanceType.equals(DistanceTypes[2])) { //cm
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance*100000; //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance *160934.4; //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance; //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance / 10; //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance *10;
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance *30.48;
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance *91.44;
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance*2.54;
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance*(1.05702341 * pow(10, 18));
                }
            }
            else if (outputDistanceType.equals(DistanceTypes[3])) { //mm
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance*1000000; //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance *1609344; //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance*10; //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance; //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance *100;
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance *304.8;
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance *914.4;
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance*25.4;
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance*(9.4605284 * pow(10, 18));
                }
            }
            else if (outputDistanceType.equals(DistanceTypes[4])) { //dm
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance*10000; //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance *16093.44; //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance/10; //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance/100; //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance;
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance *3.048;
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance *9.144;
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance*0.254;
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance*(9.4605284 * pow(10, 16));
                }
            }
            else if (outputDistanceType.equals(DistanceTypes[5])) { //ft
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance*3280.8399; //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance *5280; //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance*0.032808399; //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance*0.0032808399; //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance*0.32808399;
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance;
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance *3;
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance*0.0833333333;
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance*(3.1038479 * pow(10, 16));
                }
            }
            else if (outputDistanceType.equals(DistanceTypes[6])) { //yd
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance*1093.6133; //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance *1760; //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance*0.010936133; //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance*0.0010936133; //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance*0.10936133;
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance/3;
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance;
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance*0.0277777778;
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance*(1.03461597 * pow(10, 16));
                }
            }
            else if (outputDistanceType.equals(DistanceTypes[7])) { //in
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance*39370.0787; //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance *63360; //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance*0.393700787; //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance*0.0393700787; //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance*3.93700787;
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance*12;
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance*36;
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance;
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance*(3.72461748 * pow(10, 17));
                }
            }
            else if (outputDistanceType.equals(DistanceTypes[8])) { //ly
                if (inputDistanceType.equals(DistanceTypes[0])) {
                    convertedDistance = inputDistance*(1.05702341 * pow(10, -13)); //to km
                } else if (inputDistanceType.equals(DistanceTypes[1])) {
                    convertedDistance = inputDistance *(1.70111428 * pow(10, -13)); //to mi
                } else if (inputDistanceType .equals(DistanceTypes[2]) ) {
                    convertedDistance = inputDistance*(1.05702341 * pow(10, -18)); //to cm
                } else if (inputDistanceType .equals(DistanceTypes[3])) {
                    convertedDistance = inputDistance*(1.05702341 * pow(10, -19)); //to mm
                } else if (inputDistanceType .equals(DistanceTypes[4])) {
                    //to dm
                    convertedDistance = inputDistance*(1.05702341 * pow(10, -17));
                } else if (inputDistanceType .equals(DistanceTypes[5]) ) {
                    //to ft
                    convertedDistance = inputDistance*(3.22180736 * pow(10, -17));
                } else if (inputDistanceType .equals(DistanceTypes[6]) ) {
                    //to yd
                    convertedDistance = inputDistance*(9.66542207 * pow(10, -17));
                } else if(inputDistanceType.equals(DistanceTypes[7])){
                    //to in
                    convertedDistance=inputDistance*(2.68483946 * pow(10, -18));
                } else if(inputDistanceType.equals(DistanceTypes[8])){
                    //to ly
                    convertedDistance=inputDistance;
                }
            }

        }
        catch (Exception err){
            Log.e("Convert_error",err.toString());
        }
        return  convertedDistance;
    }
}
