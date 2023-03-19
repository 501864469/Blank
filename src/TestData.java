import java.util.Date;
import java.util.Calendar;
public class TestData {
    public static void main(String[] args) {
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //通过日历对象得到日期对象
        Date d = c.getTime();

        Date d2 = new Date(0);
        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
    }
}
