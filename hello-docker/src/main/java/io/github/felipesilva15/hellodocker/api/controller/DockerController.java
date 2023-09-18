package io.github.felipesilva15.hellodocker.api.controller;

import io.github.felipesilva15.hellodocker.domain.entity.HelloDocker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/hello-docker")
    public ResponseEntity<HelloDocker> hello() {
        String hostName = System.getenv("HOSTNAME");

        return new ResponseEntity<>(new HelloDocker("Hello Docker", hostName), HttpStatus.OK);
    }
}
