package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingPdfDocuments;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to retrieve view information for pdf file
 */
public class GetInfoForPdfFile {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.pdf");
			ViewOptions viewOptions = new ViewOptions();
			viewOptions.setFileInfo(fileInfo);

            InfoResult response = apiInstance.getInfo(new GetInfoRequest(viewOptions));
            
            PdfViewInfo pdfViewInfo = response.getPdfViewInfo();
            
            System.out.println(" PrintingAllowed: " + pdfViewInfo.getPrintingAllowed());
                
			System.out.println("GetInfoForPdfFile completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}