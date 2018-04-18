package demoBufferedFileInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class BufferedInputStream1 {


	
		// TODO Auto-generated method stub
		 public static void main1(String args[]) throws IOException {
		        FileInputStream fin = null;
		        BufferedInputStream bin = null;
		 
		        try {
		            fin = new FileInputStream("D:\\testout.txt");
		            bin = new BufferedInputStream(fin);
		            int i;
		            while ((i = bin.read()) != -1) {
		                System.out.print((char) i);
		            }
		        } catch (IOException e) {
		            System.out.println(e);
		        } finally {
		            bin.close();
		            fin.close();
		        }
		 }

}
