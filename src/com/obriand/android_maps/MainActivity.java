package com.obriand.android_maps;

import android.os.Bundle;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.view.Menu;

/*
 * We must get an API key for the google map view
 * 1- Locate debug keystore : on mac : /Users/olivierbriand/.android/debug.keystore
 * 2- Command line où il y a le fichier.keystore : keytool -list -alias androiddebugkey -keystore debug.keystore -storepass android -keypass android
 * 3- Empreinte du cerificat obtenu sur macbook air : CC:D3:E7:0A:0A:6E:7D:41:5D:2D:42:24:E5:BC:FE:6B
 * 4- Clé api Google maps : 0Y58BgKIEMB5b7-a3cgCNlwyKDmoEuGbZqZT6Hw
 * 
 */

public class MainActivity extends MapActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MapView mapView = (MapView) findViewById(R.id.main_mapview);
	    mapView.setBuiltInZoomControls(true);
	}

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}
