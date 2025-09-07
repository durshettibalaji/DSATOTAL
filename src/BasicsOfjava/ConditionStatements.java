package BasicsOfjava;

public class ConditionStatements {
    public static void main(String arg[]){
        IfElse ie = new IfElse();
        ie.test(10);
        ie.test(1);
        ie.test(3);
        ie.test(15);
        ie.test(62);

        System.out.println("\n\n\n\n\n");

        SwitchStatement sw= new SwitchStatement();
        sw.test(2);
        sw.test(1);
        sw.test(3);
        sw.test(8596);
    }
}


class IfElse {
    void test(int n) {
        if(n == 1){
            System.out.println("neither prime nor not prime ");
        }
       else if (n % 2 == 0) {
            System.out.println("prime number ");
        } else {
            System.out.println("not prime number ");
        }
    }
}


class SwitchStatement{
    void  test(int n){
        switch (n){
            case 1:
                System.out.println("n is 1");
                break;
            case 2:
                System.out.println("n is 2");
            case 3:
                System.out.println("n is 3");
                System.out.println("if u not give break it will print next case also");
            case 4:
                System.out.println("n is 4");
                break;
            default:
                System.out.println("u have given number not present in 1,2,3,4 ");

        }
    }
}
