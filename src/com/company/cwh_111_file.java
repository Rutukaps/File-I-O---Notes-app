package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file {


    public static void main(String[] args) {

        File myfile = new File("cwh111file.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }



        try {
            FileWriter filewriter = new FileWriter("cwh111file.txt");
            filewriter.write("This is our first file");
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


              File filereader = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(filereader);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}