/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k
 */
import java.util.Scanner;
public class NthFibonacci {
    public void run(){
        
        int nthTerm = AskUser();
        int lastDigit = nthTerm % 10;
        int secondLastDigit = (( nthTerm % 100 ) - lastDigit) / 10 ;
        System.out.println();
        if (lastDigit == 1 && secondLastDigit != 1){
            System.out.println(nthTerm + "st term of the Fibonnaci sequence is :");
            
        }else if (lastDigit == 2 && secondLastDigit != 1){
            System.out.println(nthTerm + "nd term of the Fibonnaci sequence is :");
  
        }else if (lastDigit == 3 && secondLastDigit != 1){
            System.out.println(nthTerm + "rd term of the Fibonnaci sequence is :");
        }else{
            System.out.println(nthTerm + "th term of the Fibonnaci sequence is :");
        }
        
        int result = Fib(nthTerm);
        System.out.println(result);
    }
    public static void main(String [] args ){
        NthFibonacci n = new NthFibonacci();
        n.run();
    }
    
    private int inp;
    private int AskUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Nth term of the Fibonnaci sequence :");
        try {
            inp = sc.nextInt();
            if (inp > 0 && inp <= 2000){
                
            }else if ( inp > 2000){
                System.out.println("Input something smaller");
                AskUser();
            }else{
                System.out.println("Input positive integer only");
                AskUser();
            }
            
        }catch (Exception InputMisMatchException){
            System.out.println("Input positive integer only");
            AskUser();
        }
        return(inp);
    }
    private int nthResult;
    private int Fib( int n){
        int un1 = 0; // U0
        int un2 = 1; // U1
        nthResult = 1;
        for (int i = 0 ; i < n-1 ; i ++ ){
            nthResult = 0;
            nthResult = un1 + un2;
            un1 = un2;
            un2 = nthResult;
            
            
        }
        return (nthResult);
    }
}
