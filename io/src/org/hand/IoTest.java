package org.hand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class IoTest {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		read();
	}
	private static void read() throws FileNotFoundException,IOException{
		URL url = new URL("http://www.madore.org/~david/math/padics.pdf");
		URLConnection  conn = url.openConnection();
		//File file = new File();//读取URL地址文件
		InputStream inputStream = conn.getInputStream();
		System.out.println(conn.getConnectTimeout());
		/*FileInputStream fis=new FileInputStream();*/
        InputStreamReader isr=new InputStreamReader(inputStream,"utf-8");
        FileOutputStream fos=new FileOutputStream("D:\\test.txt");
        /*if(fos){
        	
        }*/
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
		
		BufferedReader bufferedReader = new BufferedReader(isr);
		String line = null;
		//File file1 = new File("D:\\workspace\test.pdf");
		/*if(fos.exists()){
			fos.createNewFile();//创建文件
			
		}*/
		BufferedWriter bufferedWriter = new BufferedWriter(osw);
		while((line = bufferedReader.readLine()) !=null){//缓冲流每次读取一行
			System.out.println(line);
			bufferedWriter.write(line);
		}
		bufferedWriter.close();
		bufferedReader.close();//关闭缓冲流
	}
	
}
