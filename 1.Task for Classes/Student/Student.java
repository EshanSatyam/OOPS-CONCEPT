
package Student;

public class Student {

    /* Student properties */
    private int rollNumber;
    private String name;
    private String course;
    private int marks1;
    private int marks2;
    private int marks3;

   public Student(int rollNumber, String name, String course, int marks1, int marks2, int marks3){
       this.rollNumber = rollNumber;
       this.name = name;
       this.course = course;
       this.marks1 = marks1;
       this.marks2 = marks2;
       this.marks3 = marks3;
   }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    //Methods

    public int calculateTotal(){

       return marks1 + marks2 + marks3;
    }

    public double calculateAverage(){

       return calculateTotal()/3.0;
    }

    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return "A+";
        } else if (average >= 80 && average < 90) {
            return "A";
        } else if (average >= 70 && average < 80) {
            return "B+";
        } else if (average >= 60 && average < 70){
            return "B";
        } else if (average >= 50 && average < 60) {
            return "C";
        } else {
            return "F";
        }
    }

    @Override
    public String toString(){

       return "Roll Number: " + rollNumber + "\nName: " + name + "\nCourse: " + course
               + "\nMarks 1: " + marks1 + "\nMarks 2: " + marks2 + "\nMarks 3: " + marks3
               + "\nTotal Marks: " + calculateTotal() + "\nAverage Marks: " + calculateAverage()
               + "\nGrade Scored: " + calculateGrade();
    }

}