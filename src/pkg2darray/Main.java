package pkg2darray;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
//        // this a 2d array containing player scores
//        int [][] array = {{28,16,67},{76,23,41},{7,99,56}};
//        int playerNumber = 1;
//        //outer loop to traverse the rows
//        for(int x = 0;x<array[0].length;x++){
//            int tempSum = 0;
//            //inner loop to traverse the columns
//            for(int y = 0;y<array.length;y++){
//                // accumulator to total the scores for each player
//                tempSum = tempSum + array[x][y];
//            }
//            System.out.println("the total for player "+ playerNumber +" is " +tempSum);
//        playerNumber++;
//        }
        
        Scanner scan = new Scanner(System.in);
        
        String [][] arr = new String[3][3];
        
        for (int x=0; x<3; x++){
            for (int y = 0;y<3;y++){
                
                System.out.println("Give me a name");
                
                String name = scan.nextLine();
                arr[x][y] = name;
                
            }
        }

        System.out.println("who would you like to search for?");
        
        String search = scan.nextLine();
        
        boolean found = false;
        
        
        
        for (int x=0; x<3; x++){
            for (int y = 0;y<3;y++){
        if (search.equals(arr[x][y])){
            found = true;
                     
        }
        
            }
        } if (found==true){
            System.out.println(search + " has been found");
        }
        else{
            System.out.println(search + " has not been found");
        }
    
         for (int x=0; x<3; x++){
            for (int y = 0;y<3;y++){
                
                System.out.println(arr[x][y]);
                
               
            }
        }
        
        System.out.println(Arrays.deepToString(arr));
    }

}
