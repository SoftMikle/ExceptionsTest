package Tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestParseException {
    private DateFormat df;
    private Date date;

    private int a;

    public TestParseException() throws ParseException {
        this.df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        this.date = new Date(String.valueOf(df.parse("JUNE 1 2 1980")));
    }

    public TestParseException(int a) {
        this.a = a;
    }
}
