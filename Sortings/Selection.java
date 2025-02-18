public class Selection
{
  ppublic static void main(String [] mr)
  {
    int a[]={ 11,2,5,14,3,1,25};
    int n=a.length;
    for(int i=0;i<n-1;i++)
      {
        int small=i;
        for(int j=i+1;j<n;j++)
        {
          if(a[j]<a[small])
          {
            small=j;
          }
        }
        int temp=a[small];
        a[small]=a[i];
        a[i]=a[small];
      }
   for(int i=0;i<n;i++)
   {
     System.out.println(a[i]);
   }
  }
}
