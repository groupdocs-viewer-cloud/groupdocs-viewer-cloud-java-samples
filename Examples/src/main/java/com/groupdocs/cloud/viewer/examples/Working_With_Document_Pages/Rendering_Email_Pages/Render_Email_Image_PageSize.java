package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Email_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Render_Email_Image_PageSize {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageCreatePagesCacheRequest request = new ImageCreatePagesCacheRequest();
			request.setFileName("with-attachment.msg");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			ImageOptions imageOptions = new ImageOptions();
			EmailOptions emailOptions = new EmailOptions();

			emailOptions.setPageSize("A0");
			imageOptions.setEmailOptions(emailOptions);

			request.setImageOptions(imageOptions);

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