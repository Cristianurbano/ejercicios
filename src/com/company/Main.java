package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();
        ArrayList<String> nombresCompletos = new ArrayList<>();

        System.out.println("Introduce los nombres, y pulsa 0 cuando deses terminar ");

        while (entrada.hasNext()){

            if (entrada.hasNext())break;

            nombres.add(entrada.next());

        }

        System.out.println(nombres);



        System.out.println("Introduce los apellidos, y pulsa 0 cuando deses terminar ");

        while (entrada.hasNext()){

            if (entrada.hasNext())break;

            apellidos.add(entrada.next());



        }

        int size = nombres.size() >apellidos.size() ? apellidos.size() : nombres.size();

        for (int i = 0; i < size; i++ ) {
            nombresCompletos.add(nombres.get(i) + " " + apellidos.get(i));
        }

        System.out.println(nombres);
        System.out.println(apellidos);
        System.out.println(nombresCompletos);




    }







}




