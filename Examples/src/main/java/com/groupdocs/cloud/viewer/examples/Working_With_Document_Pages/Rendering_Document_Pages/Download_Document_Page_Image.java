package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.ImageGetPageRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;

public class Download_Document_Page_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageGetPageRequest request = new ImageGetPageRequest();
			request.setFileName("one-page.docx");
			request.setPassword("");
			request.setRenderComments(false);
			request.setRenderHiddenPages(true);
			request.setPageNumber(1);
			request.setDefaultFontName(null);
			request.setFontsFolder(null);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			File response = apiInstance.imageGetPage(request);

			System.out.println("File Size: " + response.length());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
