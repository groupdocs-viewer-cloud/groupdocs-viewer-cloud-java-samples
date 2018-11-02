package com.groupdocs.cloud.viewer.examples.Document_Information;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.util.*;

public class Create_CAD_Layers_Cache_HTML {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlCreatePagesCacheRequest request = new HtmlCreatePagesCacheRequest();
			request.setFileName("sample.DXF");

			HtmlOptions htmlOptions = new HtmlOptions();
			htmlOptions.setAttachmentPassword("");
			htmlOptions.setEmbedResources(true);

			CadOptions cadOptions = new CadOptions();
			List<String> lstLayers = new ArrayList<String>();
			lstLayers.add("SLD-0");
			lstLayers.add("DEFAULT_3");

			cadOptions.setLayers(lstLayers);
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