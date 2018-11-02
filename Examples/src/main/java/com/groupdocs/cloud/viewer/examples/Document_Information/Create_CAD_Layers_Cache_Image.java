package com.groupdocs.cloud.viewer.examples.Document_Information;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.util.*;

public class Create_CAD_Layers_Cache_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageCreatePagesCacheRequest request = new ImageCreatePagesCacheRequest();
			request.setFileName("sample.DXF");

			CadOptions cadOptions = new CadOptions();
			List<String> lstLayers = new ArrayList<String>();
			lstLayers.add("SLD-0");
			lstLayers.add("DEFAULT_3");

			cadOptions.setLayers(lstLayers);
			request.setFolder("");
			request.setStorage("MyStorage");

			ImagePageCollection response = apiInstance.imageCreatePagesCache(request);

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
