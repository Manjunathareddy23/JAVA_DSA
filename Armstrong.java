// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n=153;
        int s=0;
        int temp=n;
       while(n>0){
           int r=n%10;
           s=s+r*r*r;
           n/=10;
       }
       if(temp==s){
        System.out.println("armstrong");
           
       }
       else{
           System.out.println(" not A armstrong"); 
       }
    }
}
