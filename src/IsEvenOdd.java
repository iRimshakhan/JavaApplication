public final class IsEvenOdd {
    private final int number;

    public IsEvenOdd(int number){
        this.number = number;

    }


    public boolean isEven() {
        System.out.println("Starting isEven Function");
        boolean numberIsEven = false;
        numberIsEven = number % 2 == 0;
        return numberIsEven;

    }

    public boolean isOdd() {
        System.out.println("Starting isOdd Function");
        boolean numberIsOdd = false;
        numberIsOdd = !(number % 2 == 0);
        return numberIsOdd;

    }
}
