package examples.Working_With_Folder;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Create_Folder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Utils.AppSID, Utils.AppKey);
		try {
			CreateFolderRequest request = new CreateFolderRequest("viewers", Utils.MYStorage);
			apiInstance.createFolder(request);
			System.out.println("Expected response type is Void: 'viewers' folder created.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}