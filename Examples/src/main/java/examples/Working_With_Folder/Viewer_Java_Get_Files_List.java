package examples.Working_With_Folder;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.FilesList;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Get_Files_List {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Utils.AppSID, Utils.AppKey);
		try {
			GetFilesListRequest request = new GetFilesListRequest("viewers", Utils.MYStorage);
			FilesList response = apiInstance.getFilesList(request);
			System.out.println("Expected response type is FilesList.");
			for (StorageFile storageFile : response.getValue()) {
				System.out.println("Files: " + storageFile.getPath());
			}
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}