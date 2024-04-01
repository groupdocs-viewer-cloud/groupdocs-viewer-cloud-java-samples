package examples.BasicUsage;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.*;

import java.io.File;

import com.groupdocs.cloud.viewer.api.*;
import examples.Constants;
import examples.UploadResources;

/**
 * This example demonstrates how to convert and download document without using cloud storage
 */
public class ConvertAndDownload {

	public static void main(String[] args) {

		ViewApi apiInstance = new ViewApi(Constants.GetConfiguration());
		try {
			
			String path = UploadResources.resourcesPath + "\\SampleFiles\\sample.docx";
			File file = apiInstance.convertAndDownload(new ConvertAndDownloadRequest("jpg", new File(path), null, null));

			System.out.println("ConvertAndDownload completed: " + file.length() + " bytes received");

		} catch (ApiException e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}