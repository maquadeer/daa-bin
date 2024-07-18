/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort054;

/**
 *
 * @author Student
 */
public class MergeSort054 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array={25,16,31,12,5};
        mergesort(array,0,array.length-1);
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    static void mergesort(int a[],int l,int h)
    {
        int m=(l+h)/2;
        if(l<h)
        {
            mergesort(a,l,m);
            mergesort(a,m+1,h);
            merge(a,l,m,h);
        }
    }
    static void merge(int a[],int l,int m,int h)
    {
        int [] b=new int [10];
        int i=l,j=m+1,k=l;
        while((i<=m)&&(j<=h))
        {
            if(a[i]<a[j])
            {
                b[k]=a[i];
                i++;
            }
            else
            {
                b[k]=a[j];
                j++;
            }
            k++;
        }
            if(i>m)
                for(int p=j;p<=h;p++)
                {
                    b[k]=a[p];
                    k++;
                }
            if(j>h)
            for(int p=i;p<=m;p++)
                {
                    
                    b[k]=a[p];
                    k++;
                }
            for(i=l;i<=h;i++)
                a[i]=b[i];
    }
    
}
