package com.bharath.patterns.singleton;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Lesson4SerializableDateUtil dateUtil1 = Lesson4SerializableDateUtil.getInstance();

        ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream(
                        new File("files/dateUtil.ser")
                )
        );

        output.writeObject(dateUtil1);

        ObjectInputStream input = new ObjectInputStream(
                new FileInputStream(
                        "files/dateUtil.ser"
                )
        );
        Lesson4SerializableDateUtil dateUtil2 = (Lesson4SerializableDateUtil) input.readObject();

        output.close();
        input.close();

        System.out.println(dateUtil1 == dateUtil2);
    }
}
