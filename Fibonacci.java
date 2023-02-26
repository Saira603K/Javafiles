public class Fibonacci
{
  static in fib(int n)
  {
    int a =0, b =1, c:
    if(n==0)
      System.out.println(0);
    else if(n==1)
      Systen.out.println(a + " " + b);
    for (int 1 =2; i <=n; i++)
    {
      c = a+b;
      a = b;
      b = c;
      System.out.println(c + " ");
     }
     return b;
   }
   public static void main(String args[])
   {
      fib(7);
   }
   }
