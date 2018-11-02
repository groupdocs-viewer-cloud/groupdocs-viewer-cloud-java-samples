package com.groupdocs.cloud.viewer.examples;

//import java.io.File;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import org.junit.BeforeClass;
//import com.aspose.storage.api.*;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Utils {

	// TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free
	// registration is required).

	public static String AppSID = "d215ce72-1609-4282-8d55-5810942236fb";
	public static String AppKey = "715d18b0afef2f303882c769921fe05a";
	public static String BaseApiUrl = "https://api.groupdocs.cloud";

	public static ViewerApi getViewerAPIInstance()
	{
		return new ViewerApi(AppSID, AppKey);
	}
//
//	private static StorageApi storageApi = new StorageApi(BaseApiUrl + "/v1", AppKey, AppSID);
//
//	private static String resourcesPath = Paths.get("resources").toAbsolutePath().toString();
//
//	@BeforeClass
//	public static void setUp() {
//		uploadTestData();
//	}
//
//	private static void uploadTestData() {
//		uploadFiles(resourcesPath);
//	}
//
//	public static void uploadFiles(String path) {
//		File directory = new File(path);
//
//		File[] files = directory.listFiles();
//		for (File file : files) {
//			String relativePath = getRelativePath(file.getAbsolutePath(), resourcesPath);
//			if (file.isFile()) {
//				uploadFile(file, relativePath);
//			} else if (file.isDirectory()) {
//				uploadFiles(file.getAbsolutePath().toString());
//			}
//		}
//	}
//
//	private static String getRelativePath(String absolutePath, String basePath) {
//		Path absolute = Paths.get(absolutePath);
//		Path base = Paths.get(basePath);
//		Path relative = base.relativize(absolute);
//
//		return relative.toString();
//	}
//
//	private static void uploadFile(File file, String relativePath) {
//		String filePath = relativePath.replace("\\", "/");
//		storageApi.PutCreate(filePath, null, null, file);
//	}
}