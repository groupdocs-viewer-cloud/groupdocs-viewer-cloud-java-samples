package examples.AdvancedUsage.LoadingOptions;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to specify encoding when rendering documents
 */
public class SpecifyEncoding {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/shift_jis_encoded.txt");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.HTML);
            RenderOptions renderOptions = new RenderOptions();            
            renderOptions.setDefaultEncoding("shift_jis");
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("SpecifyEncoding completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
