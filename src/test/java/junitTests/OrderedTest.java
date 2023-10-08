package junitTests;

import org.junit.jupiter.api.*;
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTest {
    @BeforeAll
    void beforeAll(){
        System.out.println("This before method");
    }
    @Test
    @Order(2)
    void  firstMethod(){
        System.out.println("This is the first test method");
    }
    @Test
    @Order(1)
    @DisplayName("Second test method")
    void  secondMethod(){
        System.out.println("This is the second test method");
    }
    @AfterAll
    void afterAll(){
        System.out.println("This after method");
    }
    @AfterEach
    void afterEach(){
        System.out.println("This after each method");
    }
}
