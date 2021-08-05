package examples;

import examples.BasicUsage.*;
import examples.BasicUsage.HtmlViewer.*;
import examples.BasicUsage.ImageViewer.*;
import examples.BasicUsage.PdfViewer.*;
import examples.AdvancedUsage.CommonRenderingOptions.*;
import examples.AdvancedUsage.LoadingOptions.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingArchiveFiles.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingCadDrawings.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingEmailMessages.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingMsProjectDocuments.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingOutlookDataFiles.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingPdfDocuments.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingSpreadsheets.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingWordProcessingDocuments.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingLotusNotesDatabase.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingTextFiles.*;
import examples.AdvancedUsage.RenderingOptionsByFileType.RenderingVisioDocuments.*;


public class RunExamples {

	public static void main(String[] args) {

		// Upload files
		UploadResources.main(args);

		// Basic usage examples

		GetSupportedFormats.main(args);
		GetDocumentInformation.main(args);
		GetAttachments.main(args);
		HtmlViewerExcludeFonts.main(args);
		HtmlViewerMinifyHtml.main(args);
		HtmlViewerResponsiveLayout.main(args);
		ImageViewerAddTextOverlay.main(args);
		ImageViewerAdjustImageSize.main(args);
		ImageViewerAdjustJpgQuality.main(args);
		ImageViewerGetTextCoordinates.main(args);
		PdfViewerAdjustJpgQuality.main(args);
		PdfViewerProtectPdf.main(args);

		// Advanced examples

		ViewProtectedDocument.main(args);
		SpecifyEncoding.main(args);
		RenderWithCustomFonts.main(args);
		AddWatermark.main(args);
		RenderComments.main(args);
		RenderNotes.main(args);
		RenderHiddenPages.main(args);
		RenderConsecutivePages.main(args);
		RenderSelectedPages.main(args);
		ReplaceMissingFont.main(args);
		ReorderPages.main(args);
		FlipRotatePages.main(args);
		GetInfoForArchiveFile.main(args);
		RenderArchiveFolder.main(args);
		AdjustOutputImageSize.main(args);
		GetInfoForCadDrawing.main(args);
		RenderAllLayouts.main(args);
		RenderLayers.main(args);
		RenderSingleLayout.main(args);		
		AdjustPageSize.main(args);
		RenameEmailFields.main(args);
		GetInfoForProjectFile.main(args);
		AdjustTimeUnit.main(args);
		RenderTimeInterval.main(args);
		GetInfoForOutlookDataFile.main(args);
		LimitCountOfItemsToRender.main(args);
		RenderFolder.main(args);
		FilterMessages.main(args);
		AdjustImageQuality.main(args);
		DisableCharsGrouping.main(args);
		EnableFontHinting.main(args);
		EnableLayeredRendering.main(args);
		GetInfoForPdfFile.main(args);
		RenderOriginalPageSize.main(args);
		AdjustTextOverflowInCells.main(args);
		RenderSpreadsheetWithGridLines.main(args);
		RenderHiddenColumnsAndRows.main(args);
		RenderPrintAreas.main(args);
		SkipRenderingOfEmptyColumns.main(args);
		SkipRenderingOfEmptyRows.main(args);
		SplitWorksheetsIntoPages.main(args);
		RenderTrackedChanges.main(args);		

		SpecifyMaxCharsAndRows.main(args);
		RenderVisioDocumentFigures.main(args);
		FilterMailStorage.main(args);
		HtmlViewerLimitImageSize.main(args);
		HtmlViewerOptimizeForPrinting.main(args);

		System.out.println("Completed");
	}	
}