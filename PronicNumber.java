/**Write a program to input a number and check and print whether it is a Pronic number or not. [Pronic number is the number which is the product of two consecutive integers.]
Examples:
12 = 3 * 4
20 = 4 * 5
42 = 6 * 7 */

import java.util.*;
public class PronicNumber
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<num;i++)
        {
            if(i*(i+1)==num)
            {
                count++;
                break;
            }
        }
        if(count>0)
        System.out.println("Pronic Number");
        else
        System.out.println("Not a Pronic Number");
    }
}
