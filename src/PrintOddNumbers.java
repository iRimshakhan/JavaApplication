public class PrintOddNumbers {
    // TODO: 08-07-2024 Task is to print ODD numbers between 1 to 100
    public static void main(String[] args) {
        for(int num=1; num<=100; num+=1) {     //using for loop
            if (num % 2 == 0)   // checking the no. is even or not
                continue;  //skip that iteration and continue
            else {
                System.out.println(num);
            }
        }

        System.out.println("\n\n");
        int Num=1;
        while(Num<=100){
            System.out.println(Num);
            Num += 2;  // num=num+2
        }

    }

}
