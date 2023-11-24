package racingcar.domain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
public class CarsTest {
    @DisplayName("중복된 이름이 있는 경우에 대한 예외 처리 - IllegalArgumentException")
    @Test
    void validateSizeOver_IllegalArgumentException() {
        // When & Then
        assertThatThrownBy(() -> new Cars(CarGenerator.generate("abc,abc")))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
