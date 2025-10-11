import java.util.*;

class Assignment4
{
    public static boolean Check(int No)
    {
        boolean bCheck = false;
        if(No % 5 == 0)
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

        int iValue = 0, iCnt = 0;
        boolean bRet = false;

        System.out.print("Enter the Number To check Divisible 5 or Not :");
        iValue = sobj.nextInt();

        bRet = Check(iValue);

        if(bRet == true)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not Divisible by 5");
        }

    }
}
