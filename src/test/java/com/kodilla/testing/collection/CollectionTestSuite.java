package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("When empty list is given, returns an empty list")
@Test
    void testOddNumbersExterminatorEmptyList() {

    //Given
    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    //When
    List<Integer> result = exterminator.exterminate(new ArrayList<>());
    //Then
    Assertions.assertTrue(result.isEmpty());

    }
    @DisplayName("Method exterminate takes list of some odd and even numbers and returns only list of even numbers")
@Test
    void testOddNumbersExterminatorNormalList(){

    //Given
    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    List<Integer> input = new ArrayList<>();
    input.add(999);
    input.add(10);
    input.add(900);
    input.add(11);
    //When
    List<Integer> result = exterminator.exterminate(input);
    //Then
    Assertions.assertTrue(result.get(0) == 10);
    Assertions.assertTrue(result.get(1) == 900);

    }
}
