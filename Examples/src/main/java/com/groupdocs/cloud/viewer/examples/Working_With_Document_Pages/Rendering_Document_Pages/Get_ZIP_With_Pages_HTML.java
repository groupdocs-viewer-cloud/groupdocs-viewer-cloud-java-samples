package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetZipWithPagesRequest;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;

public class Get_ZIP_With_Pages_HTML {

	public static void main(String[] args) {
		// TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free
		// registration is required).
		String appSid = "d215ce72-1609-4282-8d55-5810942236fb";
		String appKey = "715d18b0afef2f303882c769921fe05a";

		ViewerApi apiInstance = new ViewerApi(appSid, appKey);
		try {
			HtmlGetZipWithPagesRequest request = new HtmlGetZipWithPagesRequest();
			request.setFileName("one-page.docx");
			request.setRenderComments(false);
			request.setRenderHiddenPages(true);
			request.setStartPageNumber(1);
			request.setCountPages(null);
			request.setDefaultFontName(null);
			request.setFontsFolder(null);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			File response = apiInstance.htmlGetZipWithPages(request);

			System.out.println("File Size: " + response.length());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
