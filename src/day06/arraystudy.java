package day06;

public class arraystudy {
    public static void main(String[] args) {
        //1.
        int[][][] a = new int[2][2][3];
        //2.
        int[][][] a2 = new int[][][] {{{1,2,3},{4,5,6}},{{1,2,3},{4,5,6}}};
        //3.
        int[][][] a3 = {{{1,2,3},{4,5,6}},{{1,2,3},{4,5,6}}};

        System.out.println("면길이 : " + a3.length);
        System.out.println("행길이 : " + a3[0].length);
    }
}
