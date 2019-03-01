package com.gzeinnumer.bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edit)
    EditText edit;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        Intent intent = new Intent(getApplicationContext(), Second.class);
        String temp = edit.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("myname", temp);

        intent.putExtras(bundle);

        startActivity(intent);

    }
}
