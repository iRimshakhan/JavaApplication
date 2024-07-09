public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Loop start");

        for (int index = 1; index <= 10; index++) {
            System.out.println("loop begin at index");
            System.out.println(index + "");
            System.out.println(" loop completes");
        }
        System.out.println("forloop end");
        System.out.println("\n\n");

//        int yasin = 5;
//        yasin = yasin + 1;// -> yasin++ short form
//

// TODO: 05-07-2024 Print 10 to 1 numbers using for loop
        for(int i=10; i>0; i-=1){
            System.out.println(i);
        }


    }
}
