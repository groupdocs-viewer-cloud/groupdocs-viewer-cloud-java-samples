package examples.AdvancedUsage.CommonRenderingOptions;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to render selected pages
 */
public class RenderSelectedPages {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.docx");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.HTML);
            RenderOptions renderOptions = new RenderOptions();
            renderOptions.addPagesToRenderItem(2);
            renderOptions.addPagesToRenderItem(3);
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("RenderSelectedPages completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
