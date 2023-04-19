package Controller;

import Model.EstructuraArbol;
import Model.Word;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TranslationModule {

    public static String translaterawtext(Scanner scanner, EstructuraArbol<Word> Tree) {
        System.out.println("¿Cual es el texto que deseas traducir?");
        String porTraducir = scanner.nextLine().toLowerCase();
        return Translation(Tree,TokenMaker(porTraducir));
    }
    public static ArrayList<String> TokenMaker(String texto) {

        // Separar el texto en tokens usando espacios
        String[] tokenArray = texto.split(" ");

        return new ArrayList<>(Arrays.asList(tokenArray));
    }

    public static String Translation(EstructuraArbol<Word> Tree,ArrayList<String> tokens){
        ArrayList<String> translatedtokens = new ArrayList<>();

        for (String palabra: tokens){
        try {


                String palabraesp = Tree.get(new Word(palabra,"")).getSpanish();
                translatedtokens.add(palabraesp);


        }catch (Exception e){
            translatedtokens.add("*"+palabra+"*");
        }

        }

        String traduccion = "";
        for (String translatedword: translatedtokens){
            traduccion = traduccion + translatedword+" ";
        }




        return traduccion;
    }
}
