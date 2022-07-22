import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Demo03 {
    public static void main(String[] args) throws IOException {
        //文件输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D://aaa/b.txt",true);
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("hello world".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
