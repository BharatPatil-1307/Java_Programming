import java.util.*;

class Assignment1
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        while(iCnt < iNo)
        {
            System.out.print("*\t");
            iCnt++;
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