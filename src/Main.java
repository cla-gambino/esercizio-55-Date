import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("data: " + data);

        ZonedDateTime newData = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String dataString = newData.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println("data FULL: " + dataString);
        String dataString2 = newData.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("data MEDIUM: " + dataString2);
        String dataString3 = newData.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("data SHORT: " + dataString3);


    }
}