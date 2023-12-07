import java.util.Arrays;

public class Main {

    public int solution(int[] numbers) {
        int answer = 0;
        int n = 0;
        Arrays.sort(numbers);

        for (int number : numbers) {
            while (n != number) {
                answer += n;
                n++;
            }
            n++;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] a= {0,1,2};
    }
}