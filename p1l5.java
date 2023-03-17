import java.util.*;
public class p1l5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number = ");
        int n1=sc.nextInt();
        System.out.println("enter the 2nd number = ");
        int n2=sc.nextInt();
        System.out.println("enter the 3rd number = ");
        int n3=sc.nextInt();
        System.out.println("the greater number is = ");
        if(n1>n2)
        {
            if(n1>n3)
                System.out.println(n1);
            else
                System.out.println(n3);
        }
        else
        {
            if(n2>n3)
                System.out.println(n2);
            else
                System.out.println(n3);
        }
    }
}