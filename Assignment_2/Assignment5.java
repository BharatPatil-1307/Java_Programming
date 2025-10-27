import java.util.*;

class Assignment5
{
    public static boolean CheckEvenOrOdd(int No)
    {
        if(No % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number to Check Number is Even Or Odd :");
        int iValue = sobj.nextInt();

        boolean bRet = CheckEvenOrOdd(iValue);

        if(bRet == true)
        {
            System.out.println(iValue +": Number is Even");
        }
        else
        {
            System.out.println(iValue +": Number is Odd");
        }
    }
}