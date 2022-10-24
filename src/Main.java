
//implementing the adapter pattern using composition
public class Main {
    public static void main(String[] args) {
        Client a = new Client();
        a.methodA();
    }



}
/*
standard interface Adaptor
 */
interface Adaptor
{
    void methodA();

}


class Adaptee1
{
    public void method1(){
        System.out.println("Method1");
    };
}

class AdapteeN
{
    public void methodN(){
        System.out.println("MethodN");
    };
}


/*
the client class leads the classes to the required interface
 */
class Client implements Adaptor
{
    AdapteeN adapt = new AdapteeN();

    public void methodA(){
        adapt.methodN();
    }
}
