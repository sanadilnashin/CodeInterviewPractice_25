package CoreJavaCodes.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflection {
    //static initialization
    //Memory is allocated once at class loading time, rather than per object
    private static SingletonReflection x =  new SingletonReflection();

    private SingletonReflection() {
        //private constructor to restrict initialization
        //adding defensive check to prevent from reflection
        if(x!=null)
            throw new RuntimeException("reflection attack prevention!!!11");
    }

    //globalAccessPoint method
    static SingletonReflection getInstance() {
        return x;
    }
}
class SingletonReflectionMain {
    public static void main(String args[]) {
        try {
            SingletonReflection instance = SingletonReflection.getInstance();
            System.out.println(instance.hashCode());
            //reflection allow access to private contructor,field,method by using setAccessible
            Constructor<SingletonReflection> ref=SingletonReflection.class.getDeclaredConstructor();
            ref.setAccessible(true);
            //creating new instance using reflection

            System.out.println(ref.newInstance().hashCode());

        }  catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

