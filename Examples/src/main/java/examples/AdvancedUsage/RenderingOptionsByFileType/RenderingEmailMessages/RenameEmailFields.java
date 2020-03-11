package examples.AdvancedUsage.RenderingOptionsByFileType.RenderingEmailMessages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;
import com.groupdocs.cloud.viewer.model.requests.*;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;

/**
 * This example demonstrates how to use custom field labels
 */
public class RenameEmailFields {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("SampleFiles/sample.msg");
			ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewFormatEnum.HTML);
            HtmlOptions renderOptions = new HtmlOptions();            
            EmailOptions emailOptions = new EmailOptions();
            emailOptions.addFieldLabelsItem(GetFieldLabel("From", "Sender"));
            emailOptions.addFieldLabelsItem(GetFieldLabel("To", "Receiver"));
            emailOptions.addFieldLabelsItem(GetFieldLabel("Sent", "Date"));
            emailOptions.addFieldLabelsItem(GetFieldLabel("Subject", "Topic"));
            renderOptions.setEmailOptions(emailOptions);
            viewOptions.setRenderOptions(renderOptions);

			ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));

			System.out.println("RenameEmailFields completed: " + response.getPages().size());

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
    }
    
    private static FieldLabel GetFieldLabel(String field, String label)
    {
        FieldLabel fieldLabel = new FieldLabel();
        fieldLabel.setField(field);
        fieldLabel.setLabel(label);
        return fieldLabel;
    }
}
