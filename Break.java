import java.util.*;
public class Break
{
    public static void main(String args[])
    {
        System.out.println("Break");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            break;
            System.out.println(i);
        }
        

    }
}