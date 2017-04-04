package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CurrencyActivity extends AppCompatActivity implements View.OnClickListener {


    public final static String ID_ITYPE="input_type";
    public final static String ID_OTYPE="output_type";
    public final static String ID_IVALUE="input_value";
    public final static String ID_OVALUE="output_value";

    Spinner CurrencyInput, CurrencyOutput;
    Button btnConvertCurrency;
    EditText etCurrencyToConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        initializeUI();
    }

    private void initializeUI() {
        this.CurrencyInput = (Spinner) findViewById(R.id.spnCurrencyInput);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.CurrencyUnits, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CurrencyInput.setAdapter(adapter);
        CurrencyInput.setSelection(0);
        CurrencyOutput = (Spinner) findViewById(R.id.spnCurrencyOutput);
        CurrencyOutput.setAdapter(adapter);
        CurrencyOutput.setSelection(0);
        this.btnConvertCurrency = (Button) findViewById(R.id.btnConvertCurrency);
        this.etCurrencyToConvert = (EditText) findViewById(R.id.etInputedCurrency);
        this.btnConvertCurrency.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Currency Currency = new Currency(this);
        Double inCurrency,outCurrency;
        inCurrency=Double.parseDouble(etCurrencyToConvert.getText().toString());
        Currency.setInput(inCurrency,CurrencyInput.getSelectedItem().toString(),CurrencyOutput.getSelectedItem().toString());
        outCurrency=Currency.Convert();
        Intent resultIntent = new Intent(getApplicationContext(),ResultActivity.class);
        resultIntent.putExtra(ID_ITYPE,Currency.getInputCurrencyType());
        resultIntent.putExtra(ID_OTYPE,Currency.getOutputCurrencyType());
        resultIntent.putExtra(ID_IVALUE,inCurrency);
        resultIntent.putExtra(ID_OVALUE,outCurrency);
        this.startActivity(resultIntent);
    }


}
