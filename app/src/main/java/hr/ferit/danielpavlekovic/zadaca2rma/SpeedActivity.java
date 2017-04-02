package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SpeedActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String ID_ITYPE="input_type";
    public final static String ID_OTYPE="output_type";
    public final static String ID_IVALUE="input_value";
    public final static String ID_OVALUE="output_value";

    Spinner speedInput, speedOutput;
    Button btnConvertSpeed;
    EditText etSpeedToConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        initializeUI();
    }

    private void initializeUI() {
        this.speedInput = (Spinner) findViewById(R.id.spnSpeedInput);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.SpeedUnits, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        speedInput.setAdapter(adapter);
        speedInput.setSelection(0);
        speedOutput = (Spinner) findViewById(R.id.spnSpeedOutput);
        speedOutput.setAdapter(adapter);
        speedOutput.setSelection(0);
        this.btnConvertSpeed = (Button) findViewById(R.id.btnConvertSpeed);
        this.etSpeedToConvert = (EditText) findViewById(R.id.etInputedSpeed);
        this.btnConvertSpeed.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Speed speed = new Speed(this);
        Double inSpeed,outSpeed;
        inSpeed=Double.parseDouble(etSpeedToConvert.getText().toString());
        speed.setInput(inSpeed,speedInput.getSelectedItem().toString(),speedOutput.getSelectedItem().toString());
        outSpeed=speed.Convert();
        Intent resultIntent = new Intent(getApplicationContext(),ResultActivity.class);
        resultIntent.putExtra(ID_ITYPE,speed.getInputSpeedType());
        resultIntent.putExtra(ID_OTYPE,speed.getOutputSpeedType());
        resultIntent.putExtra(ID_IVALUE,inSpeed);
        resultIntent.putExtra(ID_OVALUE,outSpeed);
        this.startActivity(resultIntent);
    }
}
