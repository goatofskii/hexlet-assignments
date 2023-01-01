package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> booksList, Map<String, String> search) {

        ArrayList<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book : booksList) {
            boolean checker = false;

            for (Map.Entry<String, String> searchItem : search.entrySet()) {
                if (book.containsKey((searchItem.getKey()))) {
                    if (book.containsValue(searchItem.getValue())) {
                        checker = true;
                    } else {
                        checker = false;
                        break;
                    }
                }
            }
            if (checker) {
                result.add(book);
            }
        }
        return result;
    }
}

//END
