import java.io.*;
import java.util.*;
class CopyFile{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Provide source file name:");
        String sfile = sc.next();
        System.out.print("Provide destination file name:");
        String dfile=sc.next();
        FileReader fin = FileReader(sfile);
        FileWriter fout = new FileWriter(dfile,true);

        int c;
        while((c=fin.read()) !=-1){
            fout.write(c);
        }
        System.out.println("Copy finished...");
        fin.close();
        fout.close();
    }
}
    

