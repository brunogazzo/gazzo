import br.com.targettrust.exerciciobanco.enumeration.TipoTelaEnum;
import br.com.targettrust.exerciciobanco.model.Movimento;
import br.com.targettrust.exerciciobanco.view.Tela;
import br.com.targettrust.exerciciobanco.view.TelaCorrentista;
import br.com.targettrust.exerciciobanco.view.TelaMovimentos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Tela tela;
        while (true) {
            System.out.println("Escolha uma opção: 1- Correntista PF, 2- Correntista PJ, 3- Movimentos");
            Integer opcao = pedirNumero();
            if (opcao == null){
                continue;
            }

            switch (opcao) {
                case 1:
                    tela = new TelaCorrentista();
                    ((TelaCorrentista) tela).setTipoTela(TipoTelaEnum.PF);
                    break;

                case 2:
                    tela = new TelaCorrentista();
                    ((TelaCorrentista) tela).setTipoTela(TipoTelaEnum.valueOf("PJ"));
                    break;

                case 3:
                    tela = new TelaMovimentos();
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    continue;
            }
            tela.abrirTela();
        }
    }

    public static Integer pedirNumero(){
        Scanner scanner = new Scanner(System.in);
       try{
           return scanner.nextInt();
       }catch (InputMismatchException nf){
           System.out.println("Escolha uma opção válida!");
       }
return null;
    }

}
