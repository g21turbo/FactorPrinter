public class Main {
    public static void main(String[] args) {

        printFactors(10);
        printFactors(25);
        printFactors(2654);

    }


    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int factor = 0;

        while (factor <= number) {
            factor++;
            if (number % factor == 0){
                System.out.println(factor);
            }
        }
    }
}