package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class Student {
    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        examScores = new ArrayList<>();
        examScores.addAll(Arrays.asList(testScores));
    }
        public void setFirstName (){
            this.firstName = firstName;
        }
        public void setLastName (){
            this.lastName = lastName;
        }
        public String getFirstName (String firstName){
            return firstName;
        }
        public String getLastName (String lastName){
            return lastName;
        }
        public String getExamScores(){
            String result = "";
            for(int i = 0; i < examScores.size(); i++){
                result += examScores.get(i) + " ";
            }
            return result;
        }
        public Integer getNumberOfExamsTaken (){
            return examScores.size();
        }
        public void addExamScore(double examScore){
            examScores.add(examScore);
        }
        public void setExamScore(int examNumber, double newScore){
            examScores.set(examNumber - 1,newScore);
        }
        public Double getAverageExamScore(){
            Double result = 0.0;
            for(int i = 0; i < examScores.size(); i++){
                result += examScores.get(i);
            }
            return result / examScores.size();
        }
        @Override
        public String toString(){
            return "Student Name: " + firstName + " " + lastName + '\n' +
                    "Average Score: " + getAverageExamScore() + '\n' +
                    "Exam Scores: " + getExamScores();
        }
}
