package cn.how2j.springcloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author WANGX
 * @version 1.0.0
 * @ClassName HystrixDashbordApplication.java
 * @Description TODO
 * @createTime 2019-10-08  19:07:06
 */

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashbordApplication {

    public static void main(String args[]) {

        int port = 8020;
        if (!NetUtil.isUsableLocalPort( port )) {

            System.err.printf( "端口号%d被占用了，无法启动%n", port );
            System.exit( 1 );
        }

        new SpringApplicationBuilder( HystrixDashbordApplication.class ).properties( "server.port = " + port ).run( args );

    }
}
