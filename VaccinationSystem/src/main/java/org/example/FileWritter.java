package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWritter {
    private final String path = "C:\\Users\\maria\\Team4-part1\\VaccinationSystem\\src\\main\\resources\\vaccination-results.txt";

    public void createFile(){
        try {
            File vaccinationresults = new File(path);
            if (vaccinationresults.createNewFile()) {
                System.out.println("File created: " + vaccinationresults.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeFile(String results){
        try {
            Path p = Paths.get(path);
            Files.write(p,(System.lineSeparator() + results).getBytes(), StandardOpenOption.APPEND);
            }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
