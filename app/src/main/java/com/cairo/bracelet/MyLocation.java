package com.cairo.bracelet;

import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by alejandro on 11/12/17.
 */

public class MyLocation implements LocationListener {
    double lng = 0;
    double lat = 0;

    @Override
    public void onLocationChanged(android.location.Location location) {
        lng = location.getLongitude();
        lat = location.getLatitude();
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {}

    @Override
    public void onProviderEnabled(String s) {}

    @Override
    public void onProviderDisabled(String s) {}
}
