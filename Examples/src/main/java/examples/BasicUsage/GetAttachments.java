package examples.BasicUsage;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;
import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how get attachments
 */
public class GetAttachments {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/with_attachments.msg");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.HTML);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("GetAttachments completed: " + response.getAttachments().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}