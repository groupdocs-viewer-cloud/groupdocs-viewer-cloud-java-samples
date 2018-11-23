package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Text_Overflow_Mode {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlCreatePagesCacheRequest request = new HtmlCreatePagesCacheRequest();
			request.setFileName("with-overflowed-text.xlsx");
			request.setFolder("");
			request.setStorage("MyStorage");

			HtmlOptions htmlOptions = new HtmlOptions();
			CellsOptions  cellsOptions  = new CellsOptions();
			cellsOptions.setTextOverflowMode("AutoFitColumn");

			htmlOptions.setCellsOptions(cellsOptions);

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
