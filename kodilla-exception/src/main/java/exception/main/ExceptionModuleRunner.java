package exception.main;

import exception.io.FileReader;
import exception.io.FileReaderException;
import exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        }
        catch (FileReaderException e){
            System.out.println("Can't read file!");
        }
        finally {
            System.out.println("Kiedyś = Dzisiaj?  :)");
        }
    }
}
