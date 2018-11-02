package com.groupdocs.cloud.viewer.examples.PDF_Rendering;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePdfFileFromUrlRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Create_Pdf_File_from_Url_HTML {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlCreatePdfFileFromUrlRequest request = new HtmlCreatePdfFileFromUrlRequest();
			request.setUrl("https://www.dropbox.com/s/umokluz338w4ng7%2fone-page.docx");
			request.setFileName("one-page.docx");

			Watermark watermark = new Watermark();
			watermark.setText("GrouDocs Cloud API");

			PdfFileOptions pdfFileOptions = new PdfFileOptions();
			pdfFileOptions.setWatermark(watermark);

			request.setPdfFileOptions(pdfFileOptions);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			PdfFileInfo response = apiInstance.htmlCreatePdfFileFromUrl(request);

			System.out.println("File Name: " + response.getFileName());
			System.out.println("folder: " + response.getFolder());
			System.out.println("PDF File Name: " + response.getPdfFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
