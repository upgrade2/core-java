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
    }
}
