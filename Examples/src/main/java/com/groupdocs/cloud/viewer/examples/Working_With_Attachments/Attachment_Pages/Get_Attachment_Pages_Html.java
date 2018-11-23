package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachment_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentPagesRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_Attachment_Pages_Html {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlGetAttachmentPagesRequest request = new HtmlGetAttachmentPagesRequest();
			request.setFileName("with-attachment.msg");
			request.setPassword("");
			request.setAttachmentName("TestAttachment-File.docx");
			request.setAttachmentPassword("");
			request.setResourcePath("");
			request.setIgnoreResourcePathInResources(false);
			request.setEmbedResources(true);
			request.setStartPageNumber(1);
			request.setCountPages(null);
			request.setRenderComments(false);
			request.setRenderHiddenPages(true);
			request.setDefaultFontName(null);
			request.setFontsFolder("");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			HtmlAttachmentPageCollection response = apiInstance.htmlGetAttachmentPages(request);

			System.out.println("Pages Count: " + response.getPages().size());
			System.out.println("File Name: " + response.getFileName());
			System.out.println("Attachment Name: " + response.getAttachmentName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
