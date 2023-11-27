package day06;

public class array3_quiz {
    public static void main(String[] args) {
        int[][][] a = new int[2][2][3];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                for (int z=0; z<a[0][0].length; z++){
                    a[i][j][z] = (int) (Math.random()*100);
                    System.out.print(a[i][j][z] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
