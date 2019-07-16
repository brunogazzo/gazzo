package br.com.targettrust.exerciciobanco.view;

import br.com.targettrust.exerciciobanco.infra.DadosSingleton;
import br.com.targettrust.exerciciobanco.model.Correntista;
import br.com.targettrust.exerciciobanco.model.Movimento;

import java.util.Objects;
import java.util.Scanner;

public class TelaMovimentos extends Tela implements TelaSomenteLeitura  {

    @Override
    public void abrirTela() {

        Correntista correntista = pedirCorrentista();

        System.out.println("Qual o tipo do movimento? ");
        String tipo = pedirTexto();
        System.out.println("Escreva o valor");
        Double valor = pedirValor();
        System.out.println("Escreva a descrição: ");
        String descricao = pedirTexto();
        Movimento movimento = new Movimento(tipo, valor, descricao);

        correntista.getConta().adicionarMovimento(movimento);

        System.out.println(correntista.obtemDescricao());
    }

    public Correntista pedirCorrentista(){
        Correntista[] correntistas = DadosSingleton.getInstance().getCorrentistas();

        System.out.println("Correntistas: ");

        int i = 0;
        for (Correntista c : correntistas){
            if(Objects.nonNull(c)){
                System.out.println(c.getClass().getSimpleName());
                System.out.println(i + " -> "+ c.obtemDescricao());
            }
            i++;
        }

        System.out.println("Digite o número do mesmo: ");
        int correntistaEscolhido = pedirNumero();
        return correntistas[correntistaEscolhido];

        //Outra forma:
//        for (int v = 0; v < correntistas.length-1; i++){
//            System.out.println(v + " -> "+ correntistas[v].obtemDescricao());
//        }

    }





}
