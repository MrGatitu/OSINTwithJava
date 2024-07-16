import java.time.*;

public class WhatsTheTime {

    static Clock clock = Clock.systemUTC();

    public static void main(String[] args) {
        System.out.println(clock.instant());
    }
}