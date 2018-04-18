package demoJava.io.File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("D:/thong");
		
		//tạo thư mục thong
		boolean Create = dir.mkdir();
		System.out.println("Thu muc da tao chua: ? " + Create);
		
		//tạo file thong.txt trong thu mục thong vừa tạo
		File txt = new File("D:/thong/thong.txt");
		File txt1 = new File("D:/thong/thong1.txt");
		File txt2 = new File("D:/thong/thong2.txt");
		Create = txt.createNewFile();
		txt1.createNewFile();
		txt2.createNewFile();
		System.out.println("File da tao chua: ? " + Create);

		System.out.println("Path exists? " + txt.exists());
		 
        if (txt.exists()) {
 
            // Kiểm tra 'txt' có phải là một thư mục hay không?
            System.out.println("Có phải thư mục không? " + txt.isDirectory());
 
            // Kiểm tra 'txt' là một đường dẫn ẩn hay không?
            System.out.println("Có một đường dẫn ẩn hay không? " + txt.isHidden());
 
            // Tên đơn giản.
            System.out.println("Name: " + txt.getName());
 
            // Đường dẫn tuyêt đối.
            System.out.println("Absolute Path: " + txt.getAbsolutePath());
 
            // Kiểm tra kích thước file (Theo đơn vị byte):
            System.out.println("Length (bytes): " + txt.length());
 
            // Thời điểm sửa lần cuối (mili giây)
            long lastMofifyInMillis = txt.lastModified();
            Date lastModifyDate = new Date(lastMofifyInMillis);
 
            System.out.println("Last modify date: " + lastModifyDate);
        }
        
        // Xóa file txt
        Create = txt.delete();
        System.out.println("File da xóa chua: ? " + Create);
        
        //Xem tất cả thư mục gốc
        File[] roots = File.listRoots();
        for(File root: roots)
        {
        	System.out.println(root.getAbsolutePath());
        }
        
        //xem tất cả tập tin và thư mục trong thư mục gốc
        File[] Childrens = dir.listFiles();
        for(File file: Childrens)
        {
        	System.out.println(file.getAbsolutePath());
        }
        
	}

}
