import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("///home/user/Documents/kavuri/LearnJava.pdf");
        BufferedWriter bufferWriter=new BufferedWriter(fileWriter);

        for (int i=0;i<10;i++){
            bufferWriter.write("line"+i);
        }
        buffere

    }

}
