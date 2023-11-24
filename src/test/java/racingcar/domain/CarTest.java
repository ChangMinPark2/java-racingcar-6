package racingcar.domain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
public class CarTest {
    @DisplayName("Car 이름이 5글자가 넘어가는 경우에 대한 예외 - IllegalArgumentException")
    @Test
    void validateSizeOver_IllegalArgumentException() {
        // When & Then
        assertThatThrownBy(() -> new Car("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("Car 이름이 영어로만 구성되지 않은 경우에 대한 에외 - IllegalArgumentException")
    @Test
    void validateDigit_IllegalArgumentException() {
        // When & Then
        assertThatThrownBy(() -> new Car("ab1f"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
