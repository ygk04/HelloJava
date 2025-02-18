package chapter14.lecture;

import java.io.*;

public class NonBufferVsBufferExample {

    static int data = -1;

    public static long copy(InputStream is, OutputStream os) throws IOException {
        long start = System.nanoTime(); // 시작 시간을 저장

        while (true) {
            data = is.read();
            if (data == -1)
                break;
            os.write(data);
        }

        os.flush();

        long end = System.nanoTime(); // 끝 시간 저장

        return end - start; // 복사에 걸린 시간 리턴
    }

    public static void main(String[] args) throws IOException {
        String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile.jpg").getPath();
        String targetFilePath1 = "C:/temp/targetFile1.jpg";
        InputStream fis1 = new FileInputStream(originalFilePath1);
        OutputStream fos1 = new FileOutputStream(targetFilePath1);

        String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile.jpg").getPath();
        String targetFilePath2 = "C:/temp/targetFile2.jpg";
        InputStream fis2 = new BufferedInputStream(new FileInputStream(originalFilePath2));
        OutputStream fos2 = new BufferedOutputStream (new FileOutputStream(targetFilePath2));

        long nonBufferTime = copy(fis1, fos1);
        System.out.printf("버퍼를 사용하지 않았을때:\t%12d ns\n", nonBufferTime);

        long bufferTime = copy(fis2, fos2);
        System.out.printf("버퍼를 사용했을 때:\t\t\t%12d ns\n", bufferTime);

        fis1.close();
        fos1.close();
        fis2.close();
        fos2.close();


    }
}
