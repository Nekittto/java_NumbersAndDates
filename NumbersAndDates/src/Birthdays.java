import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Birthdays {
    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        StringBuilder line = new StringBuilder();

        for(LocalDate date = birthday; date.isBefore(today) || date.isEqual(today); date = date.plusYears(1)){
            int comparison = date.compareTo(birthday);
            line.append(comparison).append(date.format(DateTimeFormatter.ofPattern(" - dd.MM.yyyy - E").localizedBy(Locale.US))).append(System.lineSeparator());
        }
        return line.toString();

    }
}

