package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPagesFromUrlRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_Pages_URL_HTML {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlGetPagesFromUrlRequest request = new HtmlGetPagesFromUrlRequest();
			request.setUrl("https://www.dropbox.com/s/r2eioe2atushqcf/with-notes.pptx?dl=1");
			request.setFileName("one-page.docx");
			request.setRenderComments(false);
			request.setRenderHiddenPages(true);
			request.setStartPageNumber(1);
			request.setCountPages(null);
			request.setDefaultFontName(null);
			request.setFontsFolder(null);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			HtmlPageCollection response = apiInstance.htmlGetPagesFromUrl(request);

			System.out.println("Pages Count: " + response.getPages().size());
			System.out.println("File Name: " + response.getFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}