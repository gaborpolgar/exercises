package hackerrank;

public class JavaLoopsII {

        public static void main(String []argh){
            int t=1;
            for(int i=0;i<t;i++){
                int a = 0;
                int b = 2;
                int n = 10;
                for (int j = 0; j < n; j++) {
                    a = a + (int) Math.pow(b, j)*b;
                    System.out.print(a + " ");
                }
                System.out.println(" ");
            }
        }
}
