public class Application {
    public static void main(String[] args) {

        Printer printer=new Printer();
       //***pass the runnable interface to thread class it tells us thread class has more than one constructor
        //**every thread create stack and each method execute by thread and create a frame inside stack
        //**u can use 8 different way to create stack
        //**thread are normally start with 1,highest priority is 10 lowest priority is 1.because
        // thread are not index and also not rank.if u give the priority beyond the highest it give illegal exception also
        //main thread default value only 5 other than that child class inherit from main thread priotity value.

       // System.out.println("main before"+Thread.currentThread().getPriority());
      //  Thread.currentThread().setPriority(1);


        Thread thread=new Thread(printer);


        //thread.setDaemon(true);
        //**JVM do all the things when start method invoke
       // thread.setPriority(10);
       // System.out.println("main"+Thread.currentThread().getPriority());
      //  System.out.println("child"+thread.getPriority());
        //printer.start();
        thread.start();
        try
        {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            thread.join(20);
        }

        catch(Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }
        //**without start method if u invoke run method that do simple execution there is no thread will created
        //thread.run();

       // **if main thread terminate is it java program termin ate???no it is not
        for (int i=0;i<5;i++) {
            System.out.println("main"+" "+thread.currentThread().getName()+" "+i);
        }
        System.out.println("=========================================");
    }
}
