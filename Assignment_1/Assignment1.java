import java.util.*;

class Assignment1
{
     public static int Divide(int No1, int No2)
    {
        int iAns = 0;

        if (No2 == 0)
        {
            return -1; 
        }

        iAns = No1 / No2;
        return iAns;
    }

    public static void main(String A[])
    {
        int iValue1 = 15, iValue2 = 5;
        int iRet = 0;

        iRet = Divide(iValue1 , iValue2);
        
        System.out.println("Divisible is :" + iRet);
    }
}