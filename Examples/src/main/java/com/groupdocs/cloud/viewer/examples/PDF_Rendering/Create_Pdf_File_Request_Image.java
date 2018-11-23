package com.groupdocs.cloud.viewer.examples.PDF_Rendering;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePdfFileFromContentRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create_Pdf_File_Request_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {

			Path filePath = Paths.get("D://one-page.docx");
			File file = filePath.toFile();

			Watermark watermark = new Watermark();
			watermark.setText("GrouDocs Cloud API");

			PdfFileOptions pdfFileOptions = new PdfFileOptions();
			pdfFileOptions.setWatermark(watermark);

			ImageCreatePdfFileFromContentRequest request = new ImageCreatePdfFileFromContentRequest();
			request.setFile(file);

			JSON json = new JSON();
			String content = json.serialize(pdfFileOptions);

			try {
				File pdfFileOptionsfile = File.createTempFile("java", ".json");
				FileWriter fileWriter = new FileWriter(pdfFileOptionsfile.getAbsoluteFile(), true);
				fileWriter.write(content);
				fileWriter.close();
				request.setPdfFileOptions(pdfFileOptionsfile);
			} catch (IOException e) {
			}

			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			PdfFileInfo response = apiInstance.imageCreatePdfFileFromContent(request);

			System.out.println("File Name: " + response.getFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
