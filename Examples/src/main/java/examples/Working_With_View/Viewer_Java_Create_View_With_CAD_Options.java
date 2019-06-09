package examples.Working_With_View;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Create_View_With_CAD_Options {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Utils.AppSID, Utils.AppKey);
		try {

			ViewOptions viewOptions = new ViewOptions();

			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("viewerdocs\\three-layouts.dwf");
			fileInfo.setPassword("");
			fileInfo.setStorageName(Utils.MYStorage);

			viewOptions.setFileInfo(fileInfo);

			RenderOptions renderOptions = new RenderOptions();

			CadOptions cadOptions = new CadOptions();
			cadOptions.setWidth(800);

			renderOptions.setCadOptions(cadOptions);

			viewOptions.setRenderOptions(renderOptions);

			CreateViewRequest request = new CreateViewRequest(viewOptions);

			ViewResult response = apiInstance.createView(request);
			System.out.println("Expected response type is ViewResult: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling ViewApi:");
			e.printStackTrace();
		}
	}
}