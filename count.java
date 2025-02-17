// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int k[]={1,56,2,3,5,8,6,8,4,1,1,2};
        int count=0;
        for (int i =0;i<k.length;i++)
        {
            if(k[i]==1){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
