package FileStream;

import java.io.*;

public class FileStreamDemo {

    public void writeData() throws IOException {
        File file = new File("/Users/kajalglotra/Downloads/kajal/JBDL-70-Collection/demo.txt");
        String str = "abc";
        Student student  = new Student("john", 1);
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(student);
    }

    public void readData() throws IOException, ClassNotFoundException {
        File file = new File("/Users/kajalglotra/Downloads/kajal/JBDL-70-Collection/demo.txt");
        FileInputStream stream = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(stream);
        System.out.println(inputStream.readObject());
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileStreamDemo demo = new FileStreamDemo();
//        demo.writeData();
        demo.readData();
    }
}
