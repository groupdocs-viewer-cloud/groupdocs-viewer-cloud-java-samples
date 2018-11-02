package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachment_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreateAttachmentPagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Create_Attachment_Pages_Cache_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageCreateAttachmentPagesCacheRequest request = new ImageCreateAttachmentPagesCacheRequest();
			request.setFileName("with-attachment.msg");

			ImageOptions imageOptions = new ImageOptions();
			imageOptions.setAttachmentPassword("");

			request.setImageOptions(imageOptions);
			request.setAttachmentName("TestAttachment-File.docx");
			request.setFontsFolder("");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			ImageAttachmentPageCollection response = apiInstance.imageCreateAttachmentPagesCache(request);

			System.out.println("Cache Created");
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