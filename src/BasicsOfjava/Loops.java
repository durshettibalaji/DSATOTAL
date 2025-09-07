package BasicsOfjava;

public class Loops {
    public static void main(String args[]){
        ForLoop fl = new ForLoop();
        fl.useForLoop(7);
        System.out.println();
        fl.useForLoop(5);

        System.out.println();
        System.out.println();
        System.out.println("WHILE LOOOP ");
        WhileLoop wl =new WhileLoop();
        wl.useWhileLoop(5);
        System.out.println();
        System.out.println();
        System.out.println("Do while loop ");
        DoWhileLoop dl = new DoWhileLoop();
        dl.useDoWhileLoop(-10);
        System.out.println();
        dl.useDoWhileLoop(5);
    }
}


class ForLoop{
    void useForLoop(int n){
        for(int i=0;i<n;i++){
            System.out.print(i+" ");
        }
    }
}

class WhileLoop{
    void useWhileLoop(int n){
        int i=0;
        while(i<n){
            System.out.print(i+" ");
            i++;
        }
    }
}

class DoWhileLoop{
    void useDoWhileLoop(int n){
        int i=0;
        do{
            System.out.print(  i+" ");
            i++;
        }
        while(i<n);
    }
}