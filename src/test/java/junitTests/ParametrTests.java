package junitTests;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParametrTests {
    @ParameterizedTest(name="Run:{index} - value: {arguments}")
    @NullSource
    @EmptySource
    @NullAndEmptySource
    @ValueSource(ints ={1,5,6})
    void intValues(int theParam){
        assumeTrue(theParam>4);
        System.out.println("theParam="+theParam);
    }
    @ParameterizedTest
    @CsvSource(value={"steav,rogers","captain,marvel"})
    void csvSourse(String par1, String par2){
        assumeFalse(par1.equals("steve"),"The assumption failed");
        System.out.println("Param1="+par1+ ", Param2="+par2);
    }

    @ParameterizedTest
    @CsvSource(value={"captain america, 'steav,rogers'","captain,marvel"})
    void csvSourseWithComa
            (String par1, String par2){
        System.out.println("Param1="+par1+ ", Param2="+par2);
    }
    @ParameterizedTest
    @CsvSource(value={"captain&america", "captain&marvel"},delimiter ='&')
    void csvSourseWithDiff(String par1, String par2){
        System.out.println("Param1="+par1+ ", Param2="+par2);
    }
    @ParameterizedTest
    @MethodSource(value="sourceString")
    void methodSourse_String(String param){
        System.out.println("Param1="+param);
    }
    @ParameterizedTest
    @MethodSource(value="junitTests.ParametrProvider#sourceArg")
    void methodSourse_List(String param, double param2){
        System.out.println("Param1="+param + "param2"+param2);
    }
    List<String> sourceString(){
        return Arrays.asList("tomato","carrot","cabbage");}

    Stream<String> sourceStringAsStream(){
        return Stream.of("tomato","carrot","cabbage");
    }


}
