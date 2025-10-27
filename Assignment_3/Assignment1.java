import java.util.*;

class Assignment1
{
    public static void PrintEven(int No)
    {
        int iCnt = 2;
        if(No <= 0)
        {
            System.out.println("Plese Enter the Valid number");
            return;
        }
        System.out.print("Output :");
        for(iCnt = 1; iCnt <= No; iCnt++)
        {
            System.out.print(iCnt * 2 +"\t");
        }
        System.out.println();

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int iValue = sobj.nextInt();

        PrintEven(iValue);

    }
}