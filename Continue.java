import java.util.*;
public class Continue
{
    public static void main(String args[])
    {
        System.out.println("Continue");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            continue;
            System.out.println(i);
        }
        

    }
}