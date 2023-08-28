package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Simulator {

    private Scanner Read = new Scanner(System.in);
    private String[] ranName = {"Daniel", "Jose", "Maria", "Lucas", "Lina", "Monica"};
    private String[] ranlastName = {"lopez", "Martinez", "Sanchez", "Uribe", "Duque", "Petro"};
    private ArrayList< String> NameList = new ArrayList();
    private ArrayList<Integer> DniList = new ArrayList();
    private ArrayList<Alumn> alumnList = new ArrayList();
    private ArrayList<Vote> alumnsVotes = new ArrayList();

    public void randomAlumn() {
        int i = (int) (Math.random() * 6);
        int j = (int) (Math.random() * 6);
        NameList.add(ranName[i] + " " + ranlastName[j]);
    }

    public void randomDni() {
        boolean flag = true;
        do {
            int aleDni = (int) (Math.random() * 10000000);

            for (Integer dni : DniList) {
                if (dni == aleDni) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag) {
                DniList.add(aleDni);
            }
        } while (!flag);
    }

    public void createAlumn() {

        System.out.println("How many Alumns, do you want create?");
        int numAlumns = Read.nextInt();

        for (int i = 0; i < numAlumns; i++) {

            randomAlumn();
            randomDni();

            Alumn alumn = new Alumn(NameList.get(i), DniList.get(i), 0);
            alumnList.add(alumn);
        }

    }

    public void printAlumns() {
        for (Alumn alumn : alumnList) {
            System.out.println("Alumno " + alumn.getName());
            System.out.println("DNI : " + alumn.getDNI());
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ ");
        }
    }

    public void voting() {

        HashSet<Alumn> validador = new HashSet();
        int numAle;

        for (Alumn alumn : alumnList) {

            for (int i = 0; i < 3; i++) {

                do {
                    numAle = (int) (Math.random() * alumnList.size());
                } while (alumn == alumnList.get(numAle) || validador.contains(alumnList.get(numAle)));
                alumnList.get(numAle).setCountVotes(alumnList.get(numAle).getCountVotes() + 1);
                validador.add(alumnList.get(numAle));

            }

            Vote vote = new Vote(alumn, new ArrayList<>(validador));
            alumnsVotes.add(vote);

            validador.clear();

        }

    }

    public void printVote() {
        System.out.println("_______________________________");
        System.out.println("☻ ☻  VOTACIONES   ☻ ☻");
        System.out.println("_______________________________");

        for (Vote vote : alumnsVotes) {

            System.out.println("Nombre: " + vote.getAlumn().getName() + "   Votos: " + vote.getAlumn().getCountVotes());

            for (int i = 0; i < 3; i++) {

                System.out.println("Voto " + (i + 1) + " : " + vote.getAlumnvotedList().get(i).getName());

            }

        }

    }

    public void countVotes() {
        System.out.println("_______________________________");
        System.out.println("☻ ☻ CONTEO TOTAL DE VOTOS  ☻ ☻");
        System.out.println("_______________________________");
        for (Vote vote : alumnsVotes) {

            System.out.println("Nombre : " + vote.getAlumn().getName());
            System.out.println(" Votos totales : " + vote.getAlumn().getCountVotes());
            System.out.println("_ _  _ _ _ _  _ _ _ _ _ _ _ _ _  _ _ ");
        }

    }

    public void createFacilitator() {

        Comparator<Alumn> orderbyVote = (Alumn t, Alumn t1) -> t1.getCountVotes() - t.getCountVotes();
        
        Collections.sort(alumnList, orderbyVote);
        System.out.println("•• FACILITADORES ••");
        for (int i = 0; i < 5; i++) {

            System.out.println(alumnList.get(i).getName());

        }
        System.out.println("•• FACILITADORES SUPLENTES ••");
        for (int i = 5; i < 10; i++) {

            System.out.println(alumnList.get(i).getName());
        }

    }

    

        


         
   

}

