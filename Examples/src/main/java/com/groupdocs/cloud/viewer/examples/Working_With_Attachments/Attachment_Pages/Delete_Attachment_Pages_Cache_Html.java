package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachment_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlDeleteAttachmentPagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Delete_Attachment_Pages_Cache_Html {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlDeleteAttachmentPagesCacheRequest request = new HtmlDeleteAttachmentPagesCacheRequest();
			request.setFileName("with-attachment.msg");
			request.setAttachmentName("TestAttachment-File.docx");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			apiInstance.htmlDeleteAttachmentPagesCache(request);

			System.out.println("Cache Deleted");
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
