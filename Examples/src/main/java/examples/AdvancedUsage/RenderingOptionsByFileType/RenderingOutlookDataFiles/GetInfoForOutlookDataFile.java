package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingOutlookDataFiles;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to retrieve view information for outlook data file
 */
public class GetInfoForOutlookDataFile {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.ost");
			ViewOptions viewOptions = new ViewOptions();
			viewOptions.setFileInfo(fileInfo);

            InfoResult response = apiInstance.getInfo(new GetInfoRequest(viewOptions));
            
            OutlookViewInfo outlookViewInfo = response.getOutlookViewInfo();
            
            System.out.println(" Folders count: " + outlookViewInfo.getFolders().size());            
                
			System.out.println("GetInfoForOutlookDataFile completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}