package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] myIntArray = new int [10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;


        double [] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println( myIntArray[2]);

        int[] firsTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firsTen[0]);
        int arrayLength = firsTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("Last of array = " + firsTen[arrayLength - 1]);

        int [] newArray;
        //newArray = new int [] {5,4,3,2,1};
        // outra versão é só declarar uma posição

        newArray = new int[5];
        for (int i = 0 ; i < newArray.length ; i++){
            newArray[i] = newArray.length - i;
        }
        // dessa forma, dentro do combo, tudo é gerado a partir dum valor setado acima
        //gerado propceduralmente a partir do For loop;
        for (int i = 0 ; i < newArray.length; i++ ){
            System.out.println(newArray[i] + " ");
        }

        //outra forma de utilizar é:
        System.out.println();
        for (int element : newArray){
            System.out.println(element + " ");
        }

        System.out.println(" opa ");
        //System.out.println(newArray);
        // o metodo acima causa bug na hora de printar, por isso é utilizado:
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if (objectVariable instanceof int []){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");


    }
}
