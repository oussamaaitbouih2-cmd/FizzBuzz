
package com.Oussama.Deplacement;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    /*
     Scénarios TDD :
     FizzBuzz.de(1) → "1"
     FizzBuzz.de(3) → "Fizz"
     FizzBuzz.de(5) → "Buzz"
     FizzBuzz.de(15) → "FizzBuzz"
     FizzBuzz.de(2) → "2"
    */

    @Test
    public void test1() {
        assertThat(FizzBuzz.de(1)).isEqualTo("1");
    }

    @Test
    public void test3() {
        assertThat(FizzBuzz.de(3)).isEqualTo("Fizz");
    }

    @Test
    public void test5() {
        assertThat(FizzBuzz.de(5)).isEqualTo("Buzz");
    }

    @Test
    public void test15() {
        assertThat(FizzBuzz.de(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void test2() {
        assertThat(FizzBuzz.de(2)).isEqualTo("2");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20})
    public void testParametre(int n) {

        String[] expected = {
                "", "1","2","Fizz","4","Buzz",
                "Fizz","7","8","Fizz","Buzz",
                "11","Fizz","13","14","FizzBuzz",
                "16","17","Fizz","19","Buzz"
        };

        assertThat(FizzBuzz.de(n)).isEqualTo(expected[n]);
    }
}





