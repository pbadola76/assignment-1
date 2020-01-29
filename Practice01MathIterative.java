/**
 * Iterative
 * 
 * @author (Puja Badola)
 * Date (1/26/20)
 */
public class Practice01MathIterative implements Practice01Math
{
  public int fib(int n) throws Exception
  {
      if(n < 0)
      {
          throw new Exception("negative");
      }
      else if(n < 2)
      {
          return n;
      }
      else
      {
          int first = 1;
          int second = 1;
          int sum = 0;
          
          //Fibonacci Sequence, F_0 = 0, F_1 = 1, 
          //and F_n = F_n-1 + F_n-2 is valid for n>2.
          for(int i = 3; i <= n; i++)
          {
              sum = first + second;
              first = second;
              second = sum;
          }
          return sum; 
    }
  }
  public int fact(int n) throws Exception
  {
      //The value of 0! is 1, according to the convention for an empty product.
      if(n < 0){
        throw new Exception("negative");
      }
      else if(n < 2)
      {
          return n;
      }
      else
      {
          int current = n;
          int product = 0;
          for(int i = 1; i < n; i++)
          {
              product = current * (n-i);
              current = product;
          }
          return product;
      }
      
  }
  public static void main(String[] args)
  { 
      Practice01MathIterative num = new Practice01MathIterative();
  }
}