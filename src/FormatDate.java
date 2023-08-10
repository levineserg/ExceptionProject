import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static String formatDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return format.format(date);
    }
}