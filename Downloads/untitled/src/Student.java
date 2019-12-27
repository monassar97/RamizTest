import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private int age;
    private String name;
    private ArrayList<Subject> takenCourses;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        takenCourses= new ArrayList<Subject>();
    }
    public void addCourse(Subject subject){
        if(!takenCourses.contains(subject))
        {
            takenCourses.add(subject);
            new Course().add(this,subject);
        }
        else System.out.println("Student already enrolled ");
    }
    public void removeCourse(Subject subject){
        takenCourses.remove(subject);
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Subject> getTakenCourses() {
        return takenCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", takenCourses=" + takenCourses +
                '}';
    }
}
