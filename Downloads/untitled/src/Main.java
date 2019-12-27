public class Main {
    public static void main(String[] args) {
        Student ramez = new Student(22,"Ramez");
        Student ahmad = new Student(23,"Ahmad");
        ramez.addCourse(Subject.Math);

        ramez.addCourse(Subject.Physics);
        ramez.addCourse(Subject.Chemistry);

        ahmad.addCourse(Subject.Math);

        ahmad.addCourse(Subject.English);
        ahmad.addCourse(Subject.Physics);

        Course course=new Course();
        course.printAll();
        System.out.println("========");
        course.removeStudentFromAll(ramez);
        course.printAll();


    }
}
