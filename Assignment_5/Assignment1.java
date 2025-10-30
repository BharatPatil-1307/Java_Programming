import java.util.*;

class Assignment1
{
    public static void Pattern(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("$\t*\t");
        }
        System.out.println();
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int iValue = sobj.nextInt();

        Pattern(iValue);
    }
}