package examples.AdvancedUsage.CommonRenderingOptions;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.PageRotation.RotationAngleEnum;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to rotate output pages when viewing a document as PDF
 */
public class FlipRotatePages {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.docx");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.PDF);
            RenderOptions renderOptions = new RenderOptions();
            PageRotation pageRotation = new PageRotation();
            pageRotation.setPageNumber(1);
            pageRotation.setRotationAngle(RotationAngleEnum.ON90DEGREE);
            renderOptions.addPageRotationsItem(pageRotation);
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("FlipRotatePages completed: " + response.getFile().getPath());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
