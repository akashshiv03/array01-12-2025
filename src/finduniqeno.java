import java.util.Scanner;

public class finduniqeno {
    public static void main(String[] args) {
       int a[]={1,2,3,2,3};
       int b=a.length;

       int c=0;

       for(int i=0; i<b; i++)
       {
           int count=0;
           for(int j=0; j<i; j++)
           {
               if(a[i]==a[j])
               {
                   count++;
               }
           }
           if(count==i)
           {
               System.out.println(a[i]+" ");
           }
       }

    }
}
