package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {

        return users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted(Comparator.comparing(Sorter::getBirthDate))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }

    private static String getBirthDate(Map<String, String> user) {

        String birthDate = user.get("birthday");

        if (birthDate == null) {
            return "";
        }

        return birthDate;
    }
}
// END
