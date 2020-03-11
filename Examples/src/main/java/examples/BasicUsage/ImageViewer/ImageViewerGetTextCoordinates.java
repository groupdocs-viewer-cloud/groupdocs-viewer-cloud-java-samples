package examples.BasicUsage.ImageViewer;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;
import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to retrieve and print out text with coordinates
 */
public class ImageViewerGetTextCoordinates {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.docx");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.PNG);
            ImageOptions renderOptions = new ImageOptions();

            renderOptions.setExtractText(true);

            viewOptions.setRenderOptions(renderOptions);

			InfoResult response = apiInstance.getInfo(new GetInfoRequest(viewOptions));
			for(int i = 0; i < 3; i++)
			{
				Line line = response.getPages().get(0).getLines().get(i);
				System.out.println("x: " + line.getX() + "; y: " + line.getY());
            }
            System.out.println("...");
			System.out.println("ImageViewerGetTextCoordinates completed");

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
