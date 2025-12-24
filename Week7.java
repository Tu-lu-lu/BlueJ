
/**
 * Write a description of class Week7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week7
{
    public static void main(String[] args){
    // <classname> variable_name = new className();
    
    //object creation
    Student s1= new Student("np01cp4s",22,"Computing"); //constructor
    
    /*
    s1.StudentId ="np01cp4s20035";
    s1.age=22;
    s1.course="Computing";
    s1.study();
    */
    
    System.out.println(s1.StudentId);
    System.out.println(s1.age);
    System.out.println(s1.course);
    
    /*
    Student s2=new Student();
    s2.StudentId="np01cp3a005";
    s2.age=25;
    s2.course="Networking";
    s2.laugh();
    
    System.out.println(s2.StudentId);
    System.out.println(s2.age);
    System.out.println(s2.course);
    */
}
}