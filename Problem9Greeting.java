package week2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem9Greeting {
    public static void main(String[] args) {
//        greeting();
//        travelTimeBudget();
//        timeDifference();
        countryArea();
    }

//    public static void greeting(){
//        Scanner name= new Scanner(System.in);
//        String q;
//        System.out.print("Welcome to Vacation Planner!\n" +
//                        "What is your name: ");
//        q=name.nextLine();
//        System.out.print("Nice to meet you " +q+" ,");
//        String c;
//        System.out.print("where are you traveling to? ");
//        c=name.nextLine();
//        System.out.println("Great! "+c+" sounds like a great trip");
//        System.out.println("***********");
//
//    }
//
//    public static void travelTimeBudget(){
//        Scanner days= new Scanner(System.in);
//        double d;
//        System.out.print("How many days are you going to spend traveling? ");
//        d=days.nextDouble();
////        Scanner money= new Scanner(System.in);
//        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
//        double m;
//        m = days.nextDouble();
//      Scanner symbol= new Scanner(System.in);
//        String s;
//        System.out.print("What is the three letter currency symbol for your travel destination? ");
//        s=symbol.nextLine();
////        Scanner budget= new Scanner(System.in);
//        double b;
//        System.out.print("How many "+ s + " are there in 1 USD?  ");
//        b=days.nextDouble();
//        System.out.println();
//        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.println("If you are traveling for " +d+ " days that is same as "+  d*24+ " hours or " +d*24*60+ " minus or "+d*24*60*60+" seconds.\n" +
//                "If you are going to spend "+m+" USD that means per day you can spend up to $"+df.format(m/d)+" USD\n" +
//                "Your total budget in "+s+" is "+df.format(m*b)+" "+s+", which per day is "+df.format(m*b/d)+" "+s+"\n" +
//                "***********");
//    }
//
//
//    public static void timeDifference(){
//        Scanner time = new Scanner(System.in);
//        System.out.print("What is the time difference, in hours, between your home and your destination? ");
//        int a;
//        a=time.nextInt();
//        int b;
//        if (a>=0) {
//            b = a;
//            System.out.println("That means that when it is midnight at home it will be "+ b +":00 in your travel destination and when it's noon at home it will be "+(12+b)+":00\n" +
//                    "***********\n");
//        }
//        else {
//            b=12+a;
//            System.out.println("That means that when it is midnight at home it will be "+ (b+12) +":00 in your travel destination and when it's noon at home it will be "+b+":00\n" +
//                    "***********\n");
//        }


//    }

    public static void countryArea(){
        Scanner km = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2? ");
        int kilo;
        kilo=km.nextInt();
        DecimalFormat d = new DecimalFormat("#.##");
        System.out.println("In miles2 that is "+ d.format(kilo*0.621371));
        System.out.println("***********");

    }
}
