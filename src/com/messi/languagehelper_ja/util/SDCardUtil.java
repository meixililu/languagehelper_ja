package com.messi.languagehelper_ja.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import android.content.Context;
import android.os.Environment;

public class SDCardUtil {

	/**sd卡保存文件夹名称**/
	public static final String sdPath = "/zyhy/audio/";
	
	public static void saveMp3(Context mContext,byte[] binaryData,String path){
		try {
			File apkFile = new File(path);
			apkFile.createNewFile();
			FileOutputStream mFileOutputStream = new FileOutputStream(apkFile);
			mFileOutputStream.write(binaryData);
			mFileOutputStream.flush();
			mFileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	/**sdcard路径
	 * @return
	 */
	public static String getDownloadPath() {
		File SDdir = null;
		boolean sdCardExist = Environment.getExternalStorageState().equals( android.os.Environment.MEDIA_MOUNTED);
		if (sdCardExist) {
			SDdir = Environment.getExternalStorageDirectory();
		}
		if (SDdir != null) {
			String path = SDdir.getPath() + sdPath;
			isFileExists(path);
			return path;
		} else {
			return null;
		}
	}
	
	public static void isFileExists(String path){
		File sdDir = new File(path);
		if(!sdDir.exists()){
			sdDir.mkdirs();
		}
	}
}
