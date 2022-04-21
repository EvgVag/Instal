import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void createDir(String adress) {
        File dir = new File(adress);
        if (dir.mkdir()) {
            sb.append("Директория " + dir + " успешно создана" + "\n");
        } else {
            sb.append("Директория " + dir + " не создана" + "\n");
        }
    }

    public static void createFile(String adress) {
        File file = new File(adress);
        try {
            if(file.createNewFile()){
                sb.append("Файл " + file + " успешно создан" + "\n");
            } else {
                sb.append("Файл " + file + " не создан" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        createDir("C:\\Users\\evgen\\Desktop\\Games\\src");
        createDir("C:\\Users\\evgen\\Desktop\\Games\\src\\main");
        createDir("C:\\Users\\evgen\\Desktop\\Games\\src\\test");
        createDir("C:\\Users\\evgen\\Desktop\\Games\\res");
        createDir("C:\\Users\\evgen\\Desktop\\Games\\res\\drawables");
        createDir("C:\\Users\\evgen\\Desktop\\Games\\res\\vectors");
        createDir("C:\\Users\\evgen\\Desktop\\Games\\res\\icons");
        createDir("C:\\Users\\evgen\\Desktop\\Games\\savegames");
        createDir("C:\\Users\\evgen\\Desktop\\Games\\temp");

        createFile("C:\\Users\\evgen\\Desktop\\Games\\src\\main\\Main.java");
        createFile("C:\\Users\\evgen\\Desktop\\Games\\src\\main\\Utils.java");
        createFile("C:\\Users\\evgen\\Desktop\\Games\\temp\\temp.txt");




        FileWriter writer = new FileWriter("C:\\Users\\evgen\\Desktop\\Games\\temp\\temp.txt");
        writer.write(String.valueOf(sb));
        writer.flush();
        writer.close();
    }
}
