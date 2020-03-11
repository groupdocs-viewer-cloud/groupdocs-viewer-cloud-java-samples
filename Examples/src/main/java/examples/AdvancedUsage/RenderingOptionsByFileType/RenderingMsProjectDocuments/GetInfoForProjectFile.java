package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingMsProjectDocuments;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to retrieve view information for MS Project document
 */
public class GetInfoForProjectFile {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.mpp");
			ViewOptions viewOptions = new ViewOptions();
			viewOptions.setFileInfo(fileInfo);

            InfoResult response = apiInstance.getInfo(new GetInfoRequest(viewOptions));
            
            ProjectManagementViewInfo projectManagementViewInfo = response.getProjectManagementViewInfo();
            
            System.out.println(" Start date: " + projectManagementViewInfo.getStartDate());
            System.out.println(" End date: " + projectManagementViewInfo.getEndDate());
                
			System.out.println("GetInfoForProjectFile completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}