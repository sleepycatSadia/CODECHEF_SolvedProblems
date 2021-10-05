import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int T=1;
    boolean flag=false;
    while(T<=x){
      String N=sc.next();
      char []c=N.toCharArray();
      int i=c.length-1;
      while(i>=0){
      if(flag==false){
          if(c[i]!='0'){
            flag=true;
          }
        }
      if(flag==true){
        System.out.print(c[i]);
      }
      i--;
    }
    System.out.println();
    T++;
    flag=false;
  }
  sc.close();
}
}