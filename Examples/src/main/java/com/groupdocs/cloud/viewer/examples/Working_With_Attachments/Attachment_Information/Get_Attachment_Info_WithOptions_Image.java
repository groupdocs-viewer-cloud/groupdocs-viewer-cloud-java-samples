package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachment_Information;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageGetAttachmentInfoWithOptionsRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_Attachment_Info_WithOptions_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageGetAttachmentInfoWithOptionsRequest request = new ImageGetAttachmentInfoWithOptionsRequest();
			request.setFileName("with-attachment.msg");
			
			DocumentInfoOptions documentInfoOptions = new DocumentInfoOptions();
			documentInfoOptions.setAttachmentPassword("");
			
			request.setDocumentInfoOptions(documentInfoOptions);
			request.setAttachmentName("TestAttachment-File.docx");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			DocumentInfo response = apiInstance.imageGetAttachmentInfoWithOptions(request);

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
