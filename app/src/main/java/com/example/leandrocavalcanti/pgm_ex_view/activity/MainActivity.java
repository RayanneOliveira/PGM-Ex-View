package com.example.leandrocavalcanti.pgm_ex_view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.leandrocavalcanti.pgm_ex_view.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNextPage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNextPage1 = (Button) findViewById(R.id.btnNextPage1);
        btnNextPage1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNextPage1:
                Intent i = new Intent(MainActivity.this, Tela2Activity.class);
                startActivity(i);
                break;

        }
    }


}
