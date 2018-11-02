package com.groupdocs.cloud.viewer.examples.Document_Information;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageGetDocumentInfoRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_CAD_DocumentInfo_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageGetDocumentInfoRequest request = new ImageGetDocumentInfoRequest();
			request.setFileName("sample.DXF");
			request.setPassword("");
			request.setRenderComments(false);
			request.setRenderHiddenPages(true);
			request.setFolder(null);
			request.setStorage("MyStorage");

			DocumentInfo response = apiInstance.imageGetDocumentInfo(request);

			System.out.println("Layers Count: " + response.getLayers().size());
			System.out.println("File Name: " + response.getFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
