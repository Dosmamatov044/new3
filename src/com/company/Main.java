




package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
try {


    ArrayList<String> listA = new ArrayList<String>(5);
    System.out.println("Посчитайте до 5 ))) ");


    Scanner scanner = new Scanner(System.in);
    listA.add(scanner.nextLine() + (" Азамат "));
    listA.add(scanner.nextLine() + (" Аман"));
    listA.add(scanner.nextLine() + (" Айбек "));
    listA.add(scanner.nextLine() + (" Джон "));
    listA.add(scanner.nextLine() + (" Саша "));
    Iterator<String> iterator = listA.iterator();
    while (iterator.hasNext()) {
        String e = iterator.next();
        System.out.println(e);
    }


    ArrayList<String> listB = new ArrayList<String>(5);
    System.out.println("Попробуйте продолжить до 10 ");

    Scanner scanner1 = new Scanner(System.in);

    listB.add(scanner1.nextLine() + (" Айжан "));
    listB.add(scanner1.nextLine() + (" Айзада "));
    listB.add(scanner1.nextLine() + (" Айдана "));
    listB.add(scanner1.nextLine() + (" Анара "));
    listB.add(scanner1.nextLine() + (" Айгул "));
    Collections.reverse(listB);
    iterator = listB.iterator();
    while (iterator.hasNext()) {
        String a = iterator.next();
        System.out.println(a);
    }


    ArrayList<String> listС = new ArrayList<String>();

    int i = 0;
    while (i < listA.size()) {
        listС.add(listA.get(i));
        listС.add(listB.get(i));
        iterator = listС.iterator();
    }

    while (iterator.hasNext()) {
        String c = iterator.next();
        System.out.println(c);
    }


    Collections.sort(listС, new Comparator<String>() {


        @Override
        public int compare(String X, String L) {
            return X.length() - L.length();
        }


    });

    iterator = listС.iterator();
    while (iterator.hasNext()) {
        String list = iterator.next();
        System.out.println(list);
    }

}catch (OutOfMemoryError e){ }
    }
}
