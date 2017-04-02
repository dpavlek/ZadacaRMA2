package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ResultActivity extends AppCompatActivity {

    private TextView tvConvertFrom,tvConvertTo,tvInputValue,tvOutputValue;
    String ConvertFrom,ConvertTo;
    Double InputValue,OutputValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        this.initUI();
    }

    private void initUI() {
        NumberFormat formatter = new DecimalFormat("0.#####E0");
        this.tvConvertFrom = (TextView) findViewById(R.id.tvConvertFrom);
        this.tvConvertTo = (TextView) findViewById(R.id.tvConvertTo);
        this.tvInputValue = (TextView) findViewById(R.id.tvValueFrom);
        this.tvOutputValue = (TextView) findViewById(R.id.tvValueTo);
        Intent StartIntent = this.getIntent();
        ConvertFrom = StartIntent.getStringExtra(SpeedActivity.ID_ITYPE);
        ConvertTo = StartIntent.getStringExtra(SpeedActivity.ID_OTYPE);
        InputValue = StartIntent.getDoubleExtra(SpeedActivity.ID_IVALUE,0);
        OutputValue = StartIntent.getDoubleExtra(SpeedActivity.ID_OVALUE,0);
        tvConvertTo.setText(ConvertTo);
        tvConvertFrom.setText(ConvertFrom);
        tvInputValue.setText(String.format("%.2f",InputValue));
        if (OutputValue > 100000 || OutputValue<0.001) {
            tvOutputValue.setText(formatter.format(OutputValue));
        }
        else{
            tvOutputValue.setText(String.format("%.2f",OutputValue));
        }

    }
}
