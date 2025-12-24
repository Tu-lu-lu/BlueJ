
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //attributes or properties    
    
        String StudentId;
        int age;
        String course;
        
        public Student(String Id,int agr,String course)
        {
            this.StudentId=Id;
            this.age=agr;
            this.course=course;
        }
        
        //behaviours or methods
        
        public void study()
        {
            System.out.println(StudentId+"is studying.");
            
        }
        public void laugh()
        {
            System.out.println(StudentId+"is laughing.");
        }
}