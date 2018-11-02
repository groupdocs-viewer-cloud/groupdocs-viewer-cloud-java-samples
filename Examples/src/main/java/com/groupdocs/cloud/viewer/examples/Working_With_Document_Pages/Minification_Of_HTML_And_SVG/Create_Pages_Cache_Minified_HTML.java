package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Minification_Of_HTML_And_SVG;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Create_Pages_Cache_Minified_HTML {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlCreatePagesCacheRequest request = new HtmlCreatePagesCacheRequest();
			request.setFileName("one-page.docx");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			HtmlOptions htmlOptions = new HtmlOptions();
			htmlOptions.setEnableMinification(true);
			htmlOptions.setEmbedResources(true);

			request.setHtmlOptions(htmlOptions);
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			HtmlPageCollection response = apiInstance.htmlCreatePagesCache(request);

			System.out.println("File Name: " + response.getFileName());
			System.out.println("File Pages Count: " + response.getPages().size());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
