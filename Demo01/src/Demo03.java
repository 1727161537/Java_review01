import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Demo03 {
    public static void main(String[] args) throws IOException {
        //字节流读一个数据
        FileInputStream inputStream = new FileInputStream("D://aaa/b.txt");
        int a;
        while ((a=inputStream.read()) != -1){
            System.out.print((char)a);
        }
    }
}
