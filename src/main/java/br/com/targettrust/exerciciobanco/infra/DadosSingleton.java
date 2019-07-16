package br.com.targettrust.exerciciobanco.infra;

import br.com.targettrust.exerciciobanco.model.Correntista;

public class DadosSingleton {
    private int correntistaAtual;
    private Correntista[] correntistas;
    private static DadosSingleton dadosSingleton;

    private DadosSingleton(){
        System.out.println("Fui inicializado...."+getClass().getName());

        this.correntistas = new Correntista[100];
        this.correntistaAtual = 0;
    }

    public static DadosSingleton getInstance(){
        if(dadosSingleton == null){
            dadosSingleton = new DadosSingleton();
        }
        return dadosSingleton;
    }

    public void adicionaCorrentista(Correntista correntista){
        this.correntistas[this.correntistaAtual++] = correntista;
    }

    public Correntista[] getCorrentistas(){
        return correntistas;
    }

}
