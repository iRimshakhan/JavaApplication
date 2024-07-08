public class ForEach {
    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] cars = new String[10];

        System.out.println("print size:"+cars.length);
        for (int index=0;index<cars.length;index=index+1){
            // TODO: 08-07-2024 Entry of 10 cars
            System.out.println(cars[index]);
        }
        // TODO: 08-07-2024 Changes update car list
//        cars[3] = "Ferrari";
//        cars[4] = "Audi";

        for (String item : cars) {
            System.out.println(item);
        }



    }

}
