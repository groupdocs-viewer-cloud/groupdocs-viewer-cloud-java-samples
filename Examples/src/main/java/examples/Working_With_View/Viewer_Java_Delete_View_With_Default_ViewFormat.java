package examples.Working_With_View;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Delete_View_With_Default_ViewFormat {

	public static void main(String[] args) {

		ViewerApi apiInstance = new ViewerApi(Utils.AppSID, Utils.AppKey);
		try {

			DeleteViewOptions viewOptions = new DeleteViewOptions();

			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("viewerdocs\\one-page.docx");
			fileInfo.setPassword("");
			fileInfo.setStorageName(Utils.MYStorage);

			viewOptions.setFileInfo(fileInfo);

			DeleteViewRequest request = new DeleteViewRequest(viewOptions);

			apiInstance.deleteView(request);
			System.out.println("Expected response type is Void: View deleted with default View Format.");

		} catch (ApiException e) {
			System.err.println("Exception while calling ViewerApi:");
			e.printStackTrace();
		}
	}
}