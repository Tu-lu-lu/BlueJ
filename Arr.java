
/**
 * Write a description of class Arr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arr
{
    public static void main(String[] args){
    
    /*
    int[] age; //array declaration
    age= new int[5];// constructing array
    
    System.out.println(age.length); // finding length of array
    
    //initialization of array
    age[0]=10;
    age[1]=20;
    age[2]=30;
    age[3]=40;
    age[4]=50;
    
    
    //Accessing an individual element
    System.out.println(age[1]);
    */
    
    //Traversing an array
    int[] agr={10, 20, 30, 40, 50};
    
    for(int i=0; i<agr.length;i++){
        
        System.out.println(agr[i]);
    }
    
    for(int i=agr.length-1;i>=0; i--){
        
        System.out.println(agr[i]);
    }
    
    //Matrix 2D Array
    
    int[][] matrix; //declaring 2d array
    matrix= new int[2][2];//constructing a 2d array
    
    matrix[0][0]=10;
    matrix[0][1]=20;
    matrix[1][0]=30;
    matrix[1][1]=40;
    
    //2D array in one line
    int[][] mat={{1,2,3},{4,5,6,7},{7,8,9,10,11}};
    //mat[2][2];
    
    for(int i=0; i<mat.length;i++){
        //System.out.print(mat[i]);
        for(int j=0; j< mat[i].length;j++){
            System.out.println(mat[i][j]);
            //for(int k=0; k<mat[i][j].length;k++){
                
            //}
        }
        }
    }
}