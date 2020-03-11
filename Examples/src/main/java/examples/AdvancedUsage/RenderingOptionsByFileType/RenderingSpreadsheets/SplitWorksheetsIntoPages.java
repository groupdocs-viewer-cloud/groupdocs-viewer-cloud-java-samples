package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingSpreadsheets;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to split worksheets into pages
 */
public class SplitWorksheetsIntoPages {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.xlsx");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.HTML);
            HtmlOptions renderOptions = new HtmlOptions();            
            SpreadsheetOptions spreadsheetOptions = new SpreadsheetOptions();
            spreadsheetOptions.setPaginateSheets(true);
            spreadsheetOptions.setCountRowsPerPage(45);
            renderOptions.setSpreadsheetOptions(spreadsheetOptions);
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("SplitWorksheetsIntoPages completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
