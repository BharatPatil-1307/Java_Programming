import java.util.*;

class Assignment1
{
    public static int MulFact(int iNo)
    {
        int iCnt = 0, iMul = 1;
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt);
                System.out.print(" * ");
                iMul = iMul * iCnt;
            }
        }
        System.out.println();
        return iMul;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int iValue  = sobj.nextInt();

        int iRet = MulFact(iValue);

        System.out.println("Multiplication is Factors is :" + iRet);
    }
}