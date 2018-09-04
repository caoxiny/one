/**
 * Copyright (C), 2017-2018, 华星光电技术有限公司
 * FileName: hanXinDianBing
 * Author:   caoxinyue
 * Date:     2018-9-4 10:57
 * Description: 韩信点兵
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈韩信点兵〉
 *
 * @author caoxinyue
 * @create 2018-9-4
 * @since 1.0.0
 */
public class hanXinDianBing {
    public static void hanXinDianBingOne(){
        //遍历
        for(int a=0;a<34;a++){
            for(int b=0;b<15;b++){
                for(int c=0;c<21;c++){
                    if(3*a+1==7*b-2){
                        if(3*a+1==5*c){
                            System.out.println("共有士兵："+5*c);
                            System.out.println("3排"+a);
                            System.out.println("7排"+b);
                        }
                    }
                }
            }
        }
    }
    public static void hanXinDianBingTwo(){
        //取余数
        int a=0,b=0,c=0,num;
        for(num=0;num<101;num++){
            a=num%3;
            b=num%7;
            c=num%5;
            if(a==1&&b==5&c==0){
                System.out.println("共有士兵："+num);
            }
        }
    }
    public static void main (String[] args){
        hanXinDianBingOne();
        hanXinDianBingTwo();
    }
}