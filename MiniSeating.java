
/**
 * Write a description of class MiniSeating here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniSeating
{
    public static void main(String[] args){
        String[][] seats= new String[2][3];
        seats[0][0]="Tulu";
        seats[0][0]="JP";
        seats[0][0]="GP";
        
        for(int i=0; i<seats.length; i++){
            for(int j=0; j<seats[i].length; j++){
                if(seats[i][j]==null){
                    System.out.print("empty");
                }else{
                    System.out.print(seats[i][j]);
                }
            }
            System.out.println();
        }
    }
}