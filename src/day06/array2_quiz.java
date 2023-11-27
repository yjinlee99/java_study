package day06;

public class array2_quiz {
    public static void main(String[] args) {
        int[][] score = new int[5][5];
        int sum=0;

        for (int i=0; i<score.length; i++){
            for (int j=0; j<score[0].length; j++){
                score[i][j] = (int) (Math.random()*100);
                System.out.print(score[i][j] + "\t");
                sum += score[i][j];
            }
            System.out.println();
        }

        System.out.println(sum + " " + (double)sum/25);
    }
}
