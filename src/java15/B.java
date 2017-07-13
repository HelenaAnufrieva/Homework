package java15;

import java.io.*;
import java.util.Random;

/**
 * Created by Администратор on 13.07.2017.
 */
public class B extends A implements Serializable{

    private C c;
    private String specialty;
    private transient int b;

    public B (int id, String name, int age, String speciality)
    {
        super(id);
        this.specialty = speciality;
        c = new C(name, age);
        b = 3;
    }

    public B () {}


    public void writeExternal(ObjectOutput stream) throws IOException {
        stream.writeObject(ID);
        stream.writeObject(specialty);
        c.writeExtrenal(stream);
    }

    public void readExternal(ObjectInput stream) throws IOException, ClassNotFoundException {

        C newC = new C();
        this.ID = (Integer) stream.readObject();
        this.specialty = (String) stream.readObject();
        newC.readExternal(stream);
        this.c = newC;
    }

    public void print()
    {
        System.out.println(ID + "\t" + c.name + "\t" + c.age + "\t" + c.c + "\t" + specialty + "\t" + b + "\t" + password);
    }


}
