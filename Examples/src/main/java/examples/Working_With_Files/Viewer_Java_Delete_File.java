package examples.Working_With_Files;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Delete_File {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Utils.AppSID, Utils.AppKey);
		try {

			DeleteFileRequest request = new DeleteFileRequest("viewers1\\one-page1.docx", Utils.MYStorage, null);
			apiInstance.deleteFile(request);
			System.out.println("Expected response type is Void: 'viewers1/one-page1.docx' deleted.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}