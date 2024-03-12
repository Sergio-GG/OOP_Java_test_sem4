import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> list) {
        System.out.print("Список студентов: ");
        for (Student student: list) {
            System.out.print(student.getName() + " ");
        }
        System.out.println();
    }
}
