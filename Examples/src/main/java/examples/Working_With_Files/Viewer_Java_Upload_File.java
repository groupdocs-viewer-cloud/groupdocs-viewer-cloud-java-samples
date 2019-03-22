package examples.Working_With_Files;

import java.io.File;
import java.nio.file.Paths;

import com.groupdocs.cloud.viewer.api.*;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;
import examples.Utils;

public class Viewer_Java_Upload_File {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Utils.AppSID, Utils.AppKey);
		try {
			File fileStream = new File(
					Paths.get("src\\main\\resources").toAbsolutePath().toString() + "\\viewers\\one-page.docx");
			UploadFileRequest request = new UploadFileRequest("viewers\\one-page1.docx", fileStream,
					Utils.MYStorage);
			FilesUploadResult response = apiInstance.uploadFile(request);
			System.out.println("Expected response type is FilesUploadResult: " + response.getUploaded().size());
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}