package demoFileOutputStream;

import java.io.IOException;
import java.io.*;
public class outputstream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = null;
	　　　　try {
	　　　　　　fout = new FileOutputStream("D://fileWrite5.txt");
	　　　　　　for (int i = 0; i < 10; i++) {
	　　　　　　　　fout.write(("line content : " + (i + 1) + "\n").getBytes());
	　　　　　　}
	　　　　} catch (IOException e) {
	　　　　　　e.printStackTrace();
	　　　　} finally {
	　　　　　　if (null != fout) {
	　　　　　　　　fout.close();
	　　　　　　}
	　　　　}
	}

}