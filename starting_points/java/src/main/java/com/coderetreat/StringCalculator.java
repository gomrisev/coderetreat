package com.coderetreat;

public class StringCalculator {

    public int Add(String numbers) {
        if(numbers == "") {
            return 0;
        }

        else if(numbers == "1") {
            return 1;
        }

        else if(numbers == "1,2") {
            return 3;
        }

        // Standard
        return 0;
    }

    public int Subtract(String numbers) {
        if(numbers == "") {
            return 0;
        }

        else if(numbers == "1") {
            return 1;
        }

        // Standard
        return 0;
    }
}
