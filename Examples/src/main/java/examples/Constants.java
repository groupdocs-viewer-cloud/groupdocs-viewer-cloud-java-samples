package examples;
import com.groupdocs.cloud.viewer.client.Configuration;

public class Constants {

	// TODO: Get your Client Id and Client Secret at https://dashboard.groupdocs.cloud (free
	// registration is required).

	private static String ClientId = "XXXX-XXXX-XXXX-XXXX";
	private static String ClientSecret = "XXXXXXXXXXXXXXXXX";

	public static String MYStorage = "First Storage";

	public static Configuration GetConfiguration()
	{
		Configuration cfg = new Configuration(Constants.ClientId, Constants.ClientSecret);		
		cfg.setApiBaseUrl("https://api.groupdocs.cloud");
		cfg.setTimeout(60000);
		return cfg;
	}	
}