import java.util.Scanner;
public class Main{

    public static void main(String[]args){
  
        
        NumAdder MyAdder = (int a, int b) -> {

            int sum = 0; 
            
            for(int i=a; i<=b; i++){
                sum+=i; 
            }


            return sum; 

        }; 

        int result = MyAdder.add(Integer.parseInt(args[0]),Integer.parseInt(args[1])); 
        System.out.println("Result: "+result); //gives result


    }


}