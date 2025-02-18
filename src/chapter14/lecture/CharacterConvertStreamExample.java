package chapter14.lecture;

import java.io.*;

public class CharacterConvertStreamExample {
    public static String read() throws IOException {
        // C:/temp/test1.txt 파일을 가져오자
        InputStream fis = new FileInputStream("C:/temp/test1.txt");
        // InputStreamReader 보조 스트림을 이용해서 문자 입력
        Reader reader = new InputStreamReader(fis);

        char[] buffer = new char[100];

        int readCharNum = reader.read(buffer);

        reader.close();

        // char 배열에서 읽은 수만큼 문자열로 변환
        String data = new String(buffer, 0, readCharNum);
        return data;

    }

    public static void write(String str) throws IOException{
        OutputStream fos = new FileOutputStream("C:/temp/test1.txt");
        // FileOutputStream에 보조 스트림(OutputStreamWrite) 연결
        Writer writer = new OutputStreamWriter(fos);

        writer.write(str); //보조 스트림을 이용해서 문자 출력
        writer.flush();
        writer.close();

    }

    public static void main(String[] args) throws IOException {
        write("문자 변환 스트림을 사용합니다.");
        System.out.println(read());
    }
}
