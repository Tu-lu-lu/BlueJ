package Week8;
import java.util.Scanner;


/**
 * Write a description of class ElecMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElecMain
{
    public static void main(String[] args){
        ElectricityBill e1=new ElectricityBill("Norgay the climber",500);
        System.out.println(e1.calculateBill());
    }
}