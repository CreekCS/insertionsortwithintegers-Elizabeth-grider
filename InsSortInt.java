import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException; 


public class InsSortInt {
 public static void main(String[] args){
    int[] arrInt = new int[1000]; 
    int i =0; 
    String[] arrString = new String[1000]; 
    try {
        File file = new File("randints.txt"); 
        Scanner reader = new Scanner(file); 
     while (reader.hasNextLine()){
        String num= reader.nextLine(); 
        i++; 
    } 
    }
 

    catch(FileNotFoundException e){
        System.out.println("Error"); 
        e.printStackTrace(); 
    }
    for(int j=0; j<1000; j++){
        arrInt[j]= Integer.parseInt(arrString[j]); 

    }
    for(i=0; i<1000; i++){
        int key =arrInt[i]; 
        int j =i+1; 
        while(j>=0&&arrInt[j]>key){
            arrInt[j+1]= arrInt[j]; 
            j=j-1; 

        }
        arrInt[j+1]=key; 

    }
    System.out.println("smallest is "+arrInt[0] + "largest is " +arrInt[1000]); 
 }
}




 
