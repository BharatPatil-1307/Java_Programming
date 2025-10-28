import java.util.*;

class Assignment2
{
    public static void FactReverse(int iNo)
    {
        int iCnt = 0;
        System.out.println("Factors of " + iNo + " in decreasing order are:");
        for(int iCnt = iNo / 2; iCnt >= 1; iCnt--)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int iValue = sobj.nextInt();

        FactReverse(iValue);
    }
}
