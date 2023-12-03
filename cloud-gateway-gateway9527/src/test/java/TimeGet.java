import java.time.ZonedDateTime;

/**
 * @author: cdh
 * @date: 2023/12/3 20:10
 * @descriptions: 获取当前时区、时间
 */
public class TimeGet {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
//        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
//        System.out.println(zny);

    }
}
