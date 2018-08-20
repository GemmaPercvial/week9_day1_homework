package models;

import java.util.ArrayList;
import java.util.Collections;
import static spark.Spark.get;

public class Cohort {
    public ArrayList<String> students;
    public ArrayList<String> randomStudentName;
    public ArrayList<String> randomStudentPair;

    public Cohort(){
        this.students = new ArrayList<String>();
        this.randomStudentName = new ArrayList<String>();
        this.randomStudentPair = new ArrayList<String>();
    }

    public ArrayList<String> shuffleStudents(){
        ArrayList<String> shuffledStudents = new ArrayList<>();
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
        Collections.shuffle(students);
        ArrayList<String> randomStudentName = new ArrayList<>();
        randomStudentName.add(students.get(0));
        return randomStudentName;
    }

    public ArrayList<String> shuffleStudentPairs(){
        ArrayList<String> shuffledPairs = new ArrayList<>();
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
        Collections.shuffle(students);
        ArrayList<String> randomStudentPairs = new ArrayList<>();
            randomStudentPairs.add(students.get(0));
            randomStudentPairs.add(students.get(1));
        return randomStudentPairs;
    }

    public ArrayList<String> getRandomStudentName() {
        return randomStudentName;
    }

    public void setRandomStudentName(ArrayList<String> randomStudentName) {
        this.randomStudentName = randomStudentName;
    }

    public ArrayList<String> getRandomStudentPair() {
        return randomStudentPair;
    }

    public void setRandomStudentPair(ArrayList<String> randomStudentPairs) {
        this.randomStudentPair = randomStudentPairs;
    }
}