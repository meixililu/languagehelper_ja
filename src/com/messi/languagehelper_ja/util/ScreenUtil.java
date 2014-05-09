package com.messi.languagehelper_ja.util;

import android.content.Context;

public class ScreenUtil {
	
	public static int dip2px(Context context, float dipValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dipValue * scale + 0.5f);
	}
	
	public static int px2dip(Context context, float pxValue){
		float scale = context.getResources().getDisplayMetrics().density;
		return (int)(pxValue / scale + 0.5f);
	}

	public static int px2sp(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().scaledDensity;
	    return (int) (pxValue / scale + 0.5f);
	}
	 
	public static int sp2px(Context context, float spValue) {
		final float scale = context.getResources().getDisplayMetrics().scaledDensity;
	    return (int) (spValue * scale + 0.5f);
	}
}
