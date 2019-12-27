import java.util.*;

public class Course {
    private static Map<Subject,ArrayList<Student>> coursesMap = new HashMap<>();

    public void add(Student student, Subject subject){
        ArrayList<Student> subList=new ArrayList<>();
        if(coursesMap.containsKey(subject)) {
            subList = coursesMap.get(subject);
            if (subList.contains(student)) {
                return;
            }
            subList.add(student);
            coursesMap.put(subject, subList);
        }else{
            subList.add(student);
            coursesMap.put(subject,subList);
        }

    }

    public void printAll(){
            for(Subject key:coursesMap.keySet()){
                ArrayList<Student> sub=coursesMap.get(key);
                System.out.print(key+" : ");
                if(sub.isEmpty())
                    System.out.println("NO Students");;
                for (int i=0;i<sub.size();i++){
                    System.out.print(sub.get(i)+" ,");
                }
                System.out.println();

            }

    }
    public void removeStudentFromCourse(Student student,Subject subject){
        ArrayList<Student> currentStudents=coursesMap.get(subject);
        currentStudents.remove(student);
        student.removeCourse(subject);
        coursesMap.put(subject,currentStudents);
    }
    public void removeStudentFromAll(Student student){
       for(Subject key:coursesMap.keySet()){
           ArrayList<Student> currentStudents=coursesMap.get(key);
           currentStudents.remove(student);
           student.removeCourse(key);
           coursesMap.put(key,currentStudents);
       }
    }
}
