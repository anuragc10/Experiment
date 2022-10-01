import java.util.*;
class bubble2
//select a cell and compare it with next cell
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int i,j,t,k,swap,l;
        int a[]=new int[10];
        l=9;
        for(i=0;i<10;i++)
            a[i]=d.nextInt();
        do
        {
            swap=0;
            for(j=0;j<l;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    swap=1;
                }
            }
            l--;
            for(k=0;k<10;k++)
            System.out.print(a[k]+" ");
            System.out.println();
        }while(swap==1);
        
        for(i=0;i<10;i++)
            System.out.print(a[i]+" ");
    }
}
