package test;
import java.util.Arrays;
import java.util.Scanner;

public class ceil {
    public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);
       
        int num = inp.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<nums.length;i++) {
        	nums[i]=inp.nextInt();
        
        int floor = -1, ceil = -1;
        int index = Arrays.binarySearch(nums, num);

        if (index < 0) { 
            index = -(index + 1);
            if (index == 0) {
                floor = -1;
                ceil = nums[0];
            } else if (index == nums.length) {
                floor = nums[nums.length - 1];
                ceil = -1;
            } else {
                floor = nums[index - 1];
                ceil = nums[index];
            }
        } else { 
            floor = nums[index];
            ceil = nums[index];
        }
        
        
        System.out.println("Number " + num + " -> ceil is " + ceil + ", floor is " + floor);
    }
}
}
    