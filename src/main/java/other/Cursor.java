package other;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author dewey.du
 * @Date 2023/9/26 17:46
 * @Project design_patterns
 **/
public class Cursor {

    private static final String[] BASE_WORDS = {
            "activity/",
            "cmy/",
            "community/",
            "energy/",
            "issue/",
            "raffle/",
            "moments/",
            "news/",
            "recommend/",
            "search/",
            "third/",
            "user/"};
    public static void isStrExist() throws IOException {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(BASE_WORDS));
        String fileName = "d:/nacos.txt";
        //加载本地文件
        File file = new File(fileName);
        //字节流到字符流
        InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8"); //编码格式
        //字符输入流中读取文本并缓冲字符
        BufferedReader bufferedReader = new BufferedReader(read);
        String line = null;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null) {
            i++;
            if (line.startsWith("#")) {
                continue;
            }
            //指定字符串判断处
            String finalLine = line;
            int finalI = i;
            list.forEach(s->{
                if (finalLine.contains(s)) {
                    System.out.println("在第" + finalI + "行存在 ---->" + s);
                }
            });

        }
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        isStrExist();
    }

}