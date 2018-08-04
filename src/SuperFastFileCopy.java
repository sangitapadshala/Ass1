import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class SuperFastFileCopy {

	public static void main(String[] args) throws Exception {
		ReadableByteChannel source = (new FileInputStream("D:/Demo/vsc.exe")).getChannel();
		WritableByteChannel destination = (new FileOutputStream("D:/Demo/vsc2.exe")).getChannel();
		long startTime = System.currentTimeMillis(); 
		ByteBuffer buffer = ByteBuffer.allocateDirect(20*1024);
		while (source.read(buffer) != -1) { 
			buffer.flip(); 
			while (buffer.hasRemaining())
				destination.write(buffer);
			buffer.clear();
		}
 
		System.out.println("Time: " + (System.currentTimeMillis() - startTime));
		source.close();
		destination.close();

	}

}
