package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingVisioDocuments;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to render Visio documents figures
 */
public class RenderVisioDocumentFigures {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.vssx");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.PNG);
            ImageOptions renderOptions = new ImageOptions();            
            VisioRenderingOptions visioRenderingOptions = new VisioRenderingOptions();
			visioRenderingOptions.setRenderFiguresOnly(true);
			visioRenderingOptions.setFigureWidth(250);
            renderOptions.setVisioRenderingOptions(visioRenderingOptions);
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("RenderVisioDocumentFigures completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
