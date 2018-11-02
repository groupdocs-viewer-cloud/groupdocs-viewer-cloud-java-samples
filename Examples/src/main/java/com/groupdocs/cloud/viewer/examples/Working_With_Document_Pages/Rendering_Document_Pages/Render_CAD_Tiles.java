package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlCreatePagesCacheRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.util.*;

public class Render_CAD_Tiles {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlCreatePagesCacheRequest request = new HtmlCreatePagesCacheRequest();
			request.setFileName("sample.DXF");
			request.setStorage("MyStorage");

			HtmlOptions htmlOptions = new HtmlOptions();
			CadOptions cadOptions = new CadOptions();
			ArrayList<Tile> lstTiles = new ArrayList<Tile>();
			Tile tile = new Tile();

			tile.setHeight(800);
			tile.setWidth(1300);
			tile.setStartPointX(0);
			tile.setStartPointY(0);
			lstTiles.add(tile);

			tile.setHeight(800);
			tile.setWidth(1300);
			tile.setStartPointX(1300);
			tile.setStartPointY(0);
			lstTiles.add(tile);

			tile.setHeight(800);
			tile.setWidth(1300);
			tile.setStartPointX(0);
			tile.setStartPointY(800);
			lstTiles.add(tile);

			tile.setHeight(800);
			tile.setWidth(1300);
			tile.setStartPointX(1300);
			tile.setStartPointY(800);
			lstTiles.add(tile);

			cadOptions.setTiles(lstTiles);
			htmlOptions.setCadOptions(cadOptions);

			request.setHtmlOptions(htmlOptions);

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