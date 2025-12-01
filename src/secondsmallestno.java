public class secondsmallestno {
    public static void main(String[] args) {
        int a[]={33,55,44,66,77};
        int b=a.length;

        for(int i=0; i<b; i++)
        {
            int count=0;
            for(int j=0; j<b; j++)
            {
                if(a[i]>a[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(a[i]);
            }
        }
    }
}
