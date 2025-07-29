package org.example.Files;
import java.io.*;

public class FileTypes {
    public static void main(String[] args){

        // File OutputStream
        try
                (FileOutputStream file1 = new FileOutputStream("file1_outputStream.txt")){
            String data = "written using FileOutput Stream";
            file1.write(data.getBytes());
            System.out.println("file created using FileOutput Stream.");
        } catch (IOException e){
            System.out.println("error occured at file1.txt" + e);
            e.printStackTrace();
        }

        //new file with file writer
        try{
            File file2 = new File("file2_fileWriter.txt");
            if (file2.createNewFile()){
                FileWriter writer = new FileWriter(file2);
                writer.write("written using File.newFile() and FileWriter.");
                writer.close();
                System.out.println("FIle created and written using File writter");
            }else{
                System.out.println("file not exists.");
            }

        }catch (IOException e){
            System.out.println("error in file 2" + e);
            e.printStackTrace();
        }
    }
}
