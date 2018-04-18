package demoFileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileinputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:\\demoFileinoputstream.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fin.close();
        }
	}

}
