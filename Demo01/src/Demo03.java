import java.io.File;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        //在D盘创建一个a.txt
        File file = new File("D://aaa/b.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
