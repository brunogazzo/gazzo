package br.com.targettrust.exerciciobanco.view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
public class ExemploCollection{

public static void main(String[]args) {
ArrayList<Integer> array = new ArrayList();
int multiplo=1;
   for (int i=0; i <=1000; i++){

        multiplo += 3;
       array.add(multiplo);
        }
    while (array.iterator().hasNext()==true){
        System.out.println(array.iterator().next());
        continue;
    }

    }
}
