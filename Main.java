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

        StringBuilder builder = new StringBuilder();

        if (src.mkdir()) {
            System.out.println("Catalogue \"src\" is created");
            builder.append("Catalogue \"src\" is created\n");
        } else if (src.exists()) {
            System.out.println("Catalogue \"src\" is already exists");
            builder.append("Catalogue \"src\" is already exists\n");
        } else {
            System.out.println("Catalogue \"src\" isn`t created");
            builder.append("Catalogue \"src\" isn`t created\n");
        }

        if (res.mkdir()) {
            System.out.println("Catalogue \"res\" is created");
            builder.append("Catalogue \"res\" is created\n");
        } else if (res.exists()) {
            System.out.println("Catalogue \"res\" is already exists");
            builder.append("Catalogue \"res\" is already exists\n");
        } else {
            System.out.println("Catalogue \"res\" isn`t created");
            builder.append("Catalogue \"res\" isn`t created\n");
        }

        if (savegames.mkdir()) {
            System.out.println("Catalogue \"savegames\" is created");
            builder.append("Catalogue \"savegames\" is created\n");
        } else if (savegames.exists()) {
            System.out.println("Catalogue \"savegames\" is already exists");
            builder.append("Catalogue \"savegames\" is already exists\n");
        } else {
            System.out.println("Catalogue \"savegames\" isn`t created");
            builder.append("Catalogue \"savegames\" isn`t created\n");
        }

        if (temp.mkdir()) {
            System.out.println("Catalogue \"temp\" is created");
            builder.append("Catalogue \"temp\" is created\n");
        } else if (temp.exists()) {
            System.out.println("Catalogue \"temp\" is already exists");
            builder.append("Catalogue \"temp\" is already exists\n");
        } else {
            System.out.println("Catalogue \"temp\" isn`t created");
            builder.append("Catalogue \"temp\" isn`t created\n");
        }

        if (main.mkdir()) {
            System.out.println("Catalogue \"main\" is created");
            builder.append("Catalogue \"main\" is created\n");
        } else if (main.exists()) {
            System.out.println("Catalogue \"main\" is already exists");
            builder.append("Catalogue \"main\" is already exists\n");
        } else {
            System.out.println("Catalogue \"main\" isn`t created");
            builder.append("Catalogue \"main\" isn`t created\n");
        }

        if (test.mkdir()) {
            System.out.println("Catalogue \"test\" is created");
            builder.append("Catalogue \"test\" is created\n");
        } else if (test.exists()) {
            System.out.println("Catalogue \"test\" is already exists");
            builder.append("Catalogue \"test\" is already exists\n");
        } else {
            System.out.println("Catalogue \"test\" isn`t created");
            builder.append("Catalogue \"test\" isn`t created\n");
        }

        try {
            boolean created = file1.createNewFile();
            if (created) {
                System.out.println("File \"Main\" is created");
                builder.append("File \"Main\" is created\n");
            } else if (file1.exists()) {
                System.out.println("File \"Main\" is already exists");
                builder.append("File \"Main\" is already exists\n");
            } else {
                System.out.println("File \"Main\" isn`t created");
                builder.append("File \"Main\" isn`t created\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            boolean created = file2.createNewFile();
            if (created) {
                System.out.println("File \"Utils\" is created");
                builder.append("File \"Utils\" is created\n");
            } else if (file2.exists()) {
                System.out.println("File \"Utils\" is already exists");
                builder.append("File \"Utils\" is already exists\n");
            } else {
                System.out.println("File \"Utils\" isn`t created");
                builder.append("File \"Utils\" isn`t created\n");
            }
        } catch (
                Exception ex) {
            System.out.println(ex.getMessage());
        }

        if (dir1.mkdir()) {
            System.out.println("Directory \"drawables\" is created");
            builder.append("Directory \"drawables\" is created\n");
        } else if (dir1.exists()) {
            System.out.println("Folder \"drawables\" is already exists");
            builder.append("Folder \"drawables\" is already exists\n");
        } else {
            System.out.println("Directory \"drawables\" isn`t created");
            builder.append("Directory \"drawables\" isn`t created\n");
        }

        if (dir2.mkdir()) {
            System.out.println("Directory \"vectors\" is created");
            builder.append("Directory \"vectors\" is created\n");
        } else if (dir2.exists()) {
            System.out.println("Folder \"vectors\" is already exists");
            builder.append("Folder \"vectors\" is already exists\n");
        } else {
            System.out.println("Directory \"vectors\" isn`t created");
            builder.append("Directory \"vectors\" isn`t created\n");
        }

        if (dir3.mkdir()) {
            System.out.println("Directory \"icons\" is created");
            builder.append("Directory \"icons\" is created\n");
        } else if (dir3.exists()) {
            System.out.println("Folder \"icons\" is already exists");
            builder.append("Folder \"icons\" is already exists\n");
        } else {
            System.out.println("Directory \"icons\" isn`t created");
            builder.append("Directory \"icons\" isn`t created\n");
        }

        try {
            boolean created = fileTemp.createNewFile();
            if (created) {
                System.out.println("File \"temp\" is created");
                builder.append("File \"temp\" is created\n");
            } else if (fileTemp.exists()) {
                System.out.println("File \"temp\" is already exists");
                builder.append("File \"temp\" is already exists\n");
            } else {
                System.out.println("File \"temp\" isn`t created");
                builder.append("File \"temp\" isn`t created\n");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter fileWriter = new FileWriter(fileTemp)) {
            fileWriter.write(String.valueOf(builder));
            System.out.println("File is written");

        } catch (Exception ex) {
            System.out.println("File isn`t written");
        }
    }
}





