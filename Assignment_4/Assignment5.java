import java.util.*;

class Assignment5
{
    public static int FactDiff(int iNo)
    {
        int iCnt = 0 , iSum = 0 , iFact = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++) 
        {
            if(iNo % iCnt != 0) 
            {
                iSum = iSum + iCnt;
            }
            else
            {
                iFact = iFact + iCnt;
            }
        }
        System.out.print("(" + iFact + " - " + iSum + ")");
        System.out.println();
        return (iFact - iSum);
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int iValue = sobj.nextInt();

        int iRet = FactDiff(iValue);

        System.out.println("Summation FactDiff :" + iRet);
    }
}
