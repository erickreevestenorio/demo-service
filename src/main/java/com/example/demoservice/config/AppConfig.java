package com.example.demoservice.config;

import com.example.jara.model.JarA;
import com.example.jarb.model.JarB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    /**
     * Inject JarA
     * @return
     */
    @Bean
    @Scope("singleton")
    public JarA jarA() {
        JarA jarA = new JarA();
        jarA.setGreeting("JAR A");
        return jarA;
    }

    /**
     * Inject JarB
     * @return
     */
    @Bean
    @Scope("singleton")
    public JarB jarB() {
        JarB jarB = new JarB();
        jarB.setGreeting("JAR B");
        return jarB;
    }
}
