package com.example.leandrocavalcanti.pgm_ex_view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.leandrocavalcanti.pgm_ex_view.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNextPage1;
    private Button btnCancelarContrato;
    private Button btnMudarCamisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("myTag", "Iniciou");
        pegarReferencias();
    }

    private void pegarReferencias() {
        btnNextPage1 = (Button) findViewById(R.id.btnNextPage1);
        btnCancelarContrato = (Button) findViewById(R.id.btnCancelarContrato);
        btnMudarCamisa = (Button) findViewById(R.id.btnMudarCamisa);
        Log.d("myTag2", "Pegou Referencias");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNextPage1:
                Log.d("myTag5", "Entrou no Switch botao next");
                Intent i = new Intent(MainActivity.this, Tela2Activity.class);
                startActivity(i);

            case R.id.btnCancelarContrato:

            case R.id.btnMudarCamisa:

        }
    }


}
