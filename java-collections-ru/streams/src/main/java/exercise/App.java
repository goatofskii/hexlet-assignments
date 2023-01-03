package exercise;


import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> mail) {

        long mailCheck = (int) mail.stream()
                .filter(mailN -> checkString(mailN))
                .count();

        return (int) mailCheck;
}

    public static boolean checkString(String string) {
        return string.contains("@gmail")
                | string.contains("@yandex") | string.contains("@hotmail");
    }
}
// END
