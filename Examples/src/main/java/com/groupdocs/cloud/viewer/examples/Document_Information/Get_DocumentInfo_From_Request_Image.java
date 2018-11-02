package com.groupdocs.cloud.viewer.examples.Document_Information;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageGetDocumentInfoFromContentRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Get_DocumentInfo_From_Request_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {

			Path filePath = Paths.get("D://one-page.docx");
			File file = filePath.toFile();

			ImageGetDocumentInfoFromContentRequest request = new ImageGetDocumentInfoFromContentRequest();
			request.setFile(file);

			DocumentInfoOptions documentInfoOptions = new DocumentInfoOptions();
			documentInfoOptions.setPassword("");

			JSON json = new JSON();
			String content = json.serialize(documentInfoOptions);

			try {
				File documentInfoOptionsfile = File.createTempFile("java", ".json");
				FileWriter fileWriter = new FileWriter(documentInfoOptionsfile.getAbsoluteFile(), true);
				fileWriter.write(content);
				fileWriter.close();
				request.setDocumentInfoOptions(documentInfoOptionsfile);
			} catch (IOException e) {
			}

			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			DocumentInfo response = apiInstance.imageGetDocumentInfoFromContent(request);

			System.out.println("File Name: " + response.getFileName());
			System.out.println("File Extension: " + response.getFileFormat());
			System.out.println("File Pages Count: " + response.getPages().size());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
