package com.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox cbAndroid;
    private CheckBox cbIos;
    private CheckBox cbWindows;
    private Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
    }

    private void initControls() {
        cbAndroid = (CheckBox) findViewById(R.id.cbAndroid);
        cbIos = (CheckBox) findViewById(R.id.cbIos);
        cbWindows = (CheckBox) findViewById(R.id.cbWindows);
        btnShow = (Button) findViewById(R.id.btnShow);
        btnShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnShow:

                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(cbAndroid.isChecked() ? "Android is checked" : "Android is unchecked");
                stringBuffer.append(cbIos.isChecked() ? "\nIos is checked" : "\nIos is unchecked");
                stringBuffer.append(cbWindows.isChecked() ? "\nWindows is checked" : "\nWindows is unchecked");

                Toast.makeText(this, stringBuffer, Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}