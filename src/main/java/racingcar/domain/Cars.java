package racingcar.domain;

import racingcar.util.Validator;

import java.util.Collections;
import java.util.List;

import static racingcar.util.Validator.duplicateName;

public class Cars {
    private final List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public Cars(List<Car> cars) {
        duplicateName(cars);
        this.cars = cars;
    }

    public List<String> winners() {
        List<Integer> list = this.cars.stream()
                .map(Car::getPosition)
                .sorted(Collections.reverseOrder())
                .toList();

        int winnerPosition = list.get(0);

        return this.cars.stream()
                .filter(car -> car.getPosition() == winnerPosition)
                .map(Car::getCarName)
                .toList();
    }
}
