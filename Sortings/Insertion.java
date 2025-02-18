public class Insertion
{
  public static void main(String [] mr)
  {
    int a[]={11,2,5,14,3,1,25};
    int n=a.length;
    for(int i=0;i<n;i++)
      {
        int j=i;
        while(j>0 && a[j-1]>a[j]  )
        {
            int temp=a[j-1];
            a[j-1]=a[j];
            a[j]=temp;
            j--;
        }
      }
   for(int i=0;i<n;i++)
   {
     System.out.println(a[i]);
   }
  }
}
