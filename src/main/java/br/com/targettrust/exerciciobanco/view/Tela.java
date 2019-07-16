package br.com.targettrust.exerciciobanco.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Tela {


    public Integer pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException nf) {
            System.out.println("Insira um numero válido");
            return pedirNumero();
        }
    }

    public String pedirTexto(){
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextLine();
        }catch (InputMismatchException nf){
            System.out.println("Insira um numero válido");
            return pedirTexto();
        }

    }
    public Double pedirValor() {
try{
    return new Scanner(System.in).nextDouble();
}catch (InputMismatchException nf){
    System.out.println("Insira um numero válido");
    return pedirValor();
}


    }
   public abstract void abrirTela();
}
