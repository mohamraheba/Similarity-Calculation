package org.example;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WordProcessor wp = new WordProcessor();
        WordProcessor wp1 = new WordProcessor();
        SimilarityCalculator calculate = new SimilarityCalculator();

        wp.readFile("text.txt");
        Set<String> set1 = wp.getDistinctWords();
        System.out.println(set1);

        wp1.readFile("text2.txt");
        Set<String> set2 = wp1.getDistinctWords();
        System.out.println(set2);

        double similarity = calculate.calculateSimilarity(set1, set2);
        System.out.println(similarity);
    }
}