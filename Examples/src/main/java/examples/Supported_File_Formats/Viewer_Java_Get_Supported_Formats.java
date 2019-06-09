package examples.Supported_File_Formats;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.api.InfoApi;
import examples.Utils;

public class Viewer_Java_Get_Supported_Formats {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Utils.AppSID, Utils.AppKey);
		try {
			FormatsResult response = apiInstance.getSupportedFileFormats();

			for (Format format : response.getFormats()) {
				System.out.println(format.getFileFormat());
			}
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}