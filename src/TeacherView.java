import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        System.out.print("Список учителей: ");
        for (Teacher teacher: list) {
            System.out.print(teacher.getName() + " ");
        }
        System.out.println();
    }
}
