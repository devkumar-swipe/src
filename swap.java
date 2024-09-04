public class swap {
    public static void main(String[]args){

        //let
        int x = 9;
        int y= 12;   // it is because of xor operation ;

        //now swaping 
        x= x^y;
        y = x^y;
        x = x^y;
        
        
        System.out.println("value of x is now : "+x);
        System.out.println("value of y is now : "+y);
    }
    
}
