package examples.BasicUsage;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;
import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to get document info
 */
public class GetDocumentInformation {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.docx");
			ViewOptions viewOptions = new ViewOptions();
			viewOptions.setFileInfo(fileInfo);

			InfoResult response = apiInstance.getInfo(new GetInfoRequest(viewOptions));

			System.out.println("Pages Count: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}