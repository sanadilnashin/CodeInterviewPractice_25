package CoreJavaCodes;

import java.lang.reflect.Constructor;

public class Singleton implements Cloneable {
    //static initialization
    //Memory is allocated once at class loading time, rather than per object
    private static Singleton x = null;

    private Singleton() {
        //private constructor to restrict initialization
    }

    //globalAccessPoint method
    static Singleton getInstance() {
        if (x == null)
            x = new Singleton();
        return x;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone(); insteed of cloning we can throw some exception
        throw new CloneNotSupportedException("exception");
    }
}

class SingletonMain {
    public static void main(String args[]) {
        try {
            // Singleton y=new Singleton(); not able to create obj
            Singleton instance = Singleton.getInstance();
            System.out.println(instance.hashCode());

            //cloning
           // Singleton y = (Singleton) instance.clone();
            //System.out.println(y.hashCode());

            //reflection allow access to private contructor,field,method by using setAccessible
            Constructor<Singleton> ref=Singleton.class.getDeclaredConstructor();
            ref.setAccessible(true);
            System.out.println(ref.hashCode());

        } /*catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());

        } */catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
