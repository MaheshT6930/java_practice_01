package org.example.Files;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesMain {
    public static void main(String[] args) throws Exception {
        File maheshFile = new File("data.txt");

        File newfile = new File("data2.txt");
        newfile.createNewFile();

        BufferedWriter bw = new BufferedWriter(new FileWriter(maheshFile));
        bw.write("Hello Mahesh");
        bw.newLine();
        bw.write("My first project");
        bw.close();
        // Files.Write()(java NIO  modern approach)
        Path path = Paths.get("file4.nioFile.txt");
        Files.write(path, List.of("line1", "line2", "written using files.writre()"));
        Files.write(path, List.of("1" ,"6"), StandardOpenOption.APPEND );//import StandardOpenOption from nio files

        System.out.println("files crreated using files.writer().");

        //delete files

        //Files.deleteIfExists(Paths.get("data2.txt"));

        // read files
        //FileReader reader = new FileReader("file1_outputStream.txt");
        //String





    }
}
