package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlTransformPagesRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Rotate_Page_HTML {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlTransformPagesRequest request = new HtmlTransformPagesRequest();
			request.setFileName("one-page.docx");

			RotateOptions rotateOptions = new RotateOptions();
			rotateOptions.setPageNumber(1);
			rotateOptions.setAngle(90);

			request.setTransformOptions(rotateOptions);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			PageInfoCollection response = apiInstance.htmlTransformPages(request);

			System.out.println("Pages Count: " + response.getPages().size());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
