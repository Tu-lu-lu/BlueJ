package Week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //attributes
    private String name;
    private int id;
    private long phoneNumber;
    private static String collegeName;
    
    //Constructor
    public Student(String name, int id, long phoneNumber)
    {
        this.name=name;
        this.id=id;
        this.phoneNumber=phoneNumber;
    } 
    //getters and setters methods
    public static void setCollegeName(String nameClg)
    {
        collegeName= nameClg;
    }
    
    public static String getCollegeName()
    {
        return collegeName;
    }
    
    public void setName(String name)
    {
        this.name= name;
    }
    public String getName()
    {
        return this.name; 
    }
    public void setId(int id)
    {
        this.id= id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setPhoneNumber(long number)
    {
        this.phoneNumber= phoneNumber;
    }
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public void displayInfo()
    {
       String namee= this.getName();
       int ID= this.getId();
       long phoneNum=this.getPhoneNumber();
       
       System.out.println("Name of the student is: "+namee);
       System.out.println("Id of the student is: "+ID);
       System.out.println("Phone Number of the student is: "+phoneNum);
    }
    
}