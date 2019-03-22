package examples.Working_With_Document_Information;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Get_Info_With_SpreadsheetOptions {

	public static void main(String[] args) {

		ViewerApi apiInstance = new ViewerApi(Utils.AppSID, Utils.AppKey);
		try {

			ViewOptions viewOptions = new ViewOptions();

			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("viewerdocs\\with-hidden-rows-and-columns.xlsx");
			fileInfo.setPassword("");
			fileInfo.setStorageName(Utils.MYStorage);

			viewOptions.setFileInfo(fileInfo);

			RenderOptions renderOptions = new RenderOptions();

			SpreadsheetOptions spreadsheetOptions = new SpreadsheetOptions();
			spreadsheetOptions.setPaginateSheets(true);
			spreadsheetOptions.setCountRowsPerPage(5);

			renderOptions.setSpreadsheetOptions(spreadsheetOptions);

			viewOptions.setRenderOptions(renderOptions);

			GetInfoRequest request = new GetInfoRequest(viewOptions);

			InfoResult response = apiInstance.getInfo(request);
			System.out.println("Expected response type is InfoResult: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling ViewerApi:");
			e.printStackTrace();
		}
	}
}