package com.gzeinnumer.bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Second extends AppCompatActivity {

    @BindView(R.id.view)
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String temp = bundle.getString("myname");
        view.setText(temp);
    }
}
