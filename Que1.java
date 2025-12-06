
/**
 * Write a description of class Que1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Que1
{
    public static void main(String[] args){
        
        for(int i=2;i<=20;i++){
            if(i%2 ==1){
                continue;
            }
        System.out.println(i);
    }
    
    int j =2;
    while(j<=20){
        System.out.println(j);
        j=j+2;
    }
    
    int k=2;
    do{
        System.out.println(k);
        k=k+2;
    }while(k<=20);
}
}
