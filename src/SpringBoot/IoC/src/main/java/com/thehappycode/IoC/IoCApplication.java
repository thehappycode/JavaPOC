package com.thehappycode.IoC;

import com.thehappycode.IoC.services.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IoCApplication {

	public static void main(String[] args) {

        // SpringApplication.run(IoCApplication.class, args);

        System.out.println("--> Không sử dụng IoC để tạo instance");
        var withoutIoC = new WithoutIoC();
        withoutIoC.run();

        System.out.println("<------------------------->");

        System.out.println("--> Sử dụng IoC với cấu hình XML." +
            " Cách sử dụng này thường được sử dụng trong Spring Framework cổ điển," +
            " không phổ biến trong Spring Boot vì Spring Boot sử dụng @SpringBootApplication để tự động cấu hình context");
        IoCWithXMLConfiguration ioCWithXMLConfiguration = new IoCWithXMLConfiguration();
        ioCWithXMLConfiguration.run();

        System.out.println("<------------------------->");

        System.out.println("--> Sử dụng Java-based configuration để thay thế cho cấu hình XML.");
        IoCWithJavaBasedConfiguration ioCWithJavaBasedConfiguration = new IoCWithJavaBasedConfiguration();
        ioCWithJavaBasedConfiguration.run();

        System.out.println("<------------------------->");

        System.out.println("--> Sử dụng Annotation configuration. Spring Boot sử dụng rộng rải cách dùng này");
        IoCWithAnnotationConfiguration ioCWithAnnotationConfiguration = new IoCWithAnnotationConfiguration();
        ioCWithAnnotationConfiguration.run();
    }
}
