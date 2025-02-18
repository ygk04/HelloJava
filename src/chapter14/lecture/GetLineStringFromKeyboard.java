package chapter14.lecture;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
    public static void main(String[] args) throws Exception {
        // InputStream을 Reader로 변환하고 다시 BufferedReader를 연결
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            System.out.print("입력하세요: ");
            String lineStr = br.readLine(); // 라인 단위로 문자열을 읽음

            // q 또는 quit을 읽었을 때 while 반복문 종료
            if(lineStr.equals("q") || lineStr.equals("quit"))
                break;

            System.out.print("입력된 내용: "+ lineStr);
            System.out.println();
        }

        br.close();
    }
}
