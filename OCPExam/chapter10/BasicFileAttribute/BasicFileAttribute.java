package OCPExam.chapter10.BasicFileAttribute;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttribute {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/samad/start");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("is path a directory?  "+ data.isDirectory());
        System.out.println("is path a regular file  ?  "+ data.isRegularFile());
        System.out.println("is path a symbolic link ?  "+ data.isSymbolicLink());
        System.out.println("is path  not a file, directory, sybolic link ?  "+ data.isOther());
        System.out.println("size in bytes   "+ data.size());
        System.out.println("creation date or time  "+ data.creationTime());
        System.out.println("last modified date or time  "+ data.lastModifiedTime());
        System.out.println("last access date or time  "+ data.lastAccessTime());
        System.out.println("unique file identifier  "+ data.fileKey());
    }
}