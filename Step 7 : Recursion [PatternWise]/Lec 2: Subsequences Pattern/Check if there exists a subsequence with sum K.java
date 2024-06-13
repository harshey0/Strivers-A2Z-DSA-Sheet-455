
public class Solution {
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        for(long x=0;x<(1<<n);x++)
        {
            int s=0;long p=x;int c=n-1;
            while(p>0)
            {
                s+=a[c]*(p&1);
                c--;p=p>>1;
            }
            if(s==k)
            return true;
        }
        return false;
    }
}

// bool search(int n, int k, vector<int> &a, int index,  int sum){
//     if(sum==k){
//         return true;
//     }
    
//     if(index>=n || sum>k){
//         return false;
//     }
    

//         if(search(n,k,a,index+1,sum+a[index])){
//             return true;
//     }

//     if(search(n,k,a,index+1,sum)){
//         return true;
//     }
//     return false;
// }


// bool isSubsetPresent(int n, int k, vector<int> &a)
// {
//     return search(n,k,a,0,0);
    
// }