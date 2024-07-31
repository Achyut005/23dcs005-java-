
import java.util.Scanner;

class complex{
    int r,i;
    int sumi,sumr;
    Scanner s=new Scanner(System.in);
    void setr(){
        System.out.print("enter real number :");
        r=s.nextInt();
    }
    void seti(){
        System.out.print("enter imaginary number :");
        i=s.nextInt();
    }
    void sum(complex c){
        sumi=i+c.i;
        sumr=r+c.r;
        System.out.println(sumr+"+"+sumi+"i");
    }

}
public class pr16 {
    public static void main(String[] args) {
        complex c1=new complex();
        complex c2=new complex();
        c1.setr(); 
        c1.seti();
        c2.setr();
        c2.seti();
        c1.sum(c2);
    }
}
