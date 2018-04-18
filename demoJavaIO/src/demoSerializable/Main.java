package demoSerializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serializable e = new Serializable();
		e.name = "Tran Anh Vu";
		e.address = "138 Le Duan - P.Nguyen Du - Q.Hai Ba Trung - Ha Noi";
		e.SSN = 11122333;
		e.number = 101;

		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\employee.data");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in C:\\employee.data");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	}


