import java.util.*;
class main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.print(maximumSumSubarray(k,arr,n));
    }
    static int maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        int i=0,j=0;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        while(j<n){
            sum+=arr.get(j);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                ans=Math.max(ans,sum);
                sum-=arr.get(i);
                i++;j++;
            }
        }
        return ans;
    }
}