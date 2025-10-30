import java.util.*;

class Assignment4
{
    public static void DisplayOdd(int iNo)
    {
        int iCnt = 0 ;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 1)
            {
                System.out.print(iCnt +"\t");
            }
        }
        System.out.println();
        
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int iValue = sobj.nextInt();

        DisplayOdd(iValue);
    }
}