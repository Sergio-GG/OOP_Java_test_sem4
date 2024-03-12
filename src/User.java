public abstract class User {

    String name;

    User(String name){
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
