package models;

import java.util.ArrayList;
import java.util.Collections;
import static spark.Spark.get;

public class Cohort {
    public ArrayList<String> students;
    public ArrayList<String> randomStudentName;
    public ArrayList<String> randomStudentPair;

    public Cohort() {
        this.students = new ArrayList<String>();
        this.randomStudentName = new ArrayList<String>();
        this.randomStudentPair = new ArrayList<String>();
    }

    public void populateStudents() {
        students.add("Stuart");
        students.add("Patrycja");
        students.add("Mike");
        students.add("Tahnee");
        students.add("Molly");
        students.add("Robbie");
        students.add("Beata");
        students.add("Joanna");
        students.add("Euan");
        students.add("Vicky");
        students.add("Marcin");
        students.add("Garry");
        students.add("Gemma");
        students.add("Digory");
        students.add("Ricardo");
        students.add("Kirstin");
        students.add("Mark");
        students.add("Raphael");
        students.add("Emil");
        students.add("Mellinda");
    }

    public String shuffleStudents() {
        populateStudents();
        Collections.shuffle(students);
        return students.get(0);
    }

    public ArrayList<String> shuffleStudentPairs() {
        populateStudents();
        Collections.shuffle(students);
        ArrayList<String> randomStudentPair = new ArrayList<>();
        randomStudentPair.add(students.get(0));
        randomStudentPair.add(students.get(1));
        return randomStudentPair;
    }
}