package edu.touro.cs.mcon364;

public class Gematria {
    public static int gematria(String s){
        int[] gematriaValueLibrary = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200,
                300, 400, 500, 600, 700, 800
        };
        int gematriaTotal = 0;
        String usableString = s.toUpperCase();
        for (int i = 0; i < usableString.length(); i++){
            char currentChar = usableString.charAt(i);
            if(currentChar >= 'A' && currentChar <= 'Z' ){
                int index = currentChar - 'A';  // Maps 'A'-'Z' to 0-25 by subtracting ascii value
                gematriaTotal += gematriaValueLibrary[index];
            }
        }
        return gematriaTotal;
    }
}
