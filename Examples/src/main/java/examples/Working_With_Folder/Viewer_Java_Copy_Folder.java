package examples.Working_With_Folder;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Copy_Folder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Utils.AppSID, Utils.AppKey);
		try {
			CopyFolderRequest request = new CopyFolderRequest("viewers", "viewers1", Utils.MYStorage,
					Utils.MYStorage);
			apiInstance.copyFolder(request);
			System.out.println("Expected response type is Void: 'viewers' folder copied as 'viewers1'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}