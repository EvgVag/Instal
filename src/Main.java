import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File dir1 = new File("C:\\Users\\evgen\\Desktop\\Games\\src");
        File underDir1 = new File(dir1 + "\\main");
        File underDir12 = new File(dir1 + "\\test");
        File dir2 = new File("C:\\Users\\evgen\\Desktop\\Games\\res");
        File underDir21 = new File(dir2 + "\\drawables");
        File underDir22 = new File(dir2 + "\\vectors");
        File underDir23 = new File(dir2 + "\\icons");
        File dir3 = new File("C:\\Users\\evgen\\Desktop\\Games\\savegames");
        File dir4 = new File("C:\\Users\\evgen\\Desktop\\Games\\temp");
        if(dir1.mkdir()) {
            System.out.println(dir1.getName() + " создан");
        }
        underDir1.mkdir();
        underDir12.mkdir();
        dir2.mkdir();
        underDir21.mkdir();
        underDir22.mkdir();
        underDir23.mkdir();
        dir3.mkdir();
        dir4.mkdir();
        File file1 = new File(underDir1 + "\\Main.java");
        File file2 = new File(underDir1 + "\\Utils.java");
        File file3 = new File(dir4 + "\\temp.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("создан каталог src \n");
        sb.append("создан подкаталог main \n");
        sb.append("создан файл Main.java \n");
        sb.append("создан файл Utils.java \n");
        sb.append("создан подкаталог test \n");
        sb.append("создан каталог res \n");
        sb.append("создан подкаталог drawables \n");
        sb.append("создан подкаталог vectors \n");
        sb.append("создан подкаталог icons \n");
        sb.append("создан каталог savegames \n");
        sb.append("создан каталог temp \n");
        sb.append("создан файл temp.txt \n");

        FileWriter writer = new FileWriter(file3);
        writer.write(String.valueOf(sb));
        writer.flush();
        writer.close();
    }
}
