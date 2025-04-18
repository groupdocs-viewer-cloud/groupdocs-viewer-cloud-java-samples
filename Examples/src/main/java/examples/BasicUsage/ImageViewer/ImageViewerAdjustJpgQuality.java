package examples.BasicUsage.ImageViewer;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;
import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to adjust quality of the output JPG image
 */
public class ImageViewerAdjustJpgQuality {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.docx");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.JPG);
            ImageOptions renderOptions = new ImageOptions();

            renderOptions.setJpegQuality(50);

            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("ImageViewerAdjustJpgQuality completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
