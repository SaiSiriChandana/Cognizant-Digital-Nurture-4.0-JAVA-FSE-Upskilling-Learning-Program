import java.lang.reflect.Method;

class Sample {
    public void hello() {
        System.out.println("Hello from Sample");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Sample");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            method.invoke(obj);
        }
    }
}
