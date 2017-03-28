package hr.ferit.danielpavlekovic.zadaca2rma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpeedActivity extends AppCompatActivity {

    Spinner speedInput, speedOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        initializeUI();
    }

    private void initializeUI() {
        speedInput = (Spinner) findViewById(R.id.spnSpeedInput);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.SpeedUnits, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        speedInput.setAdapter(adapter);
        speedInput.setSelection(0);
    }
}
