package memento_pattern_lab9_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtil {
	public static final String FILE_PATH = "./profile.ser";

	public static void serialize(ProfileOrigator p) {
		try {
			FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in " + FILE_PATH);
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public static ProfileOrigator deSerialize() {
		ProfileOrigator p = null;
		try {
			FileInputStream fileIn = new FileInputStream(FILE_PATH);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			p = (ProfileOrigator) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("ProfileOrigator class not found");
			c.printStackTrace();
		}
		return p;
	}
}
