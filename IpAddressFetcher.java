import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressFetcher {
    public static String getPublicIp() throws UnknownHostException {
        InetAddress localhost = InetAddress.getLocalHost();
        return localhost.getHostAddress();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Public IP Address: " + getPublicIp());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
