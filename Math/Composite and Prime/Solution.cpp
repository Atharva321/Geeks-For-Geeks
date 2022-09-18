//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
	public:
		int Count(int L, int R){
		    // Code here
		    int p=0,c=0;
		    
		    for(int i=L;i<=R;i++)
		    {
		        if(i == 1 )
		        {
		            continue;
		        }
		        int l = sqrt(i);
		        int b = 1;
		        for(int j =2;j<=l;j++
		        )
		        {
		            if(i % j ==0)
		            {
		                b=0;
		                break;
		            }
		        }
		        if(b)
		        p++;
		        else
		        c++;
		    }
		    return c -p;
		}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int L, R;
		cin >> L >> R;
		Solution obj;
		int ans = obj.Count(L, R);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends
