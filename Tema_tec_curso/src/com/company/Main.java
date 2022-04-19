package com.company;

import java.util.Scanner;

public class Main {
//@bz.paz
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Pegar input do nome do usuário
        System.out.println("Qual o seu nome?");
        String nome = scan.nextLine();

        //Pegar input da nota do qualitativo
        System.out.println("Quanto você tirou no qualitativo?(você pode tirar no máximo 2,0 nele)");
        float qual = Float.parseFloat(scan.nextLine());

        //Pegar input da nota de trabalhos
        System.out.println("Quanto você tirou nos trabalhos?(tambem se pode tirar apenas um maximo de 2,0)");
        float trab = Float.parseFloat(scan.nextLine());

        //Pegar input da nota de testes
        System.out.println("Quanto você tirou no teste?");
        float teste = Float.parseFloat(scan.nextLine());

        //Pegar input da nota da prova trismestral
        System.out.println("Quanto você tirou na prova trimestral?");
        float  provaTri = Float.parseFloat(scan.nextLine());


        //Pegar input da matéria
        System.out.println("Essas notas são de que matéria?");
        String materia = scan.nextLine();

        //Calculo
        float notaFinal;
        notaFinal = qual+trab+teste+provaTri;

        System.out.println(nome+" você tirou "+notaFinal+" em "+materia+" nesse trimestre");

    }
}
