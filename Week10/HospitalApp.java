package Week10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] args){
    //usage of toString() method
    
    Person p1=new Person(101, "Sandesh");
    System.out.println(p1);
    
    Doctor d1=new Doctor(67,"Sui","Neuro",500);
    System.out.println(d1);
    
    Nurse n1=new Nurse(614,"norgya",10,100);
    System.out.println(n1);
}
}