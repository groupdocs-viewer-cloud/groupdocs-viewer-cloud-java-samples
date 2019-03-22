package examples.Working_With_Files;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Move_File {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Utils.AppSID, Utils.AppKey);
		try {

			MoveFileRequest request = new MoveFileRequest("viewers\\one-page1.docx", "viewers1\\one-page1.docx",
					Utils.MYStorage, Utils.MYStorage, null);
			apiInstance.moveFile(request);
			System.out.println(
					"Expected response type is Void: 'viewers/one-page1.docx' file moved to 'viewers1/one-page1.docx'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}