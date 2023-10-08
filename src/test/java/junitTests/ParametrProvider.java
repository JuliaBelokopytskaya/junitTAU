package junitTests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;

public class ParametrProvider {
    static List<Arguments> sourceArg(){
        return Arrays.asList(Arguments.arguments("tomato",2.0), Arguments.arguments("cabbage", 7.8));
    }
}
