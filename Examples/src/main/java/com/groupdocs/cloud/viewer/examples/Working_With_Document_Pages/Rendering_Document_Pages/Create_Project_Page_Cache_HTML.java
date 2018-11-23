package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Create_Project_Page_Cache_HTML {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlCreatePagesCacheRequest request = new HtmlCreatePagesCacheRequest();
			request.setFileName("sample2.mpp");

			ProjectOptions projectOptions = new ProjectOptions();
			projectOptions.setPageSize("A4");
			projectOptions.setTimeUnit("Unknown");

			HtmlOptions htmlOptions = new HtmlOptions();
			htmlOptions.setAttachmentPassword("");
			htmlOptions.setEmbedResources(true);
			htmlOptions.setProjectOptions(projectOptions);

			request.setHtmlOptions(htmlOptions);
			request.setFolder("");
			request.setStorage("MyStorage");

			HtmlPageCollection response = apiInstance.htmlCreatePagesCache(request);

			System.out.println("Cache Created");
			System.out.println("Pages Count: " + response.getPages().size());
			System.out.println("File Name: " + response.getFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
