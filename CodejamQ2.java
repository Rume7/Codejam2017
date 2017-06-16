import java.io.*;
import java.util.*;

public class CodejamQ2 {

	private static InputReader in;
  	private static PrintWriter out;
  	public static boolean SUBMIT = true;
  	public static final String NAME = "B-small-attempt2";

  	private static boolean isTidy( int n ) throws IOException {
       if ( n < 10 ) { return true; }
       else {
             while ( n > 0 ) {
                 int a = n % 10;
                 n /= 10;
                 int b = n % 10;
                 if ( b > a ) { return false;}
              }
             return true;
          }
    }

  private static void tidy() throws IOException {
    int n = in.nextInt();
    for( int i = n; n > 0; i--) {
         if ( isTidy(i) ) { 
            out.println(i);
          return;
           }
      }
  }

  public static void main(String[] args) throws IOException {
    if (SUBMIT) {
      in = new InputReader(new FileInputStream(new File(NAME + ".in")));
      out = new PrintWriter(new BufferedWriter(new FileWriter(NAME + ".out")));
    } else {
      in = new InputReader(System.in);
      out = new PrintWriter(System.out, true);
    }

    int numCases = in.nextInt();
    for (int test = 1; test <= numCases; test++) {
      out.print("Case #" + test + ": ");
      tidy();
    }

    out.close();
    System.exit(0);
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }
	
}