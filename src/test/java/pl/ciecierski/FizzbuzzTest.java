package pl.ciecierski;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static pl.ciecierski.Fizzbuzz.fizzbuzz;

public class FizzbuzzTest {
  @DisplayName("Gdy przekazano dowolną liczbę, to zwraca String zgodnie z poniższymi przykładami")
  @ParameterizedTest(name = "liczba: {0}, spodziewany wynik: {1}")
  // @formatter:off
  @CsvSource({"1,1","2,2","3,fizz","4,4","5,buzz","6,fizz","9,fizz","21,fizz","10,buzz","15,fizzbuzz","30,fizzbuzz"})

    // @formatter:on
  void test(int number, String expected) {


    //when
    String msg = fizzbuzz(number);

    //then
    Assertions.assertThat(msg).isEqualTo(expected);
  }
}
