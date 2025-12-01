public class totateleftright12345 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b=a.length;
        int c=0;
        int k=2;
        int temp[]=new int[b];
        for(int i=b-k; i<b; i++ )
        {
           temp[c++]=a[i];
        }
        for(int i=0; i<b-k; i++)
        {
            temp[c++]=a[i];
        }
        for(int i=0; i<b; i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
