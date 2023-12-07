import java.util.Scanner;
public class Main{

    public static void main(String[]args){

        Scanner reader= new Scanner(System.in);
        String nums= reader.nextLine();
        String[] numArray= nums.split(" ");

        


        NumAdder MyAdder = (int a, int b) -> {

            int sum = 0; 
            
            for(int i=a; i<=b; i++){
                sum+=i; 
            }


            return sum; 

        }; 

        int result = MyAdder.add(Integer.parseInt(numArray[0]),Integer.parseInt(numArray[1])); 
        System.out.println("Result: "+result);


    }


}