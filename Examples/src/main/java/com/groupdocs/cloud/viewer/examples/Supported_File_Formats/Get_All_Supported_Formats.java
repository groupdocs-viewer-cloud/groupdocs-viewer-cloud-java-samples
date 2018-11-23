package com.groupdocs.cloud.viewer.examples.Supported_File_Formats;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_All_Supported_Formats {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			FormatCollection response = apiInstance.getSupportedFileFormats();

			if (response.getFormats().size() > 0) {
				for (Format format : response.getFormats()) {
					System.out.println("Format: " + format.toString());
				}
			}
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
