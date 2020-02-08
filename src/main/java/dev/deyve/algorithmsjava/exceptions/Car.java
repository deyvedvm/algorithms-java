package dev.deyve.algorithmsjava.exceptions;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
public class Car {

    private String name;

    private String color;

    public Car(String name, String color) {

        this.name = Objects.requireNonNull(name, "Car name cannot be null");

        this.color = Objects.requireNonNull(color, "Car color cannot be null ");

    }
}
