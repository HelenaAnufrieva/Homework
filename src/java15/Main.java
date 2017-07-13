package java15;

import java.io.*;

/**
 * Created by Администратор on 13.07.2017.
 */
public class Main {

        private final static String FILE = "data.txt";

        public static void main(String[] args) throws IOException, ClassNotFoundException {

            B b = new B(0, "Clara", 25, "teacher");
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {
                b.writeExternal(objectOutputStream);
            }

            B copyOfB = new B();
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE))) {
                copyOfB.readExternal(objectInputStream);
            }
            copyOfB.print();
        }

}
