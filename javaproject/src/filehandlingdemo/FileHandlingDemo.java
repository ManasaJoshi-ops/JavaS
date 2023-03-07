package filehandlingdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileHandlingDemo {
public static void main(String[] args) {
		
//		fileOutputStreamDemo();
//		fileInputStreamDemo();
//	fileReaderDemo();
//	fileWriterDemo();
//	fileBufferReadDemo();
	fileBufferedWriteDemo();
}
static void fileInputStreamDemo()  {
	int i;
	File file=new File("/Users/manasajoshi/Desktop/myfile");
	try {
		FileInputStream fis=new FileInputStream(file);
		System.out.println("File opened");
			while( (i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
		}
}

static void fileOutputStreamDemo() {
	try {
	File file=new File("/Users/manasajoshi/Desktop/myfile");
		FileOutputStream fos=new FileOutputStream(file);
		System.out.println("File opened");
			String data = "from the program";
			byte[] dataByteArray = data.getBytes();
			fos.write(dataByteArray);
			
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	
	}
}

static void fileReaderDemo()  {
	int i;
	File file=new File("/Users/manasajoshi/Desktop/myfile");
	try {
		FileReader fr=new FileReader(file);
		System.out.println("File opened");
			while( (i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
		}
}

static void fileWriterDemo() {
	try {
	File file=new File("/Users/manasajoshi/Desktop/myfile");
		FileWriter fw=new FileWriter(file);
		System.out.println("File opened");
			fw.write("using file writer to write\n");
			fw.write("using file writer to write ");
			fw.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	
	}
}
static void fileBufferReadDemo()  {
	String line;
	File file=new File("/Users/manasajoshi/Desktop/myfile");
	try {
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		System.out.println("File opened");
			while( (line=br.readLine())!=null) {
				System.out.print(line);
			}
			fr.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
		}
}
static void fileBufferedWriteDemo() {
	try {
	File file=new File("/Users/manasajoshi/Desktop/myfile");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("File opened");
			bw.write("buffered writer");
			bw.close();
			fw.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	
	}
}
}
