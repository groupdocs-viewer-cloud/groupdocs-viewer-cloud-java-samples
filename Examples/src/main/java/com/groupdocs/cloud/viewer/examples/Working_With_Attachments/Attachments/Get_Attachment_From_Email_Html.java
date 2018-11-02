package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachments;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;

public class Get_Attachment_From_Email_Html {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlGetAttachmentRequest request = new HtmlGetAttachmentRequest();
			request.setFileName("with-attachment.msg");
			request.setAttachmentName("TestAttachment-File.docx");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			File response = apiInstance.htmlGetAttachment(request);

			System.out.println("Attachment Size: " + response.length());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
