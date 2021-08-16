package sample;

public class HelloWorldRun {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader classLoader = new MyClassLoader();
        Class<?> clazz = classLoader.loadClass("sample.Hello");
        Object instance = clazz.newInstance();
        System.out.println(instance);
    }
}
