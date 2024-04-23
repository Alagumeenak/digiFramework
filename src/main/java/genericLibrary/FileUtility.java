package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public static String getProrperty(String key) {
		//step1
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(UtilityMethods.PROPERTIES_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//step2
		Properties pObj=new Properties();
		//step3
			try {
				pObj.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//step4
		return pObj.getProperty(key);
	}

}
