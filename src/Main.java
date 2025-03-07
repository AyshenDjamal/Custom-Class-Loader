import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> messagePrinter = myClassLoader.load("MessagePrinter");


            Object object = messagePrinter.getDeclaredConstructor().newInstance();
            Method printMessage = messagePrinter.getMethod("printMessage");

            printMessage.invoke(object); //

    }
}