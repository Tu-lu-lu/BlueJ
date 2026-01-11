package Week10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    public String calculateResult() {
        return marks >= 40 ? "Pass" : "Fail";
    }

    @Override
    public String toString()
    {
        return "Person details --> Student Roll No: "+getRollNo()+", \nStudent Name: "+ getName()+", Marks: "+ getMarks();
    }
}