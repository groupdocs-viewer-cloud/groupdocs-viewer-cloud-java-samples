package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachment_Information;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageGetAttachmentInfoRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_Attachment_Info_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageGetAttachmentInfoRequest request = new ImageGetAttachmentInfoRequest();
			request.setFileName("with-attachment.msg");
			request.setPassword("");
			request.setAttachmentName("TestAttachment-File.docx");
			request.setAttachmentPassword("");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			DocumentInfo response = apiInstance.imageGetAttachmentInfo(request);

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
