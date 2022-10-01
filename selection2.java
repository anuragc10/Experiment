import java.util.*;
class selection2
//select a cell and compare it with all other cells
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int i,j,t,k,min,p;
        int a[]=new int[10];
        for(i=0;i<10;i++)
            a[i]=d.nextInt();
        for(i=0;i<9;i++)//0 ->n-1
        {
            min=a[i];
            p=i;
            for(j=i+1;j<10;j++)//i+1 ->n
            {
                if(a[j]<min)//
                {
                    min=a[j];
                    p=j;
                }
            }
            System.out.print("Step "+(i+1)+":Swapped elements ->"+ a[i]+" "+a[p]+" Array:");
            t=a[i];
            a[i]=a[p];
            a[p]=t;
            for(k=0;k<10;k++)
            System.out.print(a[k]+" ");
            System.out.println();
        }
        for(i=0;i<10;i++)
            System.out.print(a[i]+" ");
    }
}
