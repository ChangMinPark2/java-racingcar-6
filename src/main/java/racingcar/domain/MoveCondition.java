package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.util.GlobalConstant.*;

public class MoveCondition {
    public static boolean moveCondition() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER) >= CONDITION_NUMBER;
    }
}
