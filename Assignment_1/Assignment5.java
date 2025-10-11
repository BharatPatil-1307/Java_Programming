import java.util.*;

class Assignment5
{
    public static void Pattern(int No)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= No; iCnt++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        Pattern(iValue);
    }
}
