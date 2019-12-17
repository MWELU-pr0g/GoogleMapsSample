/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikehouse
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class math {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("hello.txt");
        System.out.println("does the file exist:" + file);
        System.out.println("is the filedirectory:" + file.isDirectory());
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("carol mwelu");
            output.println("24years");
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.printf("file not found %s", ex);
            
            Scanner input=new Scanner(file);
            String name=input.nextLine();
            String age=input.nextLine();
            
            System.out.printf("name is %s \nage is %s",name,age);
                    

        }

    }

}
