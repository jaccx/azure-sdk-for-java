// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The DeviceTelemetryEventProperties model. */
@Fluent
public class DeviceTelemetryEventProperties {
    /*
     * The content of the message from the device.
     */
    @JsonProperty(value = "body")
    private Object body;

    /*
     * Application properties are user-defined strings that can be added to the
     * message. These fields are optional.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /*
     * System properties help identify contents and source of the messages.
     */
    @JsonProperty(value = "systemProperties")
    private Map<String, String> systemProperties;

    /**
     * Get the body property: The content of the message from the device.
     *
     * @return the body value.
     */
    public Object getBody() {
        return this.body;
    }

    /**
     * Set the body property: The content of the message from the device.
     *
     * @param body the body value to set.
     * @return the DeviceTelemetryEventProperties object itself.
     */
    public DeviceTelemetryEventProperties setBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get the properties property: Application properties are user-defined strings that can be added to the message.
     * These fields are optional.
     *
     * @return the properties value.
     */
    public Map<String, String> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Application properties are user-defined strings that can be added to the message.
     * These fields are optional.
     *
     * @param properties the properties value to set.
     * @return the DeviceTelemetryEventProperties object itself.
     */
    public DeviceTelemetryEventProperties setProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemProperties property: System properties help identify contents and source of the messages.
     *
     * @return the systemProperties value.
     */
    public Map<String, String> getSystemProperties() {
        return this.systemProperties;
    }

    /**
     * Set the systemProperties property: System properties help identify contents and source of the messages.
     *
     * @param systemProperties the systemProperties value to set.
     * @return the DeviceTelemetryEventProperties object itself.
     */
    public DeviceTelemetryEventProperties setSystemProperties(Map<String, String> systemProperties) {
        this.systemProperties = systemProperties;
        return this;
    }
}
