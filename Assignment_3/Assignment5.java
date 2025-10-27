import java.util.*;

class Assignment5
{
    public static boolean CheckVowel(String CValue)
    {
        if ((CValue.compareTo("A") == 0) || (CValue.compareTo("E") == 0)|| (CValue.compareTo("I") == 0) || (CValue.compareTo("O") == 0) || (CValue.compareTo("U") == 0) ||
            (CValue.compareTo("a") == 0) || (CValue.compareTo("e") == 0)|| (CValue.compareTo("i") == 0) || (CValue.compareTo("o") == 0) || (CValue.compareTo("u") == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Charecter :");
        String str = sobj.nextLine();

        boolean bRet = CheckVowel(str);
        if(bRet == true)
        {
            System.out.println("It is Vowel");
        }
        else
        {
            System.out.println("Is is not Vowel");
        }

    }
}