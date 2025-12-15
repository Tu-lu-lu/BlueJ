
/**
 * Write a description of class MiniBookCorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniBookCorner
{
    public static void main(String[] args){
        
        String[] categories={"Fiction","Nepali"};
        String[][] titles= new String[2][1];
        double[][] prices= new double[2][1];
        
        titles[0][0]="Asahamati-5";//first row first column
        prices[0][0]=750.0;
        
        titles[1][0]="Muna Madan";//second row first column
        prices[1][0]=500.0;
        
        for(int i=0; i<2;i++){
            System.out.println(categories[i]+" : "+titles[i][0]+" - Rs."+String.format("%.2f", prices[i][0]));
            
        }
    }
}