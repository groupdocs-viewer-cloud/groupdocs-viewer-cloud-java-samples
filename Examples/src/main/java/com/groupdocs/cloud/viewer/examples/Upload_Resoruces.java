package com.groupdocs.cloud.viewer.examples;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.aspose.storage.api.StorageApi;
import com.aspose.storage.client.ApiException;

public class Upload_Resoruces {

	public static StorageApi storageApi = new StorageApi(Utils.BaseApiUrl + "/v1", Utils.AppKey, Utils.AppSID);
	public static String resourcesPath = Paths.get("src\\main\\resources").toAbsolutePath().toString();

	public static void main(String[] args) {

		try {
			setUp();
			} catch (ApiException e) {
			System.err.println("Exception when calling File Uploads");
			e.printStackTrace();
		}
	}

	public static void setUp() {
		System.out.println("File Upload Processing");
		System.out.println("resourcesPath: " + resourcesPath);
		uploadTestData();
		System.out.println("File Upload Process End");
	}

	public static void uploadTestData() {
		uploadFiles(resourcesPath);
	}

	public static void uploadFiles(String path) {
		File directory = new File(path);

		File[] files = directory.listFiles();
		for (File file : files) {
			String relativePath = getRelativePath(file.getAbsolutePath(), resourcesPath);
			if (file.isFile()) {
				uploadFile(file, relativePath);
			} else if (file.isDirectory()) {
				uploadFiles(file.getAbsolutePath().toString());
			}
		}
	}

	public static String getRelativePath(String absolutePath, String basePath) {
		Path absolute = Paths.get(absolutePath);
		Path base = Paths.get(basePath);
		Path relative = base.relativize(absolute);

		return relative.toString();
	}

	public static void uploadFile(File file, String relativePath) {
		String filePath = relativePath.replace("\\", "/");
		storageApi.PutCreate(filePath, null, null, file);
	}
}