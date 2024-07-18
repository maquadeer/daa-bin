
package knapsack054;
public class Knapsack054 {
    public static void main(String[] args) {
        int m=20;
        int w[]={18,8,10};
        int p[]={20,12,15};
        GreedyKnapsack(w,p,m);
    }
    static void GreedyKnapsack(int w[],int p[],int m){
        int n=w.length;
        int i;
        double x[]=new double[10];
        for(i=0;i<n;i++)
            x[i]=0.0;
        float u=m;
        for(i=0;i<n;i++){
            if(w[i]>u){
                break;
            }
            x[i]=1.0;
            u-=w[i];
        }
        if(i<=n){
            x[i]=u/w[i];
        }
        float total=0;
        for(i=0;i<n;i++){
            System.out.println("Quatities of the object "+(i+1)+": "+x[i]);
            System.out.println("Profit of the object "+(i+1)+": "+p[i]*x[i]);
        }
        for(i=0;i<n;i++){
            total+=p[i]*x[i];
        }
        System.out.println("Total profit: "+total);
    }
    
}
