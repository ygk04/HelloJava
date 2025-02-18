package chapter14.lecture;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileExample {
    public static void main(String[] args) throws IOException {
        // File 객체 생성
        File dir = new File("C:/temp/images");
        File file1 = new File("C:/temp/file1.txt");
        File file2 = new File("C:/temp/file2.txt");
        File file3 = new File("C:/temp/file3.txt");

        // 파일 또는 폴더가 존재하지 않으면 생성
        if(!dir.exists()) { dir.mkdirs(); }
        if(!file1.exists()) { file1.createNewFile(); }
        if(!file2.exists()) { file1.createNewFile(); }
        if(!file3.exists()) { file1.createNewFile(); }

        // C:/Temp 폴더의 내용 목록을 File 배열로 얻음
        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();

        System.out.println("시간\t\t\t\t\t형태\t크기\t이름");
        System.out.println("--------------------------------------------------------");

        for(File file : contents) {
            // 파일의 마지막 수정 시간(long) 가져오기
            // 1970년 1월 1일 00:00:00 UTC 기준으로부터의 밀리초 단위 시간 return
            long lastModified = file.lastModified();

            // long 값을 LocalDateTime으로 변환
            LocalDateTime lastModifiedDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(lastModified), ZoneId.systemDefault());

            System.out.print(lastModifiedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm")));
            if(file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.printf("\t\t\t%7d\t%s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}
