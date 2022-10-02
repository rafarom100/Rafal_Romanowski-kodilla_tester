import java.util.Random;

public class RandomNumbers {
    static int min = 30;
    static int max;

    public static int getMin(){
        return min;
    }

    public static int getMax(){
        return max;
    }


    public static void main(String[] args) {
        Random random = new Random();

        int result = 0;
        int sum = 0;

        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;

        if(temp>max){
            max = temp;

        }
        if(temp<min){
            min = temp;

        }
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);

    }
}
