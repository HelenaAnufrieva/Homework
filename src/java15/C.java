package java15;

import java.io.*;
import java.util.Random;

/**
 * Created by Администратор on 13.07.2017.
 */
public class C implements Serializable{

    public String name;
    public int age;
    public int c;

    public C(String name, int age)
    {
        this.name = name;
        this.age = age;
        c = 1;
    }

    public C(){}

    public void print()
    {
        System.out.println(name + "\t" + age + "\t" + c);
    }

    public void writeExtrenal(ObjectOutput stream) throws IOException
    {
        stream.writeObject(name);
        stream.writeObject(age);
    }

    public void readExternal(ObjectInput stream) throws IOException, ClassNotFoundException
    {
        name = (String) stream.readObject();
        age = (Integer) stream.readObject();
    }


}
