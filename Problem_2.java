import java.util.*;
class Problem_2
{
    // fn to check whether no.is palindrome or not
   public static boolean isPalindrome(int num)
   {
       String s=String.valueOf(num); //convert number i.e num to string and store value in s 
        boolean result=true; //assign result initially to true
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j)) //check whether the last digit is equal to first digit and so on. 
            {
                result=false; // if the digits are not equal then assign false to result and come out of the loop using break statement.
                break;
            }
        }
        return result; // return the result
    }
    //main fn.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); // input the number
        boolean result=isPalindrome(num); // call the function isPalindrome(num) and store the result in result
        System.out.println(result); // print the boolean value i.e whether number is palindrome or not.
    }
}