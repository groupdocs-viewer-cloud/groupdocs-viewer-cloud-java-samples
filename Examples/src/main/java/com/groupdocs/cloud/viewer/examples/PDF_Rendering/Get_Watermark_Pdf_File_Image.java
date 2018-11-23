package com.groupdocs.cloud.viewer.examples.PDF_Rendering;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePdfFileRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_Watermark_Pdf_File_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageCreatePdfFileRequest request = new ImageCreatePdfFileRequest();
			request.setFileName("one-page.docx");

			Watermark watermark = new Watermark();
			watermark.setText("GrouDocs Cloud API");

			PdfFileOptions pdfFileOptions = new PdfFileOptions();
			pdfFileOptions.setWatermark(watermark);
			;

			request.setPdfFileOptions(pdfFileOptions);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			PdfFileInfo response = apiInstance.imageCreatePdfFile(request);

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
