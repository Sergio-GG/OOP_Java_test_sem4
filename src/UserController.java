public interface UserController<T extends User>{
    void create(String name);
    void edit(String name, String nameEdit);
    void add(T t);
    void show();
}
