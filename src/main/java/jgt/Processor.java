package jgt;

import java.util.Scanner;

public class Processor {

    public void process() {
        String line;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            /* Lisez les donn�es et effectuez votre traitement */
            System.out.println(line);
        }
    }
}
