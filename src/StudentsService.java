import java.util.ArrayList;
import java.util.List;

public class StudentsService {

    List<Student> studentList;

    StudentsService(){
        studentList = new ArrayList<>();
    }
    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public void createStudent(String name){
        this.studentList.add(new Student(name));
    }

    public List<Student> getStudentList(){
        return this.studentList;
    }

    public void editStudent(String name, String setName){
        for (Student student: studentList) {
            if(student.getName().equals(name)){
                student.setName(setName);
            }
        }
    }
}
