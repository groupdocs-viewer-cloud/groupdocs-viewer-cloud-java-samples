package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Email_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.util.*;

public class Render_Email_Header {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlCreatePagesCacheRequest request = new HtmlCreatePagesCacheRequest();
			request.setFileName("with-attachment.msg");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			HtmlOptions htmlOptions = new HtmlOptions();
			EmailOptions emailOptions = new EmailOptions();
			ArrayList<FieldLabel> lstfieldLabels = new ArrayList<FieldLabel>();
			FieldLabel fieldLabel = new FieldLabel();

			fieldLabel.setField("From");
			fieldLabel.setLabel("Sender");
			lstfieldLabels.add(fieldLabel);

			fieldLabel.setField("To");
			fieldLabel.setLabel("Receiver");
			lstfieldLabels.add(fieldLabel);

			emailOptions.setFieldLabels(lstfieldLabels);
			htmlOptions.setEmailOptions(emailOptions);

			request.setHtmlOptions(htmlOptions);

			HtmlPageCollection response = apiInstance.htmlCreatePagesCache(request);

			System.out.println("Cache Created");
			System.out.println("Pages Count: " + response.getPages().size());
			System.out.println("File Name: " + response.getFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}