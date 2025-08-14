package com.example.visagca;

public class TimeMachinePuzzle {
    // Returns net minutes traveled given current age and childhood cutoff
    public int calculateNetMinutes(int age, int childhoodCutoff) {
        int years = Math.max(0, age - childhoodCutoff);
        // 1 minute forward and 2 minutes backward per applicable year
        int forward = years * 1;
        int backward = years * 2;
        return forward - backward;
    }
}
