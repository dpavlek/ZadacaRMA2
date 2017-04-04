package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class DistanceActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String ID_ITYPE="input_type";
    public final static String ID_OTYPE="output_type";
    public final static String ID_IVALUE="input_value";
    public final static String ID_OVALUE="output_value";

    Spinner DistanceInput, DistanceOutput;
    Button btnConvertDistance;
    EditText etDistanceToConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        initializeUI();
    }

    private void initializeUI() {
        this.DistanceInput = (Spinner) findViewById(R.id.spnDistanceInput);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.DistanceUnits, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        DistanceInput.setAdapter(adapter);
        DistanceInput.setSelection(0);
        DistanceOutput = (Spinner) findViewById(R.id.spnDistanceOutput);
        DistanceOutput.setAdapter(adapter);
        DistanceOutput.setSelection(0);
        this.btnConvertDistance = (Button) findViewById(R.id.btnConvertDistance);
        this.etDistanceToConvert = (EditText) findViewById(R.id.etInputedDistance);
        this.btnConvertDistance.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        distance Distance = new distance(this);
        Double inDistance,outDistance;
        inDistance=Double.parseDouble(etDistanceToConvert.getText().toString());
        Distance.setInput(inDistance,DistanceInput.getSelectedItem().toString(),DistanceOutput.getSelectedItem().toString());
        outDistance=Distance.Convert();
        Intent resultIntent = new Intent(getApplicationContext(),ResultActivity.class);
        resultIntent.putExtra(ID_ITYPE,Distance.getInputDistanceType());
        resultIntent.putExtra(ID_OTYPE,Distance.getOutputDistanceType());
        resultIntent.putExtra(ID_IVALUE,inDistance);
        resultIntent.putExtra(ID_OVALUE,outDistance);
        this.startActivity(resultIntent);
    }
}
