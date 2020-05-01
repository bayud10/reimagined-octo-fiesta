public class LCS 
{ 
  int bod( char[] X, char[] Y, int m, int n ) 
  { 
    if (m == 0 || n == 0) 
      return 0; 
    if (X[m-1] == Y[n-1]) 
      return 1 + bod(X, Y, m-1, n-1); 
    else
      return max(bod(X, Y, m, n-1), bod(X, Y, m-1, n)); 
  } 
  int max(int a, int b) 
  { 
    return (a > b)? a : b; 
  } 
  
  public static void main(String[] args) 
  { 
    LCS bod = new LCS(); 
    String s1 = "AGGTAB"; 
    String s2 = "GXTXAYB"; 
  
    char[] X=s1.toCharArray(); 
    char[] Y=s2.toCharArray(); 
    int m = X.length; 
    int n = Y.length; 
  
    System.out.println("Length of bod is" + " " + 
                                  bod.bod( X, Y, m, n ) ); 
  } 
  
} 