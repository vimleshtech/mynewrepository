package ExceptionHandler;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsEx {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fr = new FileReader("c://abcd://a.txt");
	}

}
