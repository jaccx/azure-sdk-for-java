// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MapsGeofenceGeometry model. */
@Fluent
public final class MapsGeofenceGeometry {
    /*
     * ID of the device.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /*
     * Distance from the coordinate to the closest border of the geofence.
     * Positive means the coordinate is outside of the geofence. If the
     * coordinate is outside of the geofence, but more than the value of
     * searchBuffer away from the closest geofence border, then the value is
     * 999. Negative means the coordinate is inside of the geofence. If the
     * coordinate is inside the polygon, but more than the value of
     * searchBuffer away from the closest geofencing border,then the value is
     * -999. A value of 999 means that there is great confidence the coordinate
     * is well outside the geofence. A value of -999 means that there is great
     * confidence the coordinate is well within the geofence.
     */
    @JsonProperty(value = "distance")
    private Float distance;

    /*
     * The unique ID for the geofence geometry.
     */
    @JsonProperty(value = "geometryId")
    private String geometryId;

    /*
     * Latitude of the nearest point of the geometry.
     */
    @JsonProperty(value = "nearestLat")
    private Float nearestLat;

    /*
     * Longitude of the nearest point of the geometry.
     */
    @JsonProperty(value = "nearestLon")
    private Float nearestLon;

    /*
     * The unique id returned from user upload service when uploading a
     * geofence. Will not be included in geofencing post API.
     */
    @JsonProperty(value = "udId")
    private String udId;

    /**
     * Get the deviceId property: ID of the device.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: ID of the device.
     *
     * @param deviceId the deviceId value to set.
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the distance property: Distance from the coordinate to the closest border of the geofence. Positive means the
     * coordinate is outside of the geofence. If the coordinate is outside of the geofence, but more than the value of
     * searchBuffer away from the closest geofence border, then the value is 999. Negative means the coordinate is
     * inside of the geofence. If the coordinate is inside the polygon, but more than the value of searchBuffer away
     * from the closest geofencing border,then the value is -999. A value of 999 means that there is great confidence
     * the coordinate is well outside the geofence. A value of -999 means that there is great confidence the coordinate
     * is well within the geofence.
     *
     * @return the distance value.
     */
    public Float getDistance() {
        return this.distance;
    }

    /**
     * Set the distance property: Distance from the coordinate to the closest border of the geofence. Positive means the
     * coordinate is outside of the geofence. If the coordinate is outside of the geofence, but more than the value of
     * searchBuffer away from the closest geofence border, then the value is 999. Negative means the coordinate is
     * inside of the geofence. If the coordinate is inside the polygon, but more than the value of searchBuffer away
     * from the closest geofencing border,then the value is -999. A value of 999 means that there is great confidence
     * the coordinate is well outside the geofence. A value of -999 means that there is great confidence the coordinate
     * is well within the geofence.
     *
     * @param distance the distance value to set.
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry setDistance(Float distance) {
        this.distance = distance;
        return this;
    }

    /**
     * Get the geometryId property: The unique ID for the geofence geometry.
     *
     * @return the geometryId value.
     */
    public String getGeometryId() {
        return this.geometryId;
    }

    /**
     * Set the geometryId property: The unique ID for the geofence geometry.
     *
     * @param geometryId the geometryId value to set.
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry setGeometryId(String geometryId) {
        this.geometryId = geometryId;
        return this;
    }

    /**
     * Get the nearestLat property: Latitude of the nearest point of the geometry.
     *
     * @return the nearestLat value.
     */
    public Float getNearestLat() {
        return this.nearestLat;
    }

    /**
     * Set the nearestLat property: Latitude of the nearest point of the geometry.
     *
     * @param nearestLat the nearestLat value to set.
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry setNearestLat(Float nearestLat) {
        this.nearestLat = nearestLat;
        return this;
    }

    /**
     * Get the nearestLon property: Longitude of the nearest point of the geometry.
     *
     * @return the nearestLon value.
     */
    public Float getNearestLon() {
        return this.nearestLon;
    }

    /**
     * Set the nearestLon property: Longitude of the nearest point of the geometry.
     *
     * @param nearestLon the nearestLon value to set.
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry setNearestLon(Float nearestLon) {
        this.nearestLon = nearestLon;
        return this;
    }

    /**
     * Get the udId property: The unique id returned from user upload service when uploading a geofence. Will not be
     * included in geofencing post API.
     *
     * @return the udId value.
     */
    public String getUdId() {
        return this.udId;
    }

    /**
     * Set the udId property: The unique id returned from user upload service when uploading a geofence. Will not be
     * included in geofencing post API.
     *
     * @param udId the udId value to set.
     * @return the MapsGeofenceGeometry object itself.
     */
    public MapsGeofenceGeometry setUdId(String udId) {
        this.udId = udId;
        return this;
    }
}
