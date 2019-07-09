public class Printer implements Runnable {

   public void run() {
        for(int i=0;i<10;i++){
            try
            {
                Thread.sleep(500);
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            }

            catch(Exception ex)
            {
                System.out.println("Exception has" +
                        " been caught" + ex);
            }
            System.out.println(i);
        }

    }



  /* public class Printer extends Thread {
       @Override
       public void start() {

               System.out.println("this is start");
              super.start();
       }*/

           //no need to create run method/it is not must bcz it will check thread class if there is run method

    /*public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("copy run" +currentThread().getName()+" "+ i);
        }
    }


       public void run(int x){
           for (int i = 0; i < 10; i++) {
               System.out.println("copy run" +currentThread().getName()+" "+ i);
           }
       }*/


    }

