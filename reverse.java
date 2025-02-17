// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n=237;
        int s=0;
       while(n>0){
           int r=n%10;
           s=s*10+r;
           n/=10;
       }
       
        System.out.println(s);
    }
}
