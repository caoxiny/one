import java.util.Scanner;

/**
 * 〈两个数倒置后再求和〉<br>
 * 〈〉
 *
 * @author caoxinyue
 * @create 2018-8-18
 * @since 1.0.0
 */
public class reverseadd{


    public static double reverseadd(Integer a,Integer b){
        if(0<=a||0<=b||a<=Integer.MAX_VALUE||b<=Double.MAX_VALUE) {
            Integer sum=-1;
            StringBuffer ra=new StringBuffer(Integer.toString(a));
            StringBuffer rb=new StringBuffer(Integer.toString(b));
            ra=ra.reverse();
            rb=rb.reverse();
            sum=Integer.valueOf(ra.toString())+Integer.valueOf(rb.toString());
            return sum;
        }else{return -1;}

    }

    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        if(scan.hasNext()){
            String s = scan.next();
            String[] c=s.split(",");
            System.out.println(reverseadd(Integer.valueOf(c[0]),Integer.valueOf(c[1])));
        }
        scan.close();
    }

}