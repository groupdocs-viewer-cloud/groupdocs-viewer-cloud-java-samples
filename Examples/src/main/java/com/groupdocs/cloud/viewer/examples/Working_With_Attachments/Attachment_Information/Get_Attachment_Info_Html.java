package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachment_Information;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentInfoRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_Attachment_Info_Html {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlGetAttachmentInfoRequest request = new HtmlGetAttachmentInfoRequest();
			request.setFileName("with-attachment.msg");
			request.setPassword("");
			request.setAttachmentName("TestAttachment-File.docx");
			request.setAttachmentPassword("");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			DocumentInfo response = apiInstance.htmlGetAttachmentInfo(request);

			System.out.println("Attachment Name: " + response.getFileName());
			System.out.println("Attachment Extension: " + response.getFileFormat());
			System.out.println("Attachment Pages Count: " + response.getPages().size());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
