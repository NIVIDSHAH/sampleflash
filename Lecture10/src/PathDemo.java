import java.nio.file.*;
import java.util.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;

public class PathDemo {
	public static void main(String[] args) {
		
		String name;
		Scanner inputScanner = new Scanner(System.in);
		name = inputScanner.nextLine();
		Path filePath = Paths.get(name);
		Path fullPath = filePath.toAbsolutePath();
		System.out.println(fullPath);
		
		try {
			filePath.getFileSystem().provider().checkAccess(filePath,READ, EXECUTE);
		}
		catch(IOException myExc){
			System.out.println("File cannot be used for this app! "+ filePath);
		}
		
		
		}
	}	

