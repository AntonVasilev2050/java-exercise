/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumeralsencoder;

/**
 *
 * @author vasil
 */
public class RomanNumeralsEncoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        solution(3485);
        System.out.println(solution(458));
        System.out.println(solution2(458));
    }
    public static String solution(int n){
        int n1000, n100, n10, n1, temp;
        String romanN = "";
        n1000 = n / 1000;
        temp = n % 1000;
        n100 = temp / 100;
        temp = temp % 100;
        n10 = temp / 10;
        temp = temp % 10;
        n1 = temp;
        if(n1000 > 3){
            return "Wrong enter";
        }
        for(int i = 1; i <= n1000; i++){
            romanN += 'M';
        }
        if(n100 <= 3){
            for(int i = 1; i <= n100; i++){
                romanN += 'C';
            }
        }
        if(n100 == 4){
            romanN += "CD";
        }
        if (n100 == 5){
            romanN += 'D';
        }
        if(n100 > 5 && n100 < 9){
            romanN += 'D';
            for(int i = 5; i < n100; i++){
                romanN += 'C';
            }
        }
        if(n100 == 9){
            romanN += "CM";
        }
        

        if(n10 <= 3){
            for(int i = 1; i <= n10; i++){
                romanN += 'X';
            }
        }
        if(n10 == 4){
            romanN += "XL";
        }
        if (n10 == 5){
            romanN += 'L';
        }
        if(n10 > 5 && n10 < 9){
            romanN += 'L';
            for(int i = 5; i < n10; i++){
                romanN += 'X';
            }
        }
        if(n10 == 9){
            romanN += "XC";
        }
        
        if(n1 <= 3){
            for(int i = 1; i <= n1; i++){
                romanN += 'I';
            }
        }
        if(n1 == 4){
            romanN += "IV";
        }
        if (n1 == 5){
            romanN += 'V';
        }
        if(n1 > 5 && n1 < 9){
            romanN += 'V';
            for(int i = 5; i < n1; i++){
                romanN += 'I';
            }
        }
        if(n1 == 9){
            romanN += "IX";
        }
        
        return romanN;
    }
    
    // Copyright https://www.codewars.com/users/dinglemouse
    public static String solution2(int n){
        String R1[]    = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String R10[]   = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String R100[]  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String R1000[] = {"", "M", "MM", "MMM" };
        return R1000[n/1000]+R100[n%1000/100]+R10[n%100/10]+R1[n%10];      
    }
    
}
