package com.groupdocs.cloud.viewer.examples.Document_Information;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageGetDocumentInfoWithOptionsRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_DocumentInfo_with_Options_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageGetDocumentInfoWithOptionsRequest request = new ImageGetDocumentInfoWithOptionsRequest();
			request.setFileName("one-page.docx");

			DocumentInfoOptions documentInfoOptions = new DocumentInfoOptions();
			documentInfoOptions.setPassword("");

			request.setDocumentInfoOptions(documentInfoOptions);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			DocumentInfo response = apiInstance.imageGetDocumentInfoWithOptions(request);

			System.out.println("File Name: " + response.getFileName());
			System.out.println("File Extension: " + response.getFileFormat());
			System.out.println("File Pages Count: " + response.getPages().size());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
