package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    Double[] examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
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
        public String getExamScores (Double[]examScores){
            return examScores.toString();
        }
        public Integer getNumberOfExamsTaken ( double[] examScores){
            return examScores.length;
        }

}
