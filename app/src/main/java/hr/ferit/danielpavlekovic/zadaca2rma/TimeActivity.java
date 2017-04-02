package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class TimeActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String ID_ITYPE="input_type";
    public final static String ID_OTYPE="output_type";
    public final static String ID_IVALUE="input_value";
    public final static String ID_OVALUE="output_value";

    Spinner timeInput, timeOutput;
    Button btnConverttime;
    EditText ettimeToConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        initializeUI();
    }

    private void initializeUI() {
        this.timeInput = (Spinner) findViewById(R.id.spntimeInput);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.TimeUnits, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        timeInput.setAdapter(adapter);
        timeInput.setSelection(0);
        timeOutput = (Spinner) findViewById(R.id.spntimeOutput);
        timeOutput.setAdapter(adapter);
        timeOutput.setSelection(0);
        this.btnConverttime = (Button) findViewById(R.id.btnConverttime);
        this.ettimeToConvert = (EditText) findViewById(R.id.etInputedtime);
        this.btnConverttime.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        time time = new time(this);
        Double intime,outtime;
        intime=Double.parseDouble(ettimeToConvert.getText().toString());
        time.setInput(intime,timeInput.getSelectedItem().toString(),timeOutput.getSelectedItem().toString());
        outtime=time.Convert();
        Intent resultIntent = new Intent(getApplicationContext(),ResultActivity.class);
        resultIntent.putExtra(ID_ITYPE,time.getInputtimeType());
        resultIntent.putExtra(ID_OTYPE,time.getOutputtimeType());
        resultIntent.putExtra(ID_IVALUE,intime);
        resultIntent.putExtra(ID_OVALUE,outtime);
        this.startActivity(resultIntent);
    }
}
