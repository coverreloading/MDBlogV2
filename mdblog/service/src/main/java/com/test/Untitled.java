package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Vincent on 16/12/25.
 * 批量删除文件前缀
 */
public class Untitled {

	public static String[] getFileName(String path) {
		File file = new File(path);
		String[] fileName = file.list();
		return fileName;
	}
	/*
	 * 无用
	 */
	public static void getAllFileName(String path, ArrayList<String> fileName) {
		File file = new File(path);
		File[] files = file.listFiles();
		String[] names = file.list();
		if (names != null)
			fileName.addAll(Arrays.asList(names));
		for (File a : files) {
			if (a.isDirectory()) {
				getAllFileName(a.getAbsolutePath(), fileName);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		String path = "E:\\新建文件夹";
		String[] fileName = getFileName(path);
		int totalNum=fileName.length;
		int successNum=0;
		for (String name : fileName) {
			System.out.println(name);
			File oldFile = new File(path+File.separator+name);
			if (!oldFile.exists()) {
				//oldFile.createNewFile();
				System.out.println("file \""+ path+File.separator+name +"\" is not exit");
			}
			System.out.println("修改前文件名称是：" + oldFile.getName());
			String rootPath = oldFile.getParent();
			System.out.println("根路径是：" + rootPath);

			String newFileName = name.replace("-[尚硅谷]_宋红康_",".");
			File newFile = new File(rootPath + File.separator + newFileName);
			System.out.println("修改后文件名称是：" +newFileName);
			if (oldFile.renameTo(newFile)) {
				System.out.println("修改成功!");
				successNum++;
			} else {
				System.out.println("修改失败,检查是否包含文件夹");
			}
			System.out.println("----------------------------------");
		}
		System.out.println("文件总数: " + totalNum);
		System.out.println("成功数量: " + successNum);
	}
}

