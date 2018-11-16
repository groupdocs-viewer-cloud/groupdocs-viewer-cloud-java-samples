package com.groupdocs.cloud.viewer.examples;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Utils {

	// TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free
	// registration is required).

	public static String AppSID = "XXXXX-XXXXX-XXXXX";
	public static String AppKey = "XXXXXXXXXXX";
	public static String BaseApiUrl = "https://api.groupdocs.cloud";

	public static ViewerApi getViewerAPIInstance()
	{
		return new ViewerApi(AppSID, AppKey);
	}
}