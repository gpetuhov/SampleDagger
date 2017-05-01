package com.gpetuhov.android.sampledagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gpetuhov.android.sampledagger.utils.UtilsPref;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject UtilsPref utilsPref;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleDaggerApp.getAppComponent().inject(this);

        utilsPref.setMainButtonName("Press me");

        button = (Button) findViewById(R.id.button);
        button.setText(utilsPref.getMainButtonName());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}
