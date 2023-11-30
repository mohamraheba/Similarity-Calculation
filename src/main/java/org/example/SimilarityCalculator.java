package org.example;

import java.util.HashSet;
import java.util.Set;

public class SimilarityCalculator {
    public Double calculateSimilarity(Set<String> set1, Set<String> set2){
        int intersection = 0;
        for (String e : set1) {
            if (set2.contains(e)) {
                intersection++;
            }
        }

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        int unionCount = union.size();

        double similarity = (double) intersection / unionCount;

        return similarity;
    }
}
