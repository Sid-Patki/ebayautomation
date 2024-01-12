package automation.ebay.utilities;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadpropertyConfigfile {
	
	Properties prop; // Default java programme
	
	public ReadpropertyConfigfile() { //contructor//
		
		prop = new  Properties();//creating the object of it
		
		
			try {
				FileInputStream configfile= new FileInputStream("./Propertyfile/config.properties");
				prop.load(configfile);
			} catch (Exception e) {
				System.out.println(e.getMessage());// getting the exceptin method
				e.printStackTrace();
			}
	}
			
            /*when thre is no void we need to define datatype*/	
			
			public String getbrowser() {
				
				String browser=prop.getProperty("browser");
				
				if (browser!=null) {
					return browser;
				}
				
				else
					throw new RuntimeException("browser not mentioned"); /*Need to learnmoreaboutit*/
			}
			
			public String geturl() {
				
				String url= prop.getProperty("url");
				
				if (url!=null) {
					
					return url;
				}
				
				else throw new RuntimeException("url not mentioned");
			}
			
	}	


