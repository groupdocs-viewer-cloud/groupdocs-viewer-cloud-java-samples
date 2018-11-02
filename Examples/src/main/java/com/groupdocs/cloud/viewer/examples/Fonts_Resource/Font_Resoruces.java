package com.groupdocs.cloud.viewer.examples.Fonts_Resource;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Font_Resoruces {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {

			FontCollection response = apiInstance.getFonts();

			System.out.println("File Size: " + response.getFamilies().size());
			for (FontFamily format : response.getFamilies()) {
				System.out.println("Font Nname: " + format.getName());
			}
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
