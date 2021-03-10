package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static java.util.Arrays.asList;

public class StudentTest {

    @Test
    public void studentGetExamScoresTest(){
        // : Given
        String firstName = "Jorge";
        String lastName = "Tapia";
        Double[] examScores = { 100.0, 100.0, 100.0, 100.0 };
        Student student = new Student(firstName, lastName, examScores);

// When
        String output = student.getExamScores();

// Then
        System.out.println(output);
    }

    @Test
    public void addExamScoreTest(){
        // : Given
        String firstName = "Jorge";
        String lastName = "Tapia";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String actual = student.getExamScores();

        // Then
        String expected = "100.0";
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setExamScoresTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

// When
        student.setExamScore(1, 150.0);
        String actual = student.getExamScores();

// Then
        String expected = "150.0 ";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getExamScoresAverageTest(){
        // : Given
        String firstName = "Jorge";
        String lastName = "Tapia";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double actual = student.getAverageExamScore();

        // Then
        Double expected = 125.0;
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toStringTest(){
        // : Given
        String firstName = "Jorge";
        String lastName = "Tapia";
        Double[] examScores = { 100.0, 150.0, 250.0, 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
    }

}