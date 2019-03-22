package examples.Working_With_View;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

public class Viewer_Java_Create_View_With_Project_Options {

	public static void main(String[] args) {

		ViewerApi apiInstance = new ViewerApi(Utils.AppSID, Utils.AppKey);
		try {

			ViewOptions viewOptions = new ViewOptions();

			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("viewerdocs\\sample.mpp");
			fileInfo.setPassword("");
			fileInfo.setStorageName(Utils.MYStorage);

			viewOptions.setFileInfo(fileInfo);

			RenderOptions renderOptions = new RenderOptions();

			ProjectManagementOptions projectManagementOptions = new ProjectManagementOptions();
			projectManagementOptions.setPageSize("Unknown");
			projectManagementOptions.setTimeUnit("Months");
			projectManagementOptions.setStartDate(OffsetDateTime.of(2008, 7, 1, 0, 0, 0, 0, ZoneOffset.UTC));
			projectManagementOptions.setEndDate(OffsetDateTime.of(2008, 7, 31, 0, 0, 0, 0, ZoneOffset.UTC));

			renderOptions.setProjectManagementOptions(projectManagementOptions);

			CreateViewRequest request = new CreateViewRequest(viewOptions);

			ViewResult response = apiInstance.createView(request);
			System.out.println("Expected response type is ViewResult: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling ViewerApi:");
			e.printStackTrace();
		}
	}
}