package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingCadDrawings;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to retrieve view information for CAD drawing
 */
public class GetInfoForCadDrawing {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/with_layers_and_layouts.dwg");
			ViewOptions viewOptions = new ViewOptions();
			viewOptions.setFileInfo(fileInfo);

            InfoResult response = apiInstance.getInfo(new GetInfoRequest(viewOptions));
            
            CadViewInfo cadViewInfo = response.getCadViewInfo();
            
            System.out.println(" Layers count: " + cadViewInfo.getLayers().size());
            System.out.println(" Layouts count: " + cadViewInfo.getLayouts().size());
                
			System.out.println("GetInfoForCadDrawing completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}