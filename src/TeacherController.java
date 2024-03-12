public class TeacherController implements UserController<Teacher>{

    private TeacherView teacherView = new TeacherView();
    private TeacherService teacherService = new TeacherService();
    @Override
    public void create(String name) {
        teacherService.createTeacher(name);
    }

    @Override
    public void edit(String name, String nameEdit) {
        teacherService.editTeacher(name, nameEdit);
    }

    @Override
    public void add(Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    @Override
    public void show() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }
}
