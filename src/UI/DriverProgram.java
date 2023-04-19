package UI;

import Controller.TreesFactory;
import Model.EstructuraArbol;
import Model.Word;

import java.util.Scanner;


import static Controller.ReadFile.ReadTheFile;
import static Controller.ReadFile.text2translateReadFile;
import static Controller.TranslationModule.translaterawtext;

public class DriverProgram {
    private static boolean menu = true;

    public static void main(String[] args) {
        ReadTheFile();


        TreesFactory<Word> factory = new TreesFactory<>();
        Scanner scanner = new Scanner(System.in);
        EstructuraArbol<Word> Thetree;

        System.out.println("--Bienvenido al diccionario traductor (Ingles a Español)--");
        String tipo = selector(scanner);
        Thetree = factory.crearArbol(tipo);

        Thetree.add(new Word("house","casa"));
        Thetree.add(new Word("dog","perro"));
        System.out.println(Thetree.get(new Word("house","")).getSpanish());
        while (menu){
            System.out.println("¿Que desea realizar?");

            System.out.println("1. Traducir texto");
            System.out.println("2. Salir");
            String opcion = scanner.nextLine();
            switch (opcion){
                case "1":
                    System.out.println( translaterawtext(scanner, Thetree));

                    break;


                case "2":
                    menu = false;
                    System.out.println("Adios...");
                    break;

            }

        }
    }

    public static String selector(Scanner n){
        System.out.println("Seleccione que estructura de arbol utilizara: ");
        System.out.println("1. SPLAY_TREE");
        System.out.println("2. RED_BLACK_TREE");
        System.out.println("3. BST");

        String opcion = n.nextLine();
        switch (opcion){
            case "1":
                return "SPLAY_TREE";
            case "2":
                return "RED_BLACK_TREE";
            case "3":
                return "BST";
        }
        return "";
    }

    }






