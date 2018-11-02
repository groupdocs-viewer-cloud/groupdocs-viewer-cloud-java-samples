package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageTransformPagesRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Reorder_Page_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageTransformPagesRequest request = new ImageTransformPagesRequest();
			request.setFileName("one-page.docx");

			ReorderOptions reorderOptions = new ReorderOptions();
			reorderOptions.setPageNumber(1);
			reorderOptions.setNewPosition (2);

			request.setTransformOptions(reorderOptions);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			PageInfoCollection response = apiInstance.imageTransformPages(request);

			System.out.println("Pages Count: " + response.getPages().size());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
