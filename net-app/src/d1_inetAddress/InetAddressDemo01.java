package d1_inetAddress;

import java.net.InetAddress;

public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        InetAddress ip3 = InetAddress.getByName("220.181.38.150");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        System.out.println(ip3.isReachable(5000));


    }
}
