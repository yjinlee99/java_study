package day14;

import java.io.*;

public class fileCopy_BinaryCopy {
    public static void main(String[] args) {
        File src = new File("D:\\한화시스템\\sample\\dog.PNG");
        File dist = new File("D:\\한화시스템\\sample2\\dog2.PNG");

        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int c;

        try{
            fis = new FileInputStream(src); //파일입력바이트 스트림 연결
            fos = new FileOutputStream(dist); //파일 출력바이트 스트림 연결
            bis = new BufferedInputStream(fis); //버퍼 입력스트림 연결
            bos = new BufferedOutputStream(fos); //버퍼 출력스트림 연결

            while((c=bis.read()) != -1) {
                bos.write((char) c);
            }

            System.out.println("파일 복사 성공!!!");
            bis.close();
            bos.close();
            fos.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("파일복사오류");
        }
    }
}
