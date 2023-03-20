package lesson12;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculatorTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll=====");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll=====");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach=====");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach=====");
    }

    @Test
    @Order(2)
    void test1(){
        System.out.println("test1=====");
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.add(7,3));
    }

    @Test
    @Order(1)
    void test2(){
        System.out.println("test2=====");
        Calculator calculator = new Calculator();
        Assertions.assertTrue(calculator.add(7,3) >= 10);
    }

}