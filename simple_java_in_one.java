package com.aryan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=3,b=2;
        String v="i am aryan";
        double k=45.987d;
        boolean isadult = true;
        //using operators
        System.out.println("this is a string: "+v);
        System.out.println("the is double: "+k);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(isadult);


        //taking input
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value");
        int z=scan.nextInt();                 //scans the next integer value
        System.out.println("value: "+z);
        System.out.println("enter the value of string");
        String s=scan.nextLine();
        System.out.println("value of s: "+s);


        //using methods
        String name="Aryan";
        System.out.println(name.length());          //length of string method
        System.out.println(name.toUpperCase());     //upper case conversion
        System.out.println(name.toLowerCase());     //lower case conversion
        System.out.println(name);
        
        int n1=3,n2=5;
        System.out.println(Math.max(n1,n2));       //maximum of two input 
        System.out.println(Math.min(n1,n2));      //minimum of two input
        System.out.println(Math.sqrt(n2));        //square_root function
        System.out.println(Math.abs(-22));        //absolute value
        System.out.println(Math.abs(2.6));
        System.out.println(Math.random());        //generate random number
        System.out.println(4+9*Math.random());
        System.out.println(4+(8-4)*Math.random());

       //  control statements
       // if()
       // {

       // }
       // else if()
       // {

       // }
       // else()
       // {

       // }


       // switch ()
       // {
       //     case 1:
       //         System.out.println();
       //         break;

       //     case 2:
       //         System.out.println("");
       //         break;
       //     default:
       //         System.out.println();

       // }

       // f=0;
       // while(f<11)
       // {
       //     System.out.println(f);
       //     f++;
       // }

       // int g;
       // do
       // {
       //     System.out.println(g);
       //     g++;
       // }while(g<=5)


       // for(o=1;o<=8;o++)
       // {
       //     System.out.println(o);
       // }


       // if(v==2)
       // {
       //     System.out.println(v);
       //     continue;
       // }
       // else
       // {
       //     System.out.println("not found");
       // }



        //ARRAYS

        int [] marks={22,3,12,43,29};
        marks[2]=899;           //updated at 2nd index
        System.out.println(marks[2]);
        for(int e=0;e<marks.length;e++) {
            System.out.println(marks[e]);
        }
        System.out.println("this is the classical ways to iterate arrays");
        //for each loop
        for(int value:marks) {
            System.out.println(value);
        }
        System.out.println("this is the new way to iter");

        //matrices--multi dimen arrays

        int [][] mtr={{34,2,65,2},{25,5,2,5,99}};
        System.out.println(mtr[0][2]);

        String [] veh={"hyu","inn","toyo","vern"};
        for(String valu:veh) {
            System.out.println(valu);
        }

        try
        {
            System.out.println(veh[100]);
        }
        catch(Exception e)
        {
            System.out.println("Excepon e");
        }
        System.out.println("masreees");


        //mini calculator

        float no1,no2;
        Scanner scan1= new Scanner(System.in);
        System.out.println("enter the first no.: ");
        no1=scan1.nextFloat();
        System.out.println("enter the second no.: ");
        no2=scan1.nextFloat();
        System.out.println("you have entered"+no1+"and"+no2);
        String prompt="enter 1 for addition, 2 for subtraction, 3 for multiplication";
        System.out.println(prompt);
        int input=scan1.nextInt();
        switch (input)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("nothing");

        }
    }
}
