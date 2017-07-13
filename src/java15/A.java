package java15;

import java.util.Random;

/**
 * Created by Администратор on 13.07.2017.
 */
public class A {

    public int ID;
    public transient long password;

    public A(){}

    public A(int id) {
        ID = id;
        password = 3681;
    }
}
