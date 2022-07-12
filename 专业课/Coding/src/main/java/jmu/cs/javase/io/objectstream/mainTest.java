package jmu.cs.javase.io.objectstream;

import java.io.*;

public class mainTest {


    public static void main(String[] args) {

        int a = 10;
        String b = "hello";

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.bat"));
            oos.writeInt(a);
            oos.writeUTF(b);
            oos.writeObject(new PersonInfo("Jack", "男", 20));
            oos.close();
            System.out.println("对象序列化已完成");


            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.bat"));
            int readint = ois.readInt();
            String readstr = ois.readUTF();
            PersonInfo p = (PersonInfo) ois.readObject();
            ois.close();

            System.out.println("序列化对象已读入完毕！显示如下：");
            System.out.println("整数为：" + readint);
            System.out.println("字符串为：" + readstr);
            System.out.println("对象为：" + p.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
