package io.sealsecurity.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Seal Security Maven Demo Application
 * 
 * This application demonstrates how Seal Security automatically remediates 
 * vulnerabilities in open-source dependencies during the CI/CD pipeline.
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("==============================================");
        System.out.println("Seal Security Demo Application Started!");
        System.out.println("==============================================");
        System.out.println("This application uses several dependencies that");
        System.out.println("have known vulnerabilities. Seal Security has");
        System.out.println("automatically replaced them with patched versions.");
        System.out.println("==============================================");
    }
}
