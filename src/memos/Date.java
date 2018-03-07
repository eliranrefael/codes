package memos;

/**
 *
 * @author eliran refael
 */
public class Date {

    int day, month, year;

    public Date() {
        day = 1;
        month = 1;
        year = 1;

    }

    public Date(int d, int m, int y) {
        this();
        if (!(d > 31 || d < 1 || m > 12 || m < 1 || y > 12 || y < 1)) {
            day = d;
            month = m;
            year = y;
        }
    }

    public boolean equals(Object o) {
        if (o instanceof Date) {
            if (day == ((Date) o).day && month == ((Date) o).month && year == ((Date) o).year) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer x = year * 10000 + month * 100 + day;
        return x.hashCode();
    }

}
