
/**
 * Write a description of class bMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bMain
{
    public static void main(String[] args){
        Book b1=new Book();//object
        b1.title ="JJK";
        b1.author="Oda";
        b1.price=500;
        
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        
        Book b2=new Book();//object
        b2.title ="OneP";
        b2.author="Goda";
        b2.price=600;
        
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
        
    }
}