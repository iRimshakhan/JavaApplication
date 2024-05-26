public class Main {
    /*Data types in variables
     * primitive and Objects
     * int boolean float etc
     * String System Blueprint
     *
     * */

    /*int number = 10;

//    Syntax Datatype VariableName = Value;

    boolean flag = true;

    float myFloat = 12.02f;

    String myString = "Fahim";
    BluePrintOfHouse bluePrintOfHouse = new BluePrintOfHouse();*/




    public static void main(String[] args) {

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