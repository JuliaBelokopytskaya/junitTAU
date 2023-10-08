package junitTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class AssumptionsTest {
    @ParameterizedTest(name="Run:{index} - value: {arguments}")
    @ValueSource(ints ={1,5,6})
    void intValues(int theParam){
        System.out.println("theParam="+theParam);
    }
    @ParameterizedTest
    @CsvSource(value={"steav,rogers","captain,marvel"})
    void csvSourse(String par1, String par2){
        System.out.println("Param1="+par1+ ", Param2="+par2);
    }
}
