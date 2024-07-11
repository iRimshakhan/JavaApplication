public class PrintEvenNumbers {
    // TODO: 08-07-2024 Task is to print Even numbers between 1 to 100
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");

        for (int num = 2; num <= 100; num += 2) {
            System.out.print(num + " ");
        }
    }
}