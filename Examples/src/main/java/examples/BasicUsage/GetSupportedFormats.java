package examples.BasicUsage;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.api.InfoApi;
import examples.Constants;

/**
 * This example demonstrates how to obtain all supported document formats
 */
public class GetSupportedFormats {

	public static void main(String[] args) {
		
		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		
		try {
			FormatsResult response = apiInstance.getSupportedFileFormats();
			for(int i = 0; i < 5; i++)
			{
				Format entry = response.getFormats().get(i);
				System.out.println(entry.getFileFormat() + ": " + entry.getExtension());
			}
			System.out.println("...");
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}