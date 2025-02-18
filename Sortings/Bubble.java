public class Bubble
{
  public static void main(String [] mr)
  {
    int a[]={11,2,5,14,3,1,25};
    int n=a.length;
    for(int i=0;i<n-1;i++)
      {
 
        for(int j=0;j<n-i-1;j++)
        {
          if(a[j+1]<a[j])
          {
          int temp=a[j+1];
        a[j+1]=a[j];
        a[j]=temp;
          }
        }

      }
   for(int i=0;i<n;i++)
   {
     System.out.println(a[i]);
   }
  }
}
