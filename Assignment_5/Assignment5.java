import java.util.*;

class Assignment5
{
    public static void MultipleDisplay(int iNo)
    {
        int iMul = 0;
        for(int iCnt = 1; iCnt <= 5; iCnt++)
        {
            iMul = iCnt * iNo;
            System.out.print(iMul +"\t");
        }
        System.out.println();
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int iValue = sobj.nextInt();

        MultipleDisplay(iValue);
    }
}