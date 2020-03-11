package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingArchiveFiles;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;

import java.util.List;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to print out archive contents
 */
public class GetInfoForArchiveFile {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/with_folders.zip");
			ViewOptions viewOptions = new ViewOptions();
			viewOptions.setFileInfo(fileInfo);

            InfoResult response = apiInstance.getInfo(new GetInfoRequest(viewOptions));
            
            List<String> folders = response.getArchiveViewInfo().getFolders();
			for(int i = 0; i < folders.size(); i++)
                System.out.println(folders.get(i));
                
			System.out.println("GetInfoForArchiveFile completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}