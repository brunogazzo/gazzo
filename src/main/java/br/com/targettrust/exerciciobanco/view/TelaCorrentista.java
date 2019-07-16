package br.com.targettrust.exerciciobanco.view;

import br.com.targettrust.exerciciobanco.enumeration.TipoTelaEnum;
import br.com.targettrust.exerciciobanco.infra.DadosSingleton;
import br.com.targettrust.exerciciobanco.model.Conta;
import br.com.targettrust.exerciciobanco.model.Correntista;
import br.com.targettrust.exerciciobanco.model.CorrentistaPF;
import br.com.targettrust.exerciciobanco.model.CorrentistaPJ;

import java.util.Scanner;

public class TelaCorrentista extends Tela{

    private TipoTelaEnum tipoTela;

//    @Override
    public void abrirTela(){

        System.out.println("Informe a agencia: ");
        Integer agencia = pedirNumero();

        System.out.println("Informe o número da conta: ");
        Integer numero = pedirNumero();

        Conta conta = new Conta(agencia, numero);

        System.out.println("Informe o nome do correntista: ");
        String nomeCorrentista = pedirTexto();
        Correntista correntista;

        if(TipoTelaEnum.PF.equals(tipoTela)){
            System.out.println("Informe o tipo do documento: ");
            String tipoDocumento = this.pedirTexto();
            correntista = new CorrentistaPF(nomeCorrentista, conta, tipoDocumento);

        }else if(TipoTelaEnum.PJ.equals(tipoTela)){
            correntista = new CorrentistaPJ(nomeCorrentista, conta);
        }else{
            return;
        }
        String descricao = correntista.obtemDescricao();
        System.out.println(descricao);

        DadosSingleton.getInstance().adicionaCorrentista(correntista);
    }

    public void setTipoTela(TipoTelaEnum tipoTela) {
        this.tipoTela = tipoTela;
    }
}
