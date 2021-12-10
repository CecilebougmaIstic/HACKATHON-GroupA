package org.trans_hack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.trans_hack.utils.FBInitialize;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 *
 */
@EnableSwagger2
@SpringBootApplication
public class App 
{
    @Autowired
    FBInitialize fbInitialize;
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);

    }
}
