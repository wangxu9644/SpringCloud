package cn.how2j.springcloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 */
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        int port = 8030;
        if(!NetUtil.isUsableLocalPort( port )){
            System.out.printf("端口号%d被占用了，无法启动%n",port);
            System.exit( 1 );
        }
        new SpringApplicationBuilder(ConfigServerApplication.class).properties( "server.port = " + port ).run( args );
    }
}
