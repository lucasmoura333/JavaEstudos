package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){

                case 1 -> addItems(groceries);
                case 2-> removeItems(groceries);
                default -> flag = false;
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void addItems (ArrayList<String> groceries){

        System.out.println("Add item(s) [separete items by comma]: ");
        String[] items = scanner.nextLine().split(",");
        //groceries.addAll(List.of(items));

        //Nesse for é retirado o trim para retirar espaços primeiro ...Em seguida é verificado se o item não existe no array para então adicionar.

        for (String i: items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }

    }

    private static void removeItems (ArrayList<String> groceries){

        System.out.println("REMOVE item(s) [separete items by comma]: ");
        String[] items = scanner.nextLine().split(",");

        for (String i: items) {
            String trimmed = i.trim();
                groceries.remove(trimmed);
        }

    }

    private static void printActions(){

        String textBlock = """
                           ___________________________________________________________
                           Available actions:
                           
                           0 - to shutdown
                           
                           1 - to add item(s) to list (comma delimited lit)
                           
                           2 - to remove any items (comma delimited list)
                           
                           Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }
}
