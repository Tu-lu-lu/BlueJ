
/**
 * Write a description of class TutorialC6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TutorialC6
{
    int agr; //instance variable
    static int rtr; //static variable
    public static void main(String[] args){
    
        int age=18;
        System.out.println(age);
        
        //<ClassName> <Variable> = new <ClassName>();
        TutorialC6 t1= new TutorialC6();
        System.out.println(t1.agr);
        System.out.println(t1.rtr);
        
        //Implicit typecasting
        double db=age;
        System.out.println(db);
        
        //Explicit typecasting
        double dbr=10.90;
        int itr=(int)dbr;
        
        System.out.println(itr);
        
        short st=10;
        short str=11;
        
        short sum= (short)(st+str);
        System.out.println(sum);
        
        byte by=5;
        byte byr=6;
        
        byte sum2=(byte)(by+byr);
        
        System.out.println(Byte.MAX_VALUE); //maximum value
        System.out.println(Byte.MIN_VALUE);// minimum value
        System.out.println(Byte.SIZE);//bits
        System.out.println(Byte.BYTES);//bytes
        
        //Escape sequence
        System.out.println("Hello\nWorld"); //for new line
        System.out.println("Hamro\tNepal");//for tabs
        System.out.println("She said \" Hi\" ");// double quotation
        
        //unicode escape sequence
        
        System.out.println("\u2764");
    }
}