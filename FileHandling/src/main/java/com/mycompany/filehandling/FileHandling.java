package com.mycompany.filehandling;

import java.io.*;

/**
 * FileHandling
 */
public class FileHandling {

    public static void main(String[] args) {
        // File file = new File("."); // show the files in current path, make sure in the correct path
        // for(String fileNames : file.list()) System.out.println(fileNames);

        // System.out.println("Working Directory = " + System.getProperty("user.dir")); // print the current working directory
        
        // System.exit(0);

        // Read File
        String filePath = "./FileHandling/myFile.txt"; // Note the current Java directly is the opened root path
        BufferedReader reader = null;
        String line;

        // try-catch-finally to handle file operations
        try {
            reader = new BufferedReader(new FileReader(filePath));
            line = reader.readLine();
            while (line !=  null){
                System.out.println(line);
                line = reader.readLine();
            }
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        } 
        finally{
            try {
                if (reader != null){
                    reader.close(); // close the BufferedReader
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();

        // try-with-resources to handle file operations (would automatically close BufferedReader), since Java 7
        try (BufferedReader readerNew =  new BufferedReader(new FileReader(filePath))) {
            line = readerNew.readLine();
            while (line != null){
                System.out.println(line);
                line = readerNew.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println();

        // Write to File
        String fileWritePath = "./FileHandling/myFile2.txt";
        String text = "Hello World";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileWritePath, true))) { 
            // FileWriter true will append new data to the file; false, will overwrite existing data in the file, this is the default option
            // run this multiple times would append the line multiple times
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Rename and Delete files
        File f = new File(fileWritePath); // create file object
        File nf = new File("./FileHandling/myNewFile.txt");
        f.renameTo(nf); // rename file
        nf.delete(); // delete file
    }
}