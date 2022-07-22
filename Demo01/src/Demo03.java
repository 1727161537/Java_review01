import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Demo03 {
    public static void main(String[] args) throws IOException {
        //文件输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D://aaa/b.txt");
        fileOutputStream.write(80);

        fileOutputStream.close();
    }
}
