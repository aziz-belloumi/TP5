package exercice2;


import java.io.FileNotFoundException;
import java.io.File;



public class FileManager {
    public void readFile(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("file exists !");
        }
        else {
            throw new FileNotFoundException("File not found: " + filePath) ; 
        }
    }
}
