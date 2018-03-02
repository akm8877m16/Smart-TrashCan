package com.smart.trashCan.tcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TcpApplicationRunner implements ApplicationRunner {

        @Autowired
        TcpServer tcpServer;

        @Override
        public void run(ApplicationArguments var1) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                        tcpServer.run();
                }
            });
            thread.start();
        }

}



