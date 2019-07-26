package com.example.demoservice.resource;

import com.example.jara.model.JarA;
import com.example.jarb.model.JarB;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class DemoResource {

    private final JarA jarA;

    private final JarB jarB;

    @Autowired
    public DemoResource(JarA jarA, JarB jarB) {
        this.jarA = jarA;
        this.jarB = jarB;
    }

    /**
     *
     * Endpoint to get JarA
     * @return
     */
    @GetMapping(value = "/getJarA", produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<JarA> getJarA() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Greeting", jarA.getGreeting());
        return new ResponseEntity<>(jarA, responseHeaders, HttpStatus.OK);
    }

    /**
     * Endpoint to get JarB
     * @return
     */
    @GetMapping(value = "/getJarB", produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<JarB> getJarB() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Greeting", jarB.getGreeting());
        return new ResponseEntity<>(jarB, responseHeaders, HttpStatus.OK);
    }

}
