package singleton;

public class SingletonJava {

    private static SingletonJava uniqueInstance = null;
    private String name = "";

    private SingletonJava(){
        System.out.println("Singleton invoked with Java");
    }

    private synchronized static void createInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonJava();
        }
    }

    public static SingletonJava getInstance() {
        if (uniqueInstance == null) {
            createInstance();
        }

        return uniqueInstance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        SingletonJava singletonJavaLazy = SingletonJava.getInstance();
        singletonJavaLazy.setName("Alan");
        singletonJavaLazy.printName();
    }
}
