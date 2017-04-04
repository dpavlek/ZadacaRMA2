package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Context;
import android.util.Log;

import static java.lang.Math.pow;

/**
 * Created by danielpavlekovic on 04.04.2017..
 */

class Currency {
    private Context context;

    private String inputCurrencyType;
    private Double inputCurrency;
    private String outputCurrencyType;
    private String[] CurrencyTypes;

    public Currency(Context c_context){
        context=c_context;
        CurrencyTypes = context.getResources().getStringArray(R.array.CurrencyUnits);
    }

    public void setInput(Double i_Currency, String i_type, String o_type){
        inputCurrency = i_Currency;
        inputCurrencyType = i_type;
        outputCurrencyType=o_type;
    }

    public String getInputCurrencyType(){
        return inputCurrencyType;
    }

    public String getOutputCurrencyType(){
        return outputCurrencyType;
    }

    public Double Convert(){
        Double convertedCurrency=0.0;
        try {
            if (outputCurrencyType.equals(CurrencyTypes[0])) { //Euro
                if (inputCurrencyType.equals(CurrencyTypes[0])) {
                    convertedCurrency = inputCurrency; //to Euro
                } else if (inputCurrencyType.equals(CurrencyTypes[1])) {
                    convertedCurrency = inputCurrency *0.938579366; //to USD
                } else if (inputCurrencyType .equals(CurrencyTypes[2]) ) {
                    convertedCurrency = inputCurrency *0.937173374; //to CHF
                } else if (inputCurrencyType .equals(CurrencyTypes[3])) {
                    convertedCurrency = inputCurrency * 0.708721279; //to AUD
                } else if (inputCurrencyType .equals(CurrencyTypes[4])) {
                    //to CAD
                    convertedCurrency = inputCurrency * 0.697364469;
                } else if (inputCurrencyType .equals(CurrencyTypes[5]) ) {
                    //to HRK
                    convertedCurrency = inputCurrency * 0.134448678;
                } else if (inputCurrencyType .equals(CurrencyTypes[6]) ) {
                    //to RSD
                    convertedCurrency = inputCurrency * 0.00807459829;
                } else if(inputCurrencyType.equals(CurrencyTypes[7])){
                    //to BAM
                    convertedCurrency=inputCurrency*0.511292;
                }
            }
            else if (outputCurrencyType.equals(CurrencyTypes[1])) { //USD
                if (inputCurrencyType.equals(CurrencyTypes[0])) {
                    convertedCurrency = inputCurrency*1.06544; //to Euro
                } else if (inputCurrencyType.equals(CurrencyTypes[1])) {
                    convertedCurrency = inputCurrency *1; //to USD
                } else if (inputCurrencyType .equals(CurrencyTypes[2]) ) {
                    convertedCurrency = inputCurrency *0.998502; //to CHF
                } else if (inputCurrencyType .equals(CurrencyTypes[3])) {
                    convertedCurrency = inputCurrency * 0.7551; //to AUD
                } else if (inputCurrencyType .equals(CurrencyTypes[4])) {
                    //to CAD
                    convertedCurrency = inputCurrency * 0.743;
                } else if (inputCurrencyType .equals(CurrencyTypes[5]) ) {
                    //to HRK
                    convertedCurrency = inputCurrency * 0.143247;
                } else if (inputCurrencyType .equals(CurrencyTypes[6]) ) {
                    //to RSD
                    convertedCurrency = inputCurrency * 0.008603;
                } else if(inputCurrencyType.equals(CurrencyTypes[7])){
                    //to BAM
                    convertedCurrency=inputCurrency*0.55;
                }
            }
            else if (outputCurrencyType.equals(CurrencyTypes[2])) { //CHF
                if (inputCurrencyType.equals(CurrencyTypes[0])) {
                    convertedCurrency = inputCurrency*1.06703842; //to Euro
                } else if (inputCurrencyType.equals(CurrencyTypes[1])) {
                    convertedCurrency = inputCurrency *1.00150025; //to USD
                } else if (inputCurrencyType .equals(CurrencyTypes[2]) ) {
                    convertedCurrency = inputCurrency *1; //to CHF
                } else if (inputCurrencyType .equals(CurrencyTypes[3])) {
                    convertedCurrency = inputCurrency * 0.756232837; //to AUD
                } else if (inputCurrencyType .equals(CurrencyTypes[4])) {
                    //to CAD
                    convertedCurrency = inputCurrency * 0.744114684;
                } else if (inputCurrencyType .equals(CurrencyTypes[5]) ) {
                    //to HRK
                    convertedCurrency = inputCurrency * 0.143461906;
                } else if (inputCurrencyType .equals(CurrencyTypes[6]) ) {
                    //to RSD
                    convertedCurrency = inputCurrency * 0.00861590663;
                } else if(inputCurrencyType.equals(CurrencyTypes[7])){
                    //to BAM
                    convertedCurrency=inputCurrency*0.55;
                }
            }
            else if (outputCurrencyType.equals(CurrencyTypes[3])) { //AUD
                if (inputCurrencyType.equals(CurrencyTypes[0])) {
                    convertedCurrency = inputCurrency*1.41099192; //to Euro
                } else if (inputCurrencyType.equals(CurrencyTypes[1])) {
                    convertedCurrency = inputCurrency *1.3243279; //to USD
                } else if (inputCurrencyType .equals(CurrencyTypes[2]) ) {
                    convertedCurrency = inputCurrency *1.32234406; //to CHF
                } else if (inputCurrencyType .equals(CurrencyTypes[3])) {
                    convertedCurrency = inputCurrency * 1; //to AUD
                } else if (inputCurrencyType .equals(CurrencyTypes[4])) {
                    //to CAD
                    convertedCurrency = inputCurrency * 0.983975632;
                } else if (inputCurrencyType .equals(CurrencyTypes[5]) ) {
                    //to HRK
                    convertedCurrency = inputCurrency * 0.189705999;
                } else if (inputCurrencyType .equals(CurrencyTypes[6]) ) {
                    //to RSD
                    convertedCurrency = inputCurrency * 0.011393193;
                } else if(inputCurrencyType.equals(CurrencyTypes[7])){
                    //to BAM
                    convertedCurrency=inputCurrency*0.72;
                }
            }
            else if (outputCurrencyType.equals(CurrencyTypes[4])) { //CAD
                if (inputCurrencyType.equals(CurrencyTypes[0])) {
                    convertedCurrency = inputCurrency*1.43397039; //to Euro
                } else if (inputCurrencyType.equals(CurrencyTypes[1])) {
                    convertedCurrency = inputCurrency *1.34589502; //to USD
                } else if (inputCurrencyType .equals(CurrencyTypes[2]) ) {
                    convertedCurrency = inputCurrency *1.34387887; //to CHF
                } else if (inputCurrencyType .equals(CurrencyTypes[3])) {
                    convertedCurrency = inputCurrency * 1.01628533; //to AUD
                } else if (inputCurrencyType .equals(CurrencyTypes[4])) {
                    //to CAD
                    convertedCurrency = inputCurrency * 1;
                } else if (inputCurrencyType .equals(CurrencyTypes[5]) ) {
                    //to HRK
                    convertedCurrency = inputCurrency * 0.192795424;
                } else if (inputCurrencyType .equals(CurrencyTypes[6]) ) {
                    //to RSD
                    convertedCurrency = inputCurrency * 0.0115787349;
                } else if(inputCurrencyType.equals(CurrencyTypes[7])){
                    //to BAM
                    convertedCurrency=inputCurrency*0.73;
                }
            }
            else if (outputCurrencyType.equals(CurrencyTypes[5])) { //HRK
                if (inputCurrencyType.equals(CurrencyTypes[0])) {
                    convertedCurrency = inputCurrency*7.43778229; //to Euro
                } else if (inputCurrencyType.equals(CurrencyTypes[1])) {
                    convertedCurrency = inputCurrency *6.98094899; //to USD
                } else if (inputCurrencyType .equals(CurrencyTypes[2]) ) {
                    convertedCurrency = inputCurrency *6.97049153; //to CHF
                } else if (inputCurrencyType .equals(CurrencyTypes[3])) {
                    convertedCurrency = inputCurrency * 5.27131458; //to AUD
                } else if (inputCurrencyType .equals(CurrencyTypes[4])) {
                    //to CAD
                    convertedCurrency = inputCurrency * 5.1868451;
                } else if (inputCurrencyType .equals(CurrencyTypes[5]) ) {
                    //to HRK
                    convertedCurrency = inputCurrency * 1;
                } else if (inputCurrencyType .equals(CurrencyTypes[6]) ) {
                    //to RSD
                    convertedCurrency = inputCurrency * 0.0600571042;
                } else if(inputCurrencyType.equals(CurrencyTypes[7])){
                    //to BAM
                    convertedCurrency=inputCurrency*3.81;
                }
            }
            else if (outputCurrencyType.equals(CurrencyTypes[6])) { //RSD
                if (inputCurrencyType.equals(CurrencyTypes[0])) {
                    convertedCurrency = inputCurrency*123.84517; //to Euro
                } else if (inputCurrencyType.equals(CurrencyTypes[1])) {
                    convertedCurrency = inputCurrency *116.238521; //to USD
                } else if (inputCurrencyType .equals(CurrencyTypes[2]) ) {
                    convertedCurrency = inputCurrency *116.064396; //to CHF
                } else if (inputCurrencyType .equals(CurrencyTypes[3])) {
                    convertedCurrency = inputCurrency * 87.7717075; //to AUD
                } else if (inputCurrencyType .equals(CurrencyTypes[4])) {
                    //to CAD
                    convertedCurrency = inputCurrency * 86.3652214;
                } else if (inputCurrencyType .equals(CurrencyTypes[5]) ) {
                    //to HRK
                    convertedCurrency = inputCurrency * 16.6508195;
                } else if (inputCurrencyType .equals(CurrencyTypes[6]) ) {
                    //to RSD
                    convertedCurrency = inputCurrency * 1;
                } else if(inputCurrencyType.equals(CurrencyTypes[7])){
                    //to BAM
                    convertedCurrency=inputCurrency*63.32;
                }
            }
            else if (outputCurrencyType.equals(CurrencyTypes[7])) { //BAM
                if (inputCurrencyType.equals(CurrencyTypes[0])) {
                    convertedCurrency = inputCurrency/0.511292; //to Euro
                } else if (inputCurrencyType.equals(CurrencyTypes[1])) {
                    convertedCurrency = inputCurrency /0.55; //to USD
                } else if (inputCurrencyType .equals(CurrencyTypes[2]) ) {
                    convertedCurrency = inputCurrency /0.55; //to CHF
                } else if (inputCurrencyType .equals(CurrencyTypes[3])) {
                    convertedCurrency = inputCurrency / 0.72; //to AUD
                } else if (inputCurrencyType .equals(CurrencyTypes[4])) {
                    //to CAD
                    convertedCurrency = inputCurrency / 0.73;
                } else if (inputCurrencyType .equals(CurrencyTypes[5]) ) {
                    //to HRK
                    convertedCurrency = inputCurrency / 3.81;
                } else if (inputCurrencyType .equals(CurrencyTypes[6]) ) {
                    //to RSD
                    convertedCurrency = inputCurrency /63.32;
                } else if(inputCurrencyType.equals(CurrencyTypes[7])){
                    //to BAM
                    convertedCurrency=inputCurrency/1;
                }
            }


        }
        catch (Exception err){
            Log.e("Convert_error",err.toString());
        }
        return  convertedCurrency;
    }
}
