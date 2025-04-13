package lambda;

public class MyInterImpl implements MyInter{

    @Override
    public void sayHello(){
        System.out.println("Implementation through Normal Class ");
    }

    public static void main(String[] args) {

        //Normar class
        MyInter i = new MyInterImpl();
        i.sayHello();

        //from anonymous class .
        MyInter i1  = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is from Anonymous class ");
            }
        };
        i1.sayHello();

        //from lambda
        MyInter i2 = ()->System.out.println("Through Lambda");
        i2.sayHello();

        //lambda sum
        SumInter sumLabda = (a ,b)->a+b;
        System.out.println("Sum : "+sumLabda.sum(10,20));
        System.out.println("Sum : "+sumLabda.sum(30,10));

        //lambda length of string
        LengthString lengthString = (str -> str.length());
        System.out.println("length of the string "+lengthString.lengthString("India"));
    }
}
