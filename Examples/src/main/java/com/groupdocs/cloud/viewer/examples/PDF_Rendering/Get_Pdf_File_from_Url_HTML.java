package com.groupdocs.cloud.viewer.examples.PDF_Rendering;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPdfFileFromUrlRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;

public class Get_Pdf_File_from_Url_HTML {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlGetPdfFileFromUrlRequest request = new HtmlGetPdfFileFromUrlRequest();
			request.setUrl("https://www.dropbox.com/s/umokluz338w4ng7%2fone-page.docx");
			request.setFileName("one-page.docx");
			request.setPassword("");
			request.setRenderComments(false);
			request.setRenderHiddenPages(true);
			request.setDefaultFontName(null);
			request.setFontsFolder(null);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			File response = apiInstance.htmlGetPdfFileFromUrl(request);

			System.out.println("File Size: " + response.length());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
