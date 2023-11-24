package racingcar.util;

import racingcar.domain.Car;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static racingcar.util.GlobalConstant.MAX_CAR_NAME_SIZE;

public final class Validator {
    private Validator() {
    }

    public static void duplicateName(List<Car> cars) {
        Set<String> duplicateRemoveCars = cars.stream()
                .map(Car::getCarName)
                .collect(Collectors.toSet());

        if (duplicateRemoveCars.size() != cars.size()) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateSizeOver(String carName) {
        if (carName.length() > MAX_CAR_NAME_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateDigit(String carName) {
        if (!carName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException();
        }
    }
}
