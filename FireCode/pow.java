public static double pow(double x, int n) {
        double ans=1;
        if(n>0) for(int i=1;i<=n;i++) ans*=x;
        else for(int i=-1;i>=n;i--) ans/=x;
        return ans;


}