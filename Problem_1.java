import java.util.*;
class Problem_1
{
   // This fn. is used to return indices of the two numbers such that they add up to a specific target.
   public static ArrayList<Integer> findIndices(int[] nums,int target)
   {
       Map<Integer,Integer> mp=new HashMap<>(); //stores the result of target-nums[i] as key and indices as the value if the result is not already present in the map
       ArrayList<Integer> ar=new ArrayList<Integer>(); // Arraylist of type integer stores the result i.e index of two no. that add up to the target
       for(int i=0;i<nums.length;i++)
       {
           int comp=target-nums[i];  //comp is used to store the difference of target and nums[i]
           if(mp.containsKey(comp)) // check if map i.e mp contains the difference as the key
           {
               ar.add(mp.get(comp)); //if the condition is true, add the result to the arraylist ar and come out of the loop.
               ar.add(i);
               break;
            }
            else
            {
                mp.put(nums[i],i); // if the condition is false then store the no. as well as index as key and value respectively.
            }
        }
        return ar; // return the arraylist that stores the result
    }
    // main function.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> res=new ArrayList<Integer>();//Arraylist of type integer stores the result
        int n=sc.nextInt();   //Input length of the array 
        int nums[]=new int[n]; //create an array nums of size n
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();  // input the elements of the array
        }
        int target=sc.nextInt();  // input target value
       res=findIndices(nums,target); //call method findIndices(nums,target) that returns arraylist of type integer and store the result in res(Arraylist)
       for(int i=0;i<res.size();i++)
       {
           System.out.print(res.get(i)+" "); //print the index of the two numbers that add up to a specific target.
        }
    }
}
    
   