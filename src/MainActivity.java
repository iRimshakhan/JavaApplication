public class MainActivity {
    /*Data types in variables
     * primitive and Objects
     * int boolean float etc
     * String System Blueprint
     *
     * */

    /*int number =10;

//    Syntax Datatype VariableName = Value;

    boolean flag = true;

    float myFloat = 12.02f;

    String myString = "Fahim";
    BluePrintOfHouse bluePrintOfHouse = new BluePrintOfHouse();*/

    String myString;



    public static void main(String[] args) {

        MapDataHolder mapData = new MapDataHolder("Mumbai",3,1000,"abcd");
        MapDataHolder mapData1 = new MapDataHolder();
        System.out.println(mapData);
        System.out.println("locationName: "+mapData.getLocationName());
        System.out.println("rating: "+mapData.getRating());
        System.out.println("review: "+mapData.getReviewed());
        System.out.println("address: "+mapData.getAddress());
        System.out.println(mapData1);

        mapData1.setLocationName("Latur");
        mapData1.setAddress("LaturABD");
        mapData1.setRating(5);
        mapData1.setReviewed(1000);

        System.out.println("locationName: "+mapData1.getLocationName());
        System.out.println("rating: "+mapData1.getRating());
        System.out.println("review: "+mapData1.getReviewed());
        System.out.println("address: "+mapData1.getAddress());

        IsEvenOdd isEvenOddObject = new IsEvenOdd(10);
        System.out.println(isEvenOddObject);
        boolean isEven = isEvenOddObject.isEven();
        boolean isOdd = isEvenOddObject.isOdd();

        System.out.println(isEven);
        System.out.println(isOdd);

        BluePrintOfHouse bluePrintOfHouse = new BluePrintOfHouse(1,1,1,1,false,1);
        System.out.println(bluePrintOfHouse);
        System.out.println(bluePrintOfHouse.getNoOfBedrooms());
        System.out.println(bluePrintOfHouse.getNoOfKitchen());
        System.out.println(bluePrintOfHouse.getNoOfToilets());
        System.out.println(bluePrintOfHouse.getNoOfWashrooms());
        System.out.println(bluePrintOfHouse.isAttached());

    }



}