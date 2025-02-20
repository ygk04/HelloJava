package chapter14.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample6 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:/temp/test9.txt");

        char[] buffer = new char[5];

        // 입력 스트림으로부터 3개의 문자를 읽음(buffer [2], [3], [4]에 각각 저장)
        int readCharNum = reader.read(buffer, 2, 3);

        // 파일 끝에 도달 체크
        if (readCharNum != -1) { // 읽은 문자가 있다면
            for (int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        reader.close();
    }
}
