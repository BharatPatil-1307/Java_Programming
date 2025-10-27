import java.util.*;

class Assignment3

{
    public static void Display(int iNo)
    {
        if(iNo <= 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        int iValue = sobj.nextInt();

        Display(iValue);
    }
}