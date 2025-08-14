package com.example.visagca;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Visa GCA Practice Set\n");

        RotatedArrayMin minFinder = new RotatedArrayMin();
        System.out.println("Min in rotated array: " + minFinder.findMin(new int[]{4,5,6,7,0,1,2}));

        OneDigitDifferencePairs pairsFinder = new OneDigitDifferencePairs();
        System.out.println("One-digit difference pairs: " + pairsFinder.countPairs(new int[]{1, 2, 53, 23, 9}));

        TimeMachinePuzzle puzzle = new TimeMachinePuzzle();
        System.out.println("Net minutes traveled: " + puzzle.calculateNetMinutes(10, 2));

        FindPeakElement finder = new FindPeakElement();
        int idx = finder.findPeakElement(new int[]{1,2,3,1});
        System.out.println("Peak index: " + idx);

        NeighborSum ns = new NeighborSum();
        System.out.println("Neighbor sum: " + Arrays.toString(ns.transform(new int[]{1,2,3,4})));

        PatternStringMatch psm = new PatternStringMatch();
        System.out.println("Pattern matches: " + psm.countMatches("abaebio", "010"));

        SearchRotatedArray sra = new SearchRotatedArray();
        System.out.println("Index of 0 in rotated array: " + sra.search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}
