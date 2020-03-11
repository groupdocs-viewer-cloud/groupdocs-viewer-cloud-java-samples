package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingOutlookDataFiles;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to render Outlook Data File with filtering the rendered messages
 */
public class FilterMessages {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.ost");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.HTML);
            HtmlOptions renderOptions = new HtmlOptions();            
            OutlookOptions outlookOptions = new OutlookOptions();
            outlookOptions.setTextFilter("Microsoft");
            outlookOptions.setAddressFilter("susan");
            renderOptions.setOutlookOptions(outlookOptions);
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("FilterMessages completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
