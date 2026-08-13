import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q1:
        int num1, num2;
        System.out.println("Enter the first number ");
        num1=sc.nextInt();
        System.out.println("Enter the second number ");
        num2=sc.nextInt();
        System.out.println("the sum = "+(num1+num2));
        System.out.println("the subtract = "+(num1-num2));
        System.out.println("the multiply ="+(num1*num2));
        System.out.println("the divide = "+(num1/num2));
        System.out.println("the mod = "+(num1%num2));



        //Q2:

        int input;
        System.out.println("input a number: ");
        input=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*input);
        }



        //Q3

        double peri,a,p=3.14,r,power;
        System.out.println("Enter the radius: ");
        r=sc.nextDouble();
        power=Math.pow(r,2);
        a=p*power;
        peri=2*p*r;
        System.out.println("perimeter: "+peri);
        System.out.println("Area: "+a);


        //Q4

      int h,counnt,times,sum=0,ava=0;
        System.out.println("Enter how many times you want to Enter a number");
        times=sc.nextInt();
        for( h=1;h<=times;h++){
            System.out.println("Enter the number: ");
            counnt=sc.nextInt();
            sum=sum+counnt;
            ava=sum/times;

        }

        System.out.println(ava);








        //Q5
     int numm1,numm2,numm3;
        System.out.println("Enter the first input: ");
        numm1=sc.nextInt();
        System.out.println("Enter the second input: ");
        numm2=sc.nextInt();
        System.out.println("Enter the third input: ");
        numm3=sc.nextInt();
        if(numm1+numm2==numm3){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


//Q6
       String word;
        System.out.println("input a word ");
        word=sc.nextLine();
        for(int r=word.length()-1;r>-1;r--){
            System.out.print(word.charAt(r));

        }


       //Q7
        int numbers;
        System.out.println("Enter a number: ");
        numbers=sc.nextInt();
        if(numbers%2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("the number is odd");
        }


        //Q8
       double Celsius,Fahrenheit,mm;
        System.out.println("Enter Temperature in Celsius:");
        Celsius=sc.nextDouble();
        mm=Celsius*1.8;
        Fahrenheit=mm+32;
        System.out.println("Temperature in Fahrenheit: "+Fahrenheit);


//Q9
        String data;
        int index;
        System.out.println("Enter a String: ");
        data=sc.nextLine();
        System.out.println("Enter a number: ");
        index=sc.nextInt();
        for(int ind=0;ind<=index;ind++){
            if(ind==index){
                System.out.println(data.charAt(ind));
            }
        }



     //Q10

        double width=5.5, hieght=8.5,area,perimeter;

        area=width*hieght;
        perimeter=2*(width+hieght);
        System.out.println(area);
        System.out.println(perimeter);


        //Q11
       int com1,com2;
        System.out.println("Enter the first number:");
        com1=sc.nextInt();
        System.out.println("Enter the second number: ");
        com2=sc.nextInt();
        if(com1<com2){

            System.out.println(com1+"<"+com2);
            System.out.println(com1+"<="+com2);
            System.out.println(com1+"!="+com2);

        }else if(com1>com2){
            System.out.println(com1+">"+com2);
            System.out.println(com1+">="+com2);
            System.out.println(com1+"!="+com2);
        }else if(com1==com2){
            System.out.println(com1+"=="+com2);
        }


    //Q12
      int seconds,hours,reminder,see;
        System.out.println("Enter the the seconds: ");
        seconds=sc.nextInt();
        hours=seconds/3600;
        reminder=seconds%3600;

        reminder=reminder/60;
        see=reminder%60;
        System.out.println(hours+","+reminder+","+see);



        //Q13
       int one ,two, three ,four;
        System.out.println("Enter the first number ");
        one=sc.nextInt();
        System.out.println("Enter the second number ");
        two=sc.nextInt();
        System.out.println("Enter the third number ");
        three=sc.nextInt();
        System.out.println("Enter the fourth number ");
        four=sc.nextInt();
        if(one==two){
            if(two==three){
                if(three==four){
                    System.out.println("Numbers are equal");
                }else{
                    System.out.println("they are not equal!");

                }
            }else{
                System.out.println("they are not equal!");

            }
        }else{
            System.out.println("they are not equal!");
        }


        //Q14
     int value;
        System.out.println("Enter a number: ");
        value= sc.nextInt();
        if(value>0){
            System.out.println("number is Positive ");
        }else if(value<0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("the number is zero ");
        }

        */

        //Q15
        int iteration,count,positive=0,negative=0,zeros=0,add;
        System.out.println("how many numbers you want to put ");
        iteration=sc.nextInt();
        System.out.println("Enter the numbers ");

        for(int c=0;c<iteration;c++){
               count=sc.nextInt();
               if(count>0){
                   positive=positive+iteration;

               }else if(count<0){
                   negative=negative+iteration;
               }

           }



        System.out.println(positive);
        System.out.println(negative);


       //Q16
      String nu;
        System.out.println("Enter the numbers ");
        nu=sc.nextLine();
        for(int reve=nu.length()-1;reve>-1;reve--){
            System.out.print(nu.charAt(reve));
        }



     //Q17
     int nummbers;
        System.out.println("Enter the numbers ");
        boolean stop=true;


        do {
            nummbers=sc.nextInt();
            if(){
                System.out.println("the largest");
            }



        }while(nummbers==-100);













//Q19
        String enter,charecter;

        int i=0;

        System.out.println("Enter a String");
        enter=sc.nextLine();
        System.out.println("Enter a charecter");
        charecter=sc.nextLine();

        for(int m=0;m<enter.length();m++){

            if(enter.charAt(m)==charecter.charAt(0))
            {
                i++;


           }
        }
        System.out.println("number of a's: "+i);



    }
}