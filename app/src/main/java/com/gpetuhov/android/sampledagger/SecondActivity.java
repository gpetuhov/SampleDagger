package com.gpetuhov.android.sampledagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.gpetuhov.android.sampledagger.utils.TextFiller;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject TextFiller textFiller;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SampleDaggerApp.getSecondComponent().inject(this);

        textView = (TextView) findViewById(R.id.textview);
        textView.setText(textFiller.getText());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        SampleDaggerApp.clearSecondComponent();
    }
}
