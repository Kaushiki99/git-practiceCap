package lab8assignments.Exercise1;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class ThreadClass extends Thread{
		
		File source;
		File target;
		
		public ThreadClass(File source,File target) {
			this.source=source;
			this.target=target;
		}
		
		public void run() {
			FileInputStream inp = null;
			try {
				inp = new FileInputStream(source);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FileOutputStream out = null;
			try {
				out = new FileOutputStream(target);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int count=0;
			int chars=0;
			try {
				while((chars=inp.read())>0) {
					out.write((char)chars);
					count++;
					if(count%10==0) {
					try {
						System.out.println("10 characters are copied");
						Thread.sleep(5000);
					}catch(Exception e) {
						e.printStackTrace();
					}
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

