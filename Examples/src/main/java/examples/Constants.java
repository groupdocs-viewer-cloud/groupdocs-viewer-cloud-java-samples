package examples;
import com.groupdocs.cloud.viewer.client.Configuration;

public class Constants {

	// TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free
	// registration is required).

	private static String AppSID = "XXXXX-XXXXX-XXXXX";
	private static String AppKey = "XXXXXXXXXXXX";

	public static String MYStorage = "First Storage";

	public static Configuration GetConfiguration()
	{
		Configuration cfg = new Configuration(Constants.AppSID, Constants.AppKey);		
		cfg.setTimeout(60000);		
		return cfg;
	}	
}