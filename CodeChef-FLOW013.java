import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int x=1;x<=t;x++){
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a+b+c==180)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}