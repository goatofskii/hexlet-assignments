package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        String[] symbolArray = symbols.split("");

        ArrayList<String> symbolsList = new ArrayList<>();
        for (int i = 0; i < symbolArray.length; i++) {
            symbolsList.add(symbolArray[i]);
        }

        for (int i = 0; i < word.length(); i++) {
            if (symbolsList.contains(word.substring(i, i + 1).toLowerCase())) {
                symbolsList.remove(word.substring(i, i + 1));
            } else {
                return false;
            }
        }
        return true;
    }


}
//END

