package com.bjh.www.a1022_imagebutton_test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        aSwitch = (Switch) findViewById(R.id.switch1);

        setTitle("라이언");

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                    onClickWidget(aSwitch);
            }
        });
    }

    public void onClickWidget(View view) {
        String text = "라이언이다";
        Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT).show();     //Toast: 팝업창 띄우는 것
    }
}