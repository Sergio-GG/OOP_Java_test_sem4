public class Main {
    public static void main(String[] args) {
        StudentController sc = new StudentController();
        TeacherController tc = new TeacherController();

        Teacher teacher = new Teacher("Peter");
        Student student = new Student("Stepan");

        tc.create("Ivan");
        tc.create("Basilius");
        tc.add(teacher);
        tc.show();

        tc.edit("Ivan", "Julius");
        tc.show();

        sc.add(student);
        sc.create("Mauro");
        sc.create("Alex");
        sc.show();

        sc.edit("Mauro", "Konstantin");
        sc.show();
    }
}