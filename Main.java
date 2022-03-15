public class Main extends Thread{


    public void run() {
        System.out.println("Hello All");

    }


    public static void main(String args[]) {
        Thread t1=new Main();
        t1.start();
        Thread t3=new Main();
        t3.start();
        Thread t4=new Main();
        t4.start();
        Thread t5=new Main();
        t5.start();
        Thread t6=new Main();
        t6.start();
    }
}
