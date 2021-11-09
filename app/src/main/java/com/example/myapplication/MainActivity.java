package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        Button enter = (Button) findViewById(R.id.enter);
        EditText YearEnter = (EditText) findViewById(R.id.YearEnter);
        EditText MonthEnter = (EditText) findViewById(R.id.MonthEnter);
        EditText DayEnter = (EditText) findViewById(R.id.DayEnter);
        EditText HourEnter = (EditText) findViewById(R.id.HourEnter);
        EditText MinEnter = (EditText) findViewById(R.id.MinEnter);
        EditText SecEnter = (EditText) findViewById(R.id.SecEnter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String YE = YearEnter.getText().toString();
                String ME = MonthEnter.getText().toString();
                String DE = DayEnter.getText().toString();
                String HE = HourEnter.getText().toString();
                String MinE = MinEnter.getText().toString();
                String SE = SecEnter.getText().toString();
                TextView message = (TextView) findViewById(R.id.clock);
                message.setText(YE+"年"+ME+"月"+DE+"日 "+HE+":"+MinE+":"+SE);
            }
        });
    }
}