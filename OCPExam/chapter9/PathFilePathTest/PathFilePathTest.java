package OCPExam.chapter9.PathFilePathTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathFilePathTest {
    public static void printPathInformations(Path path){
        System.out.println("File name :   "+ path.getFileName());
        System.out.println("Root is :   "+ path.getRoot());

        Path currentPath = path;
        while((currentPath = currentPath.getParent()) != null){
            System.out.println(" Current parent is :   "+ currentPath);
        }

        try{
            final List<String> lines = Files.readAllLines(path);
            for(String line: lines){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Message : " + e );
        }

        try{
           System.out.println(Files.size(Paths.get("/home/samad/start")));
        } catch (IOException e){
            System.out.println("Message : " + e );
        }
    }

    public static void main(String[] args) {
        printPathInformations(Paths.get("/home/samad/start"));
        System.out.println();
        printPathInformations(Paths.get("/home/samad/tmp.text"));
    }
}