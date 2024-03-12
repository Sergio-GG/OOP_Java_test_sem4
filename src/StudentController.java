public class StudentController implements UserController<Student>{
    StudentView studentView = new StudentView();
    StudentsService studentsService = new StudentsService();

    @Override
    public void create(String name) {
        studentsService.createStudent(name);
    }

    @Override
    public void edit(String name, String nameEdit) {
        studentsService.editStudent(name, nameEdit);
    }

    @Override
    public void add(Student student) {
        studentsService.addStudent(student);
    }

    @Override
    public void show() {
        studentView.sendOnConsole(studentsService.getStudentList());
    }
}
