public class Main{

    public static void main(String[]args){

        NumAdder MyAdder = (int a, int b) -> {

            int sum = 0; 
            
            for(int i=a; i<=b; i++){
                sum+=i; 
            }


            return sum; 

        }; 

        int result = MyAdder.add(1,2); 


    }


}