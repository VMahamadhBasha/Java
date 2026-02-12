import java.io.*;
public class Fileex {
    public static void main(String[] args) {
        try{
    
        FileWriter fw=new FileWriter("text.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("this is basha");
        bw.write("this is the moderin");
        bw.close();


    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}
