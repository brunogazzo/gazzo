package br.com.targettrust.exerciciobanco.model;

import java.util.Objects;

public class Conta {

//    public Conta(){
//    }

    public Conta(Integer agencia, Integer numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0D;
        this.movimentos = new Movimento[100];
    }

    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private Movimento[] movimentos;
//    private int movimentoAtual;

    public String toString() {

        String textoMovimentos = "";
        for (int i = 0; i < movimentos.length; i++) {
            if(Objects.nonNull(movimentos[i])){
                textoMovimentos += "\n";
                textoMovimentos += movimentos[i].getDescricaoCompleta();
            }
        }

        return String.format(
                "Agência: %s, Número: %s, Saldo: %s, Movimentos: %s",
                this.agencia, this.numero, this.saldo, textoMovimentos);
    }

    public void adicionarMovimento(Movimento movimento) {
        int posicaoAtual = obtemPosicaoAtual();
        if(posicaoAtual == -1){
            System.out.println("Não há mais movimentos disponíveis!");
            return;
        }
        movimentos[posicaoAtual] = movimento;
    }

    private int obtemPosicaoAtual() {
//        int comprimentoDoArray = movimentos.length;
        for (int i = 0; i < movimentos.length-1; i++) {
            Movimento movimento = movimentos[i];
            if(Objects.isNull(movimento)){
                return i;
            }
        }
        return -1;
    }
}
