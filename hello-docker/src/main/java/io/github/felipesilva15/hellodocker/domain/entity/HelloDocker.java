package io.github.felipesilva15.hellodocker.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class HelloDocker {
    private final String content;
    private final String environment;
}
