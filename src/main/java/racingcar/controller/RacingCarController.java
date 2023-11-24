package racingcar.controller;

import racingcar.domain.CarGenerator;
import racingcar.domain.Cars;
import racingcar.domain.GameStatus;
import racingcar.view.OutputView;

import static racingcar.view.InputView.inputCarName;
import static racingcar.view.InputView.inputHowCount;
import static racingcar.view.OutputView.gameResult;

public class RacingCarController {
    public void gameStart() {
        Cars cars = new Cars(CarGenerator.generate(inputCarName()));
        int again = Integer.parseInt(inputHowCount());
        System.out.println("\n" + OutputView.GAME_RESULT);

        while (again > 0) {
            GameStatus.gameStatus(cars);
            gameResult(cars);
            again--;
        }
        OutputView.winners(cars);
    }
}
