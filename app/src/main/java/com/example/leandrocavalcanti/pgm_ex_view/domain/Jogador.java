package com.example.leandrocavalcanti.pgm_ex_view.domain;

/**
 * Created by leandro.cavalcanti on 05/10/2017.
 */

public class Jogador {

    private Boolean isContratado;
    private Boolean isBatedorFalta;
    private Boolean isBatedorPenalty;
    private Boolean isTitular;
    private Integer camisa;
    private Boolean isAquecido;
    private Integer velocidade;
    private String corChuteira;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getContratado() {
        return isContratado;
    }

    public void setContratado(Boolean contratado) {
        isContratado = contratado;
    }

    public Boolean getBatedorFalta() {
        return isBatedorFalta;
    }

    public void setBatedorFalta(Boolean batedorFalta) {
        isBatedorFalta = batedorFalta;
    }

    public Boolean getBatedorPenalty() {
        return isBatedorPenalty;
    }

    public void setBatedorPenalty(Boolean batedorPenalty) {
        isBatedorPenalty = batedorPenalty;
    }

    public Boolean getTitular() {
        return isTitular;
    }

    public void setTitular(Boolean titular) {
        isTitular = titular;
    }

    public Integer getCamisa() {
        return camisa;
    }

    public void setCamisa(Integer camisa) {
        this.camisa = camisa;
    }

    public Boolean getAquecido() {
        return isAquecido;
    }

    public void setAquecido(Boolean aquecido) {
        isAquecido = aquecido;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public String getCorChuteira() {
        return corChuteira;
    }

    public void setCorChuteira(String corChuteira) {
        this.corChuteira = corChuteira;
    }

    public Jogador() {
    }



    public Jogador(Boolean isContratado, Boolean isBatedorFalta, Boolean isBatedorPenalty, Boolean isTitular, Integer camisa, Boolean isAquecido, Integer velocidade, String corChuteira) {
        this.isContratado = isContratado;
        this.isBatedorFalta = isBatedorFalta;
        this.isBatedorPenalty = isBatedorPenalty;
        this.isTitular = isTitular;
        this.camisa = camisa;
        this.isAquecido = isAquecido;
        this.velocidade = velocidade;
        this.corChuteira = corChuteira;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jogador jogador = (Jogador) o;

        if (isContratado != null ? !isContratado.equals(jogador.isContratado) : jogador.isContratado != null)
            return false;
        if (isBatedorFalta != null ? !isBatedorFalta.equals(jogador.isBatedorFalta) : jogador.isBatedorFalta != null)
            return false;
        if (isBatedorPenalty != null ? !isBatedorPenalty.equals(jogador.isBatedorPenalty) : jogador.isBatedorPenalty != null)
            return false;
        if (isTitular != null ? !isTitular.equals(jogador.isTitular) : jogador.isTitular != null)
            return false;
        if (getCamisa() != null ? !getCamisa().equals(jogador.getCamisa()) : jogador.getCamisa() != null)
            return false;
        if (isAquecido != null ? !isAquecido.equals(jogador.isAquecido) : jogador.isAquecido != null)
            return false;
        if (getVelocidade() != null ? !getVelocidade().equals(jogador.getVelocidade()) : jogador.getVelocidade() != null)
            return false;
        if (getCorChuteira() != null ? !getCorChuteira().equals(jogador.getCorChuteira()) : jogador.getCorChuteira() != null)
            return false;
        return getNome() != null ? getNome().equals(jogador.getNome()) : jogador.getNome() == null;

    }

    @Override
    public int hashCode() {
        int result = isContratado != null ? isContratado.hashCode() : 0;
        result = 31 * result + (isBatedorFalta != null ? isBatedorFalta.hashCode() : 0);
        result = 31 * result + (isBatedorPenalty != null ? isBatedorPenalty.hashCode() : 0);
        result = 31 * result + (isTitular != null ? isTitular.hashCode() : 0);
        result = 31 * result + (getCamisa() != null ? getCamisa().hashCode() : 0);
        result = 31 * result + (isAquecido != null ? isAquecido.hashCode() : 0);
        result = 31 * result + (getVelocidade() != null ? getVelocidade().hashCode() : 0);
        result = 31 * result + (getCorChuteira() != null ? getCorChuteira().hashCode() : 0);
        result = 31 * result + (getNome() != null ? getNome().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
