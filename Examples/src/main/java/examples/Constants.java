package examples;
import com.groupdocs.cloud.viewer.client.Configuration;

public class Constants {

	// TODO: Get your Client Id and Client Secret at https://dashboard.groupdocs.cloud (free
	// registration is required).

	private static String ClientId = "XXXXX-XXXXX-XXXXX";
	private static String ClientSecret = "XXXXXXXXXXXX";

	public static String MYStorage = "First Storage";

	public static Configuration GetConfiguration()
	{
		Configuration cfg = new Configuration(Constants.ClientId, Constants.ClientSecret);		
		cfg.setTimeout(60000);		
		return cfg;
	}	
}