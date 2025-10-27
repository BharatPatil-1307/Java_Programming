import java.util.*;

class Assignment3
{
    public static void DisplayEvenFactors(int No)
    {
        int i = 0;
        if(No <= 0)
        {
            No = -No;
        }
        System.out.print("EvenFactors is :");
        for(i = 1; i < No; i++)
        {
            if((No % i == 0) && (No % 2 == 0))
            {
                System.out.print("\t"+i);
            }
        }
        System.out.println();
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int iValue = sobj.nextInt();

        DisplayEvenFactors(iValue);
    }
}