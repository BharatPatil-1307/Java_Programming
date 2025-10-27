import java.util.*;

class Assignment4
{
    public static void Display(int No1 , int No2)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < No2; iCnt++)
        {
            System.out.print(No1 +"\t");
        }
        System.out.println();
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int iValue = sobj.nextInt();
        System.out.println("Enter Number that you want display in it :");
        int iValue2 = sobj.nextInt();

        Display(iValue , iValue2);
    }
}