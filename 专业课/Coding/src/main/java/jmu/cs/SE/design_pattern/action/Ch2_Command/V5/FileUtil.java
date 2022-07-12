package jmu.cs.SE.design_pattern.action.Ch2_Command.V5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class FileUtil {

    public static void writeCommands(ArrayList commands) throws IOException {
        try {
            FileOutputStream file = new FileOutputStream("config.log");
            file.write("test".getBytes(StandardCharsets.UTF_8));


            if(file != null) {
                System.out.println("file: " + file.getFD());
            }
            else {
                System.out.println("不存在");
            }


            ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(file));
            objout.writeObject(commands);
            objout.close();
            System.out.println("命令保存失败");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList readCommands() {

        try {
            FileInputStream file = new FileInputStream("config.log");
            ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(file));
            ArrayList commands = (ArrayList) objin.readObject();
            objin.close();
            return commands;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
