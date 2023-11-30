package org.example;

import java.io.File;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class WordProcessor {
    Set<String> set1 = new HashSet<>();

    public void readFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                try {
                    String val = input.nextLine();
                    String[] words = val.split("\\s+");
                    for (String word : words) {
                        set1.add(word);
                    }
                } catch (NoSuchElementException e) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Set<String> getDistinctWords(){
        return set1;
    }

}
