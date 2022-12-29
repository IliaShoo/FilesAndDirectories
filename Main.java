package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File src = new File("C://Users//Games", "src");
        File res = new File("C://Users//Games", "res");
        File savegames = new File("C://Users//Games", "savegames");
        File temp = new File("C://Users//Games", "temp");
        File main = new File("C://Users//Games//src", "main");
        File test = new File("C://Users//Games//src", "test");
        File file1 = new File("C://Users//Games//src//main", "Main.java");
        File file2 = new File("C://Users//Games//src//main", "Utils.java");
        File dir1 = new File("C://Users//Games//res", "drawables");
        File dir2 = new File("C://Users//Games//res", "vectors");
        File dir3 = new File("C://Users//Games//res", "icons");
        File fileTemp = new File("C://Users//Games//temp", "temp.txt");

        File[] directories = new File[]{src, res, savegames, temp, main, test, dir1, dir2, dir3};
        File[] files = new File[]{file1, file2, fileTemp};

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < directories.length; i++) {
            if (directories[i].mkdir()) {
                System.out.println("Directory " + directories[i].getName() + " created");
                builder.append("Directory " + directories[i].getName() + " created\n");
            } else if (directories[i].exists()) {
                System.out.println("Directory" + directories[i].getName() + "is already exists");
                builder.append("Directory" + directories[i].getName() + " is already exists\n");
            } else {
                System.out.println("Directory " + directories[i].getName() + " isn`t created");
                builder.append("Directory" + directories[i].getName() + " isn`t created\n");
            }
        }

        for (int i = 0; i < files.length; i++) {
            boolean created = files[i].createNewFile();
            if (created) {
                System.out.println("File " + files[i].getName() + " is created");
                builder.append("File " + files[i].getName() + " is created\n");
            } else if (files[i].exists()) {
                System.out.println("File " + files[i].getName() + " is exist");
                builder.append("File " + files[i].getName() + " is exist\n");
            } else {
                System.out.println("File " + files[i].getName() + " isn't created");
                builder.append("File " + files[i].getName() + " isn't created\n");
            }
        }
        
        try (FileWriter fileWriter = new FileWriter(fileTemp)) {
            fileWriter.write(String.valueOf(builder));
            System.out.println("File is written");

        } catch (Exception ex) {
            System.out.println("File isn`t written");
        }
    }
}






