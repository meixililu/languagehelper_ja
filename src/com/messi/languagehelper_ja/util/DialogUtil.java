package com.messi.languagehelper_ja.util;

import java.util.ArrayList;

import android.content.Context;

import com.messi.languagehelper_ja.R;
import com.messi.languagehelper_ja.bean.DialogBean;

public class DialogUtil {
	
	public static ArrayList<DialogBean> getDialogList(Context mContext){
		ArrayList<DialogBean> list = new ArrayList<DialogBean>();
		String content = mContext.getResources().getString(R.string.dialog1);
		String[] strList = content.split("#");
		for(String item : strList){
			DialogBean bean = new DialogBean();
			bean.setQuestion(item);
			list.add(bean);
		}
		return list;
	}

}
