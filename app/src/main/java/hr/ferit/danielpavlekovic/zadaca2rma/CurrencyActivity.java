package hr.ferit.danielpavlekovic.zadaca2rma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CurrencyActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnSpeed, btnCurrency, btnDistance, btnTime;
    Button btnSpeed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        initUI();
    }

    private void initUI() {
        this.btnCurrency = (ImageButton) findViewById(R.id.ibtnConvertCurrency);
        this.btnDistance = (ImageButton) findViewById(R.id.ibtnConvertDistance);
        this.btnSpeed = (ImageButton) findViewById(R.id.ibtnConvertSpeed);
        this.btnTime = (ImageButton) findViewById(R.id.ibtnConvertTime);
        this.btnSpeed2 = (Button) findViewById(R.id.btnSpeed);

        this.btnCurrency.setOnClickListener(this);
        this.btnTime.setOnClickListener(this);
        this.btnSpeed.setOnClickListener(this);
        this.btnDistance.setOnClickListener(this);
        this.btnSpeed2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent intentSpeed = new Intent();
        intentSpeed.setClass(getApplicationContext(),SpeedActivity.class);
        /*Intent intentCurrency = new Intent(getApplicationContext(),CurrencyActivity.class);
        Intent intentTime = new Intent(getApplicationContext(),TimeActivity.class);
        Intent intentDistance = new Intent(getApplicationContext(),DistanceActivity.class);*/
        this.startActivity(intentSpeed);
    }
}
