package racingcar.domain;

import java.util.Arrays;
import java.util.List;

import static racingcar.util.GlobalConstant.COMMA;

public class CarGenerator {
    public static List<Car> generate(String input) {
        return Arrays.stream(input.split(COMMA))
                .map(Car::new)
                .toList();
    }
}
