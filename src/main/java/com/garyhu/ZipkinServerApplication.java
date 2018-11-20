package com.garyhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author: garyhu
 * @since: 2018/11/20 0020
 * @decription:
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

    public static void main(String[] args)throws Exception{
        SpringApplication.run(ZipkinServerApplication.class,args);
    }
}
