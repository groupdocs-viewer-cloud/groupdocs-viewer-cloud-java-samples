package examples.Working_With_View;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Create_View_With_HTML_View_Format {

	public static void main(String[] args) {

		ViewerApi apiInstance = new ViewerApi(Utils.AppSID, Utils.AppKey);
		try {

			ViewOptions viewOptions = new ViewOptions();

			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("viewerdocs\\one-page.docx");
			fileInfo.setPassword("");
			fileInfo.setStorageName(Utils.MYStorage);

			viewOptions.setFileInfo(fileInfo);
			viewOptions.setViewFormat(ViewOptions.ViewFormatEnum.HTML);

			CreateViewRequest request = new CreateViewRequest(viewOptions);

			ViewResult response = apiInstance.createView(request);
			System.out.println("Expected response type is ViewResult: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling ViewerApi:");
			e.printStackTrace();
		}
	}
}