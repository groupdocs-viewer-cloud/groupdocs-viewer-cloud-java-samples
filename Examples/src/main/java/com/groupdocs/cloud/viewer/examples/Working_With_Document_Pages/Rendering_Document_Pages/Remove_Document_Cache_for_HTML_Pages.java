package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlDeletePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Remove_Document_Cache_for_HTML_Pages {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlDeletePagesCacheRequest request = new HtmlDeletePagesCacheRequest();
			request.setFileName("one-page.docx");

			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			apiInstance.htmlDeletePagesCache(request);
			System.out.println("Cache Deleted");
			System.out.println("Executed Successfully");

		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
