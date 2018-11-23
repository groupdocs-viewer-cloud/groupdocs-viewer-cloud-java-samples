package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachment_Page_Resources;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentPageResourceRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;

public class Get_Attachment_Page_Resource_Html {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlGetAttachmentPageResourceRequest request = new HtmlGetAttachmentPageResourceRequest();
			request.setFileName("with-attachment.msg");
			request.setPageNumber(1);
			request.setAttachmentName("TestAttachment-File.docx");
			request.setResourceName("styles.css");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			File response = apiInstance.htmlGetAttachmentPageResource(request);
			System.out.println("Name: " + response.getName());
			System.out.println("Size: " + response.length());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
