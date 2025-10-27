import java.util.*;

class Assignment4
{
    public static void DisplayConvert(char cValue)
    {

        if(cValue >= 'a' && cValue <= 'z')
        {
            System.out.print("Converted Charecter is :" + (char)(cValue - 32));
        }
        else if(cValue >= 'A' && cValue <= 'Z')
        {
           System.out.print("Converted Charecter is :"  + (char)(cValue + 32)); 
        }
        else
        {
            System.out.println("It is not an alphabet character.");
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Charecter :");
        char str = sobj.next().charAt(0);

        DisplayConvert(str);

    }
}