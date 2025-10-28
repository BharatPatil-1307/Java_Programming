import java.util.*;

class Assignment4
{
    public static int SummationNonFactors(int iNo)
    {
        int iCnt = 0 , iSum = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++) 
        {
            if(iNo % iCnt != 0) 
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int iValue = sobj.nextInt();

        int iRet = SummationNonFactors(iValue);

        System.out.println("Summation of Non-Factors :" + iRet);
    }
}
