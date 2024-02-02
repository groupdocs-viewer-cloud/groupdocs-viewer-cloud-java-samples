package examples.BasicUsage.PdfViewer;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;
import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to adjust JPG image quality in the output PDF document
 */
public class PdfViewerAdjustJpgQuality {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/with_jpg_image.pptx");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.PDF);
            PdfOptions renderOptions = new PdfOptions();
			PdfOptimizationOptions pdfOptimizationOptions = new PdfOptimizationOptions();
			pdfOptimizationOptions.setCompressImages(true);
			pdfOptimizationOptions.setImageQuality(80);
			renderOptions.setPdfOptimizationOptions(pdfOptimizationOptions);
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("PdfViewerAdjustJpgQuality completed: " + response.getFile().getPath());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}