import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        //在D盘创建一个a.txt
        File file = new File("D://aaa/a.txt");
        boolean mkdir = file.mkdirs();
        System.out.println(mkdir);
    }
}
