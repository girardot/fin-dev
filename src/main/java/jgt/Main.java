package jgt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //Read from file
        String inputFileName = "src/main/resources/jgt/input.txt";
        System.setIn(new FileInputStream(inputFileName));

        //Write into a file
        String outputFileName = "src/main/resources/jgt/output.txt";
        System.setOut(new PrintStream(outputFileName));

        Processor processor = new Processor();
        processor.process();


    }
}
