package singleton;

public class SingletonJavaLazy {

    private static SingletonJavaLazy uniqueInstance = null;
    private String name = "";

    private SingletonJavaLazy(){
        System.out.println("Singleton invoked with Java");
    }

    public static synchronized SingletonJavaLazy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonJavaLazy();
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
        SingletonJavaLazy singletonJavaLazy = SingletonJavaLazy.getInstance();
        singletonJavaLazy.setName("Alan");
        singletonJavaLazy.printName();
    }
}
