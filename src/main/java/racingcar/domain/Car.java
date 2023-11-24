package racingcar.domain;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static racingcar.util.Validator.validateDigit;
import static racingcar.util.Validator.validateSizeOver;

public class Car {
    private final String carName;
    private int position;

    public Car(String carName) {
        validateSizeOver(carName);
        validateDigit(carName);
        this.carName = carName;
        this.position = 0;
    }

    public void move() {
        this.position++;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public String minus() {
        return IntStream.range(0, this.position)
                .mapToObj(i -> "-")
                .collect(Collectors.joining());
    }
}
