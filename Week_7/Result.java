package Week_7;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    int math;
    int english;
    int science;
    
    public Result(int math, int english, int science){
        this.math=math;
        this.english=english;
        this.science=science;
    }
    public void total(){
        int tot=math+english+science;
        int percent=tot/3;
        
        System.out.println("Total Marks is "+tot);
        System.out.println("Total Percentage is "+percent+"%");
    }
}