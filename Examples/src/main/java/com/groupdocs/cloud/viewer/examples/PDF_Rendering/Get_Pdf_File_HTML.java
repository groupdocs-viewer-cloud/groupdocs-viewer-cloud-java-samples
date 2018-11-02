package com.groupdocs.cloud.viewer.examples.PDF_Rendering;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetPdfFileRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;

public class Get_Pdf_File_HTML {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlGetPdfFileRequest request = new HtmlGetPdfFileRequest();
			request.setFileName("one-page.docx");
			request.setPassword("");
			request.setRenderComments(false);
			request.setRenderHiddenPages(true);
			request.setDefaultFontName(null);
			request.setFontsFolder(null);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			File response = apiInstance.htmlGetPdfFile(request);

			System.out.println("File Size: " + response.length());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
