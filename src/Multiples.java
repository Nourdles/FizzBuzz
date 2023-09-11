public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        for (int num = 1; num < 1000; num++){
            boolean divisableBy3 = num % 3 == 0;
            boolean divisableBy5 = num % 5 == 0;

            if (divisableBy3 || divisableBy5){
                count++;
            }
        }

        System.out.println(count);
    }
}
