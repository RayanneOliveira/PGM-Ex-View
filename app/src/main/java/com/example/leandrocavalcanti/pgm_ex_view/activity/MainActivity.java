package com.example.leandrocavalcanti.pgm_ex_view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

import com.example.leandrocavalcanti.pgm_ex_view.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNextPage1;
    private CheckBox chkFalta;
    private CheckBox chkPenalty;
    private Switch switchTitular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pegarReferencias();
        listenar();
    }

    private void listenar() {
        btnNextPage1.setOnClickListener(this);
    }

    private void pegarReferencias() {
        btnNextPage1 = (Button) findViewById(R.id.btnNextPage1);
        chkFalta = (CheckBox) findViewById(R.id.checkBoxFalta);
        chkPenalty = (CheckBox) findViewById(R.id.checkBoxPenalty);
        switchTitular = (Switch) findViewById(R.id.switchTitular);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNextPage1:
                Intent i = new Intent(MainActivity.this, Tela2Activity.class);
                boolean falta;
                boolean penalty;
                boolean titular;
                if (chkFalta.isChecked()) {
                    falta = true;
                } else {
                    falta = false;
                }
                if (chkPenalty.isChecked()) {
                    penalty = true;
                } else {
                    penalty = false;
                }
                if (switchTitular.isChecked()) {
                    titular = true;
                } else {
                    titular = false;
                }
                Toast.makeText(this, "Falta: " + falta + "\nPenalty: " + penalty + "\nTitular: " + titular, Toast.LENGTH_SHORT).show();
                i.putExtra("falta", falta);
                i.putExtra("penalty", penalty);
                i.putExtra("titular", titular);
                startActivity(i);
                break;

        }
    }


}
