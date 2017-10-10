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
    private SeekBar seekBarVelocidade;
    private Bundle extras;
    private boolean falta;
    private boolean penalty;
    private boolean titular;
    private Switch switchAquecido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        pegarReferencias();
        listenar();
        pegarExtras();

        jogador = new Jogador();
        jogador.setBatedorFalta(falta);
        jogador.setBatedorPenalty(penalty);
        jogador.setTitular(titular);
    }

    private void pegarExtras() {
        extras = getIntent().getExtras();
        falta = extras.getBoolean("falta");
        penalty = extras.getBoolean("penalty");
        titular = extras.getBoolean("titular");
    }

    private void listenar() {
        tela2BtnPrint.setOnClickListener(this);
    }

    private void pegarReferencias() {
        chkFalta = (CheckBox) findViewById(R.id.checkBoxFalta);
        chkPenalty = (CheckBox) findViewById(R.id.checkBoxPenalty);
        switchTitular = (Switch) findViewById(R.id.switchTitular);
        tela2BtnPrint = (Button) findViewById(R.id.tela2BtnPrint);
        seekBarVelocidade = (SeekBar) findViewById(R.id.seekBarSpeed);
        switchAquecido = (Switch) findViewById(R.id.switchAquecido);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.tela2BtnPrint:
                try {
                    imprimirJogador();
                } catch (Exception e) {
                    Toast.makeText(this, "Erro: \n" + e.getMessage(), Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

      private void imprimirJogador() throws Exception {
        jogador.setNome("Neymar");

        jogador.setVelocidade(seekBarVelocidade.getProgress());
        jogador.setAquecido(switchAquecido.isChecked());


        Toast.makeText(this, jogador.getNome() + "\nVelocidade: \n" + jogador.getVelocidade() + "\nBatedor de Falta: " + jogador.getBatedorFalta().toString() + "\nBatedor de Penalty: " + jogador.getBatedorPenalty() + "\nTitular: " + jogador.getTitular() + "\nAquecido: " + jogador.getAquecido()
        ,Toast.LENGTH_LONG).show();


    }




}
