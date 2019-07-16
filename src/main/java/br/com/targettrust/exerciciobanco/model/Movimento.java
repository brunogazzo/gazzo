package br.com.targettrust.exerciciobanco.model;

public class Movimento {

    public Movimento(String tipo, Double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
    }

    private String tipo;
    private Double valor;
    private String descricao;

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoCompleta(){
        return String.format("Tipo: %s, Descrição: %s, Valor: R$ %.2f", this.tipo, this.descricao, this.valor);
    }
}
