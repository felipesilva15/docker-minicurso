package io.github.felipesilva15.hellodocker.api.controller;

import io.github.felipesilva15.hellodocker.domain.entity.HelloDocker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    Logger logger = LoggerFactory.getLogger(DockerController.class);

    @GetMapping("/hello-docker")
    public ResponseEntity<HelloDocker> hello() {
        logger.info("Endpoint /hello-docker is caller!");

        String hostName = System.getenv("HOSTNAME");

        return new ResponseEntity<>(new HelloDocker("Hello Docker", hostName), HttpStatus.OK);
    }
}
