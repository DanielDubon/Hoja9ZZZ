    package Controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void ReadTheFile() {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\danie\\Documents\\Progra\\Hojs7ZZZ\\src\\diccionario.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(",");
            //ssss

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }



    }

    public static String text2translateReadFile(String path) {
        String texto = "";
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));

                String line = scanner.nextLine();
                String[] words = line.split(" ");
            for (String word: words){
                texto = texto + word+" ";
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    return texto;

    }
}