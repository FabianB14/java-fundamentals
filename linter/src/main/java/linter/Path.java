package linter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Path {
    public static void main(String[] args) {
        path();
    }

    public static void path() {
        Scanner scan = null;
        int count = 0;
        try {
            scan = new Scanner(new BufferedReader(new FileReader("./src/main/resources/gatesjs.txt")));
            while (scan.hasNextLine()) {
                count++;
                String line = scan.nextLine();
                if(line.length() != 0) {
                    String lineEnd = line.substring(line.length()-1);

                    System.out.println(lineEnd);

                    if (!lineEnd.equals(";") && !lineEnd.equals("{")  && !lineEnd.equals("}") && !line.contains("else") && !line.contains("if")) {
                        System.out.println("Line " + count + ": is missing semicolon");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}