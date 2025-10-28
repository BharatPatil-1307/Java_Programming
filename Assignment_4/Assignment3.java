import java.util.*;

class Assignment3
{
    public static void DisplayNonFactors(int iNo)
    {
        int iCnt = 0;
        System.out.println("Non-factors of " + iNo + " are:");

        for(iCnt = 1; iCnt < iNo; iCnt++)   // loop till iNo-1
        {
            if(iNo % iCnt != 0)   // if not divisible, it's a non-factor
            {
                System.out.print(iCnt + "\t");
            }
        }

        System.out.println(); // new line after output
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int iValue = sobj.nextInt();

        DisplayNonFactors(iValue);
    }
}
