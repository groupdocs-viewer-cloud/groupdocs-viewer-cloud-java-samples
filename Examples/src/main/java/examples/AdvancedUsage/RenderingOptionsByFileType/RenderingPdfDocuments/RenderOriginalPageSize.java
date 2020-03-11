package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingPdfDocuments;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to convert pages to the same size as the size of pages in a source document
 */
public class RenderOriginalPageSize {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.pdf");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.PNG);
            ImageOptions renderOptions = new ImageOptions();            
            PdfDocumentOptions pdfDocumentOptions = new PdfDocumentOptions();
            pdfDocumentOptions.setRenderOriginalPageSize(true);
            renderOptions.setPdfDocumentOptions(pdfDocumentOptions);
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("RenderOriginalPageSize completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
