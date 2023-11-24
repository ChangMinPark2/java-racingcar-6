package racingcar.domain;

public class GameStatus {
    public static void gameStatus(Cars cars){
        for (Car car : cars.getCars()){
            tryMoveCar(car);
        }
    }

    private static void tryMoveCar(Car car){
        if (MoveCondition.moveCondition()){
            car.move();
        }
    }
}
