package examples.Working_With_Files;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Copy_File {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Utils.AppSID, Utils.AppKey);
		try {

			CopyFileRequest request = new CopyFileRequest("viewers\\one-page.docx",
					"viewers\\one-page-copied.docx", Utils.MYStorage, Utils.MYStorage, null);
			apiInstance.copyFile(request);
			System.out.println(
					"Expected response type is Void: 'viewers/one-page1.docx' file copied as 'viewers/one-page-copied.docx'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}