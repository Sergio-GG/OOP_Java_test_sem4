import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    List<Teacher> teacherList;

    TeacherService(){
        teacherList = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher){
        this.teacherList.add(teacher);
    }

    public void createTeacher(String name){
        this.teacherList.add(new Teacher(name));
    }

    public List<Teacher> getTeacherList(){
        return this.teacherList;
    }

    public void editTeacher(String name, String setName){
        for (Teacher teacher: teacherList) {
            if(teacher.getName().equals(name)){
                teacher.setName(setName);
            }
        }
    }
}


