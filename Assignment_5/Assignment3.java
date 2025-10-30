import java.util.*;

class Assignment3
{
    public static void Display(int iNo)
    {
        for(int iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
           System.out.print(-iCnt +"\t"); 
        }
        System.out.println();
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int iValue = sobj.nextInt();

        Display(iValue);
    }
}