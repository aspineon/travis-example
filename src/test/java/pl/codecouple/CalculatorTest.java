package pl.codecouple;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by CodeCouple.pl
 */
class CalculatorTest {

    @Test
    void shouldReturnFive() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.add(3, 2);
        // Then
        assertThat(result).isEqualTo(5);
    }

}