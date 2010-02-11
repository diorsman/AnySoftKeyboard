package com.menny.android.anysoftkeyboard.keyboards.providers;

import com.menny.android.anysoftkeyboard.keyboards.KeyboardProvider;

import android.net.Uri;

public class FrenchCanadaKeyboardProvider extends KeyboardProvider {	
	public static final String AUTHORITY = "com.anysoftkeyboard.keyboard.french.canada";
	public static final Uri CONTENT_URI = Uri.parse("content://"+AUTHORITY+"/items");
	
	@Override
	protected String getKeyboardLayoutId() {
		return "ca_fr_qwerty";
	}
	
	@Override
	protected int getKeyboardSortValue() {
		return 151;
	}

	@Override
	protected String getKeyboardEnabledPrefKey() {
		return "fr_ca_keyboard";
	}

	@Override
	protected String getKeyboardNameResId() {
		return "fr_ca_keyboard";
	}
	
	@Override
	protected String getPackageName()
	{
		return "com.menny.android.anysoftkeyboard";
	}

	@Override
	protected String getDefaultDictionary() {
		return "French";
	}
}