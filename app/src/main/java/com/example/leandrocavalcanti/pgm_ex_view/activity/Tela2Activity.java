package com.example.leandrocavalcanti.pgm_ex_view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import com.example.leandrocavalcanti.pgm_ex_view.R;
import com.example.leandrocavalcanti.pgm_ex_view.domain.Jogador;

public class Tela2Activity extends AppCompatActivity implements View.OnClickListener{

    private Jogador jogador;
    private CheckBox chkFalta;
    private CheckBox chkPenalty;
    private Switch switchTitular;
    private Button tela2BtnPrint;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        pegarReferencias();
        listenar();

    }

    private void listenar() {
        tela2BtnPrint.setOnClickListener(this);
    }

    private void pegarReferencias() {
        chkFalta = (CheckBox) findViewById(R.id.checkBoxFalta);
        chkPenalty = (CheckBox) findViewById(R.id.checkBoxPenalty);
        switchTitular = (Switch) findViewById(R.id.switchTitular);
        tela2BtnPrint = (Button) findViewById(R.id.tela2BtnPrint);
        seekBar = (SeekBar) findViewById(R.id.seekBarSpeed);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.tela2BtnPrint:
                try {
                    imprimirJogador();
                } catch (Exception e) {
                    Toast.makeText(this, "Erro: \n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void imprimirJogador() throws Exception {
        jogador = new Jogador();
        jogador.setNome("Neymar");
        jogador.setVelocidade(seekBar.getProgress());

        Toast.makeText(this, jogador.getNome() + "\nVelocidade: \n" + jogador.getVelocidade()
        ,Toast.LENGTH_LONG).show();


    }




}
