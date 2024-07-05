public class ReferenceTypeDemo {

    // Define a class representing a simple object with a single integer field
    static class SimpleObject {
        int value;

        SimpleObject(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // Create an instance of SimpleObject
        SimpleObject originalObject = new SimpleObject(10);
        System.out.println("Original object value: " + originalObject.value);

        // Copy the reference of originalObject to another reference variable
        SimpleObject copiedReference = originalObject;

        // Modify the object using the copied reference
        copiedReference.value = 99;
        System.out.println("Modified copied object value: " + copiedReference.value);


        // Print the value of the original object to show that it has changed
        System.out.println("Modified original object value via copied reference: " + originalObject.value);
    }
}
