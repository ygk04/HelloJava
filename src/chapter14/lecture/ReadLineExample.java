package chapter14.lecture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadLineExample {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath());

        BufferedReader br = new BufferedReader(reader);

        while (true) {
            String data = br.readLine(); // 라인 단위 문자열을 일고 리턴

            if (data == null)
                break; // 파일 끝에 도달했을 경우 반복문 탈출

            System.out.println(data);
        }

        br.close();
    }
}
