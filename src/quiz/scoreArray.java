package quiz;

import java.util.Scanner;

public class scoreArray {
    public static void main(String[] args) {
        int INWON = 3;
        int SU = 3;
        Scanner sc = new Scanner(System.in);
        int[][] subject = new int[INWON][SU];
        int[][] nUserInfo = new int[INWON][3];
        String[] name = new String[INWON];

        for (int i=0; i<INWON; i++) {
            System.out.println("이름 입력");
            name[i] = sc.next();
            nUserInfo[i][0] = 0;
            for(int j=0; j<SU; j++) {
                System.out.println("과목 " + j + " 점수입력" );
                subject[i][j] = sc.nextInt();
                nUserInfo[i][0] += subject[i][j];
            }
            nUserInfo[i][1] = nUserInfo[i][0] / SU;

            if(nUserInfo[i][1] >= 90 && nUserInfo[i][1] <= 100) nUserInfo[i][2] = 'A';
            else if (nUserInfo[i][1] >= 80 && nUserInfo[i][1] < 90) nUserInfo[i][2] = 'B';
            else if (nUserInfo[i][1] >= 70 && nUserInfo[i][1] < 80) nUserInfo[i][2] = 'C';
            else if (nUserInfo[i][1] >= 60 && nUserInfo[i][1] < 70) nUserInfo[i][2] = 'D';
            else nUserInfo[i][2] = 'F';
        }

        System.out.println("name = ");
    }
}
