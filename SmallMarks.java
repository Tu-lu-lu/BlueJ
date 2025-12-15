
/**
 * Write a description of class SmallMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SmallMarks
{
    public static void main(String[] args){
        int[][] mark={{80,75},{90,85}};
        System.out.println("Students    English    Nepali");
        System.out.println("Student1    "+mark[0][0]+"    "+mark[0][1]);
        System.out.println("Student2    "+mark[1][0]+"    "+mark[1][1]);
        
        int j=1;
        for (int i = 0; i < 2; i++) {
            int total = mark[i][0] + mark[i][1];
            System.out.println("Student" +j+ "\n" +total);
            j++;
    }
    
}
}