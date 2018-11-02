package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Create_Document_Cache_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageCreatePagesCacheRequest request = new ImageCreatePagesCacheRequest();
			request.setFileName("one-page.docx");

			ImageOptions imageOptions = new ImageOptions();
			imageOptions.setAttachmentPassword("");
			imageOptions.setFormat("jpg");

			request.setImageOptions(imageOptions);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			ImagePageCollection response = apiInstance.imageCreatePagesCache(request);

			System.out.println("Cache Created");
			System.out.println("Pages Count: " + response.getPages().size());
			System.out.println("File Name: " + response.getFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
