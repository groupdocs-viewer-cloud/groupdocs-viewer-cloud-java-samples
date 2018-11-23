package com.groupdocs.cloud.viewer.examples.Fonts_Resource;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Delete_Font_Cache {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {

			apiInstance.deleteFontsCache();

			System.out.println("Cache Deleted");
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
