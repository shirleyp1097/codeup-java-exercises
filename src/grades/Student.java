package grades;

import java.util.*;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

//    // returns the student's name
    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int value: grades) {
            sum += value;
        }
        return  sum / grades.size();
    }


    public static void main(String[] args) {

    }
}
