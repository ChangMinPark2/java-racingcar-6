package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public final class OutputView {
    public static final String GAME_RESULT = "실행 결과";

    private OutputView() {
    }

    public static void gameResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getCarName() + " : " + car.minus() + "\n");
        }
        System.out.println();
    }

    public static void winners(Cars cars) {
        System.out.println("최종 우승자 : " + String.join(", ", cars.winners()));
    }
}
