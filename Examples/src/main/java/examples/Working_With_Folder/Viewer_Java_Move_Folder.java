package examples.Working_With_Folder;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Move_Folder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Utils.AppSID, Utils.AppKey);
		try {
			MoveFolderRequest request = new MoveFolderRequest("viewers1", "viewers\\viewers1",
					Utils.MYStorage, Utils.MYStorage);
			apiInstance.moveFolder(request);
			System.out.println(
					"Expected response type is Void: 'viewers1' folder moved to 'viewers/viewers1'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}