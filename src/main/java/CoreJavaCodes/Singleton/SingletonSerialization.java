package CoreJavaCodes.Singleton;

import java.io.*;

public class SingletonSerialization implements Serializable {
    //static initialization
    //Memory is allocated once at class loading time, rather than per object
    private static SingletonSerialization x =  new SingletonSerialization();

    private SingletonSerialization() {
        //private constructor to restrict initialization
        //adding defensive check to prevent from reflection
        if(x!=null)

            throw new RuntimeException("reflection attack prevention!!!11");
    }

    //globalAccessPoint method
    static SingletonSerialization getInstance() {
        return x;
    }
    protected Object readResolve() {
        return x;
    }
}
class SingletonSerializationMain {
    public static void main(String args[]) throws IOException, ClassNotFoundException {

            SingletonSerialization instance = SingletonSerialization.getInstance();
            System.out.println(instance.hashCode());
       // When a Singleton object is serialized (written to a file) and
        // then deserialized (read from that file),
        // Java creates a new instance during the deserialization process.
            //serialized
        ObjectOutputStream in=new ObjectOutputStream(new FileOutputStream("SingletonSerialization.ser"));
        in.writeObject(instance);
        in.close();
        //deserialized
        ObjectInputStream out =new ObjectInputStream(new FileInputStream("SingletonSerialization.ser"));
        SingletonSerialization instance2 = (SingletonSerialization) out.readObject();
        out.close();
        System.out.println(instance2.hashCode());


    }
}

