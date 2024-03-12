public class Student extends User{

    final String role;

    Student(String name){
        super(name);
        this.role = "Student";
    }

    @Override
    public String toString() {
        return "Student{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
