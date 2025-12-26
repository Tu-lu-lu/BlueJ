package Week8;


/**
 * Write a description of class StudentTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    public static void main(String[] args){
    
    Student st1=new Student("Tulu",101,982356927);
    Student.setCollegeName("Islington College");
    System.out.println(Student.getCollegeName());
    st1.displayInfo();
    }
}