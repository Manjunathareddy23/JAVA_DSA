// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n=15;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
            
        }
        else{
            System.out.println(" not a Prime");
        }
    
        
    }
}
