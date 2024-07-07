public class Student {
    // Student data
    String studentName = "John Doe";
    int studentID = 15;
    int studentAge = 23;
    float studentFee = 75.25f;
    char studentGrade = 'B';

    public static void main(String[] args) {
        Student student = new Student();
        
        // Print Student data
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Student ID: " + student.studentID);
        System.out.println("Student Age: " + student.studentAge);
        System.out.println("Student Fee: $" + student.studentFee);
        System.out.println("Student Grade: " + student.studentGrade);
    }
}
