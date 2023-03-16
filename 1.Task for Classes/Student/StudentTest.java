package Student;

public class StudentTest {
    public static void main(String[] args){
        // Create some Student objects
        Student student1 = new Student(1, "Sukant", "Math", 80, 90, 85);
        Student student2 = new Student(2, "Abhishek", "Science", 75, 75, 85);
        Student student3 = new Student(3, "Aastha", "English", 50, 55, 60);
        Student student4 = new Student(4, "Rishika", "History", 70, 75, 80);
        Student student5 = new Student(5, "Pranjal", "Computer Science", 85, 90, 95);

        // Print details for each student
        System.out.println(student1.toString());
        System.out.println();
        System.out.println(student2.toString());
        System.out.println();
        System.out.println(student3.toString());
        System.out.println();
        System.out.println(student4.toString());
        System.out.println();
        System.out.println(student5.toString());
        System.out.println();
    }
}
