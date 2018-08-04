
import java.io.*;
import java.nio.channels.*;

public class FileUtils{
	static long startTime = System.currentTimeMillis();
	public static void copyFile(File source, File destination) 
        throws IOException 
    {
    	
        FileChannel inChannel = new
            FileInputStream(source).getChannel();
        FileChannel outChannel = new
            FileOutputStream(destination).getChannel();
		

        try {
            inChannel.transferTo(0, inChannel.size(),
                    outChannel);
        } 
        catch (IOException e) {
            throw e;
        } 
        finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
    }

    public static void main(String args[]) throws IOException{
    	File source =  new File("D:/Demo/vsc.exe");
		File destination = (new File("D:/Demo/vsc2.exe"));
		FileUtils.copyFile(source,destination);
		System.out.println("Time: "+(System.currentTimeMillis()- startTime));

  }
}
