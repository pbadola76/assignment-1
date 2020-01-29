/**
 * @author (Puja Badola)
 * @version (1/26/20)
 */
public class Practice01MathRecursive implements Practice01Math {
  public int fib(int n) throws Exception
  {

      if (n < 0)
      {
        throw new Exception("negative");
      } 
      else if(n < 2)
      {
        return n;
      } 
      return fib(n - 1) + fib(n -2);
  
      
    
  }
  public int fact(int n) throws Exception
  {
    
      if (n < 0)
      {
        throw new Exception("negative");
      } 
      else if(n < 2)
      {
        return n;
      } 
      return n * fact(n-1); 
    
    
  }
  public static void main(String[] args)
  { 
    Practice01MathRecursive num = new Practice01MathRecursive();
  }
}
