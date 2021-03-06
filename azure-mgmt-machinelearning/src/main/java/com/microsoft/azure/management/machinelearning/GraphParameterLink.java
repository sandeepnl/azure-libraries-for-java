/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearning;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Association link for a graph global parameter to a node in the graph.
 */
public class GraphParameterLink {
    /**
     * The graph node's identifier.
     */
    @JsonProperty(value = "nodeId", required = true)
    private String nodeId;

    /**
     * The identifier of the node parameter that the global parameter maps to.
     */
    @JsonProperty(value = "parameterKey", required = true)
    private String parameterKey;

    /**
     * Get the nodeId value.
     *
     * @return the nodeId value
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Set the nodeId value.
     *
     * @param nodeId the nodeId value to set
     * @return the GraphParameterLink object itself.
     */
    public GraphParameterLink withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get the parameterKey value.
     *
     * @return the parameterKey value
     */
    public String parameterKey() {
        return this.parameterKey;
    }

    /**
     * Set the parameterKey value.
     *
     * @param parameterKey the parameterKey value to set
     * @return the GraphParameterLink object itself.
     */
    public GraphParameterLink withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

}
