package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePagesCacheFromUrlRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Create_Document_Cache_Url_With_ImageOptions {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageCreatePagesCacheFromUrlRequest request = new ImageCreatePagesCacheFromUrlRequest();
			request.setUrl("https://www.dropbox.com/s/umokluz338w4ng7%2fone-page.docx");
			request.setFileName("one-page.docx");

			ImageOptions imageOptions = new ImageOptions();
			imageOptions.setFormat("jpg");

			request.setImageOptions(imageOptions);
			request.setFolder("");
			request.setStorage("MyStorage");

			ImagePageCollection response = apiInstance.imageCreatePagesCacheFromUrl(request);

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
