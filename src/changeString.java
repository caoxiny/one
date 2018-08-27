/**
 * Copyright (C), 2017-2018, 华星光电技术有限公司
 * FileName: changeString
 * Author:   caoxinyue
 * Date:     2018-8-19 14:46
 * Description: 翻转色子
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈翻转色子〉
 *
 * @author caoxinyue
 * @create 2018-8-19
 * @since 1.0.0
 */
public class changeString {
    private static Integer sta[]={1,2,3,4,5,6};
    public static void changeString(char a[]){
        for(int i=0;i<a.length;i++){
            if (a[i]=='l'){
                l();
            }
            if (a[i]=='r'){
                r();
            }
            if (a[i]=='f'){
                f();
            }
            if (a[i]=='b'){
                b();
            }
            if (a[i]=='a'){
                a();
            }
            if (a[i]=='c'){
                c();
            }
        }
    }
    public static void l(){
        int temp1=sta[1];
        int temp0=sta[0];
        sta[0]=sta[2];
        sta[1]=sta[3];
        sta[2]=temp1;
        sta[3]=temp0;
    }
    public static void r(){l();l();l();}
    public static void f(){
        int temp3=sta[3];
        int temp2=sta[2];
        sta[2]=sta[4];
        sta[3]=sta[5];
        sta[4]=temp3;
        sta[5]=temp2;
    }
    public static void b(){f();f();f();}
    public static void a(){
        int temp1=sta[1];
        int temp0=sta[0];
        sta[0]=sta[4];
        sta[1]=sta[5];
        sta[4]=temp1;
        sta[5]=temp0;
    }
    public static void c(){a();a();a();}
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        if(scan.hasNext()){
            char a[]=scan.next().toCharArray();
            changeString(a);
            for(int i=0;i<sta.length;i++){
                System.out.println(sta[i]);
            }
        }
        scan.close();
    }

}