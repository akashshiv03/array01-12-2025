public class findsecondlargesno {
    public static void main(String args[])
    {
        int a[]={11,12,33,84,59};
        int b=a.length;
        int c=0;

        for(int i=0; i<b; i++)
        {
            int count=0;
            for(int j=0; j<b; j++)
            {
                if(a[i]<a[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
