public class leftside0andrightside1 {
    public static void main(String[] args) {
        int a[]={1,0,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,0};
        int b=a.length;
        int c=0;
        int temp[]=new int[b];
        for(int i=0; i<b; i++)
        {
            if(a[i]==0) {
                temp[c++] = 0;
            }
        }
        for(int i=0; i<b; i++)
        {
            if(a[i]==1) {
                temp[c++] = 1;
            }
        }
        for(int i=0; i<b; i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
