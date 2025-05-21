class Solution5 {
    public void rotate(int[][] m) {
     int n=m.length;
     for(int i=0;i<n;i++){
        for(int j=i;j<m[0].length;j++){
            int t=m[i][j];
            m[i][j]=m[j][i];
            m[j][i]=t;

        }
        

     }   
     for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int t=m[i][j];
             m[i][j]=m[i][n-1-j];
            m[i][n-1-j]=t;
        } 

        }
    }
}