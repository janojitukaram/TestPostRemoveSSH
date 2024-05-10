package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GetSetproperties {
   public Properties prop = new Properties();
	public FileInputStream input = null;
	public FileOutputStream output = null;
	public String projectPaths=null;

	public GetSetproperties(String ProjectPath) throws IOException {
		projectPaths=ProjectPath;
		try {
			input = new FileInputStream(projectPaths);
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			output = new FileOutputStream(projectPaths);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public  String getProperties() {
		String browserName = prop.getProperty("browser");
		
		return browserName;
	}

	public  void setProperties() throws IOException {
		 prop.setProperty("browser", "firefox");
			prop.store(output, null);

		
	}

}
