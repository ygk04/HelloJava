package chapter14.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample5 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/temp/test8.txt");

        char [] array = {'A', 'B', 'C'};

        writer.write(array); //배열로 전달

        writer.flush();
        // FileWriter는 기본적으로 시스템의 기본문자 인코딩 사용
        // 즉, 운영체제의 따라 다름. 윈도우에서 EUC-KR, mac OS에서는 UTF-8
        writer.close();

    }
}
