package com.example.leandrocavalcanti.pgm_ex_view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.leandrocavalcanti.pgm_ex_view.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNextPage1:
//                Intent i = new Intent(MainActivity.this, Tela2Activity.class);
//                startActivity(i);
                Toast.makeText(this, "skfaklsfaskl", Toast.LENGTH_SHORT).show();
                break;

        }
    }


}
