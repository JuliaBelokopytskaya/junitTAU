package junitTests;

import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest {
    @BeforeAll
    void beforeAll(){
        System.out.println("This before method");
    }
    @Test
    void  firstMethod(){
        System.out.println("This is the first test method");
    }
    @Test
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
