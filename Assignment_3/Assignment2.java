import java.util.*;

class Assignment2
{
    public static void DisplayFactor(int No)
    {
        if(No <= 0)
        {
            No = -No;
        }
        for(int i = 1; i <= No; i++)
        {
            if(No % i == 0)
            {
                System.out.print(i +"\t");
            }
        }
        System.out.println();

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int iValue = sobj.nextInt();

        DisplayFactor(iValue);
    }
}