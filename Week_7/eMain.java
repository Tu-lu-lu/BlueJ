package Week_7;


/**
 * Write a description of class eMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class eMain
{
    public static void main(String[] args){
        Employees e1=new Employees();
        e1.id=1;
        e1.name="Norgyat";
        e1.salary=20000;
        
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);
        
        Employees e2=new Employees();
        e2.id=2;
        e2.name="SanSUIII";
        e2.salary=50000;
        
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e2.salary);
        
        Employees e3=new Employees();
        e3.id=1;
        e3.name="Bob";
        e3.salary=40000;
        
        System.out.println(e3.id);
        System.out.println(e3.name);
        System.out.println(e3.salary);
        
        if(e1.salary>e2.salary & e1.salary>e3.salary){
            System.out.println(e1.name+" has highest salary");
            System.out.println(e1.id);
            System.out.println(e1.salary);
        }
        else if(e2.salary>e1.salary & e2.salary>e3.salary){
            System.out.println(e2.name+" has highest salary");
            System.out.println(e2.id);
            System.out.println(e2.salary);
        }
        else{
            System.out.println(e3.name+" has highest salary");
            System.out.println(e3.id);
            System.out.println(e3.salary);
        }
    }
}