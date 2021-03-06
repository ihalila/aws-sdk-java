/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateDistributionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private DistributionConfig distributionConfig;

    private String id;

    private String ifMatch;

    /**
     * Default constructor for UpdateDistributionRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public UpdateDistributionRequest() {
    }

    /**
     * Constructs a new UpdateDistributionRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param distributionConfig
     * @param id
     * @param ifMatch
     */
    public UpdateDistributionRequest(DistributionConfig distributionConfig,
            String id, String ifMatch) {
        setDistributionConfig(distributionConfig);
        setId(id);
        setIfMatch(ifMatch);
    }

    /**
     * @param distributionConfig
     */
    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * @return
     */
    public DistributionConfig getDistributionConfig() {
        return this.distributionConfig;
    }

    /**
     * @param distributionConfig
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateDistributionRequest withDistributionConfig(
            DistributionConfig distributionConfig) {
        setDistributionConfig(distributionConfig);
        return this;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateDistributionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param ifMatch
     */
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * @return
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * @param ifMatch
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateDistributionRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: " + getDistributionConfig() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIfMatch() != null)
            sb.append("IfMatch: " + getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDistributionRequest == false)
            return false;
        UpdateDistributionRequest other = (UpdateDistributionRequest) obj;
        if (other.getDistributionConfig() == null
                ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null
                && other.getDistributionConfig().equals(
                        this.getDistributionConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null
                && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDistributionConfig() == null) ? 0
                        : getDistributionConfig().hashCode());
        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDistributionRequest clone() {
        return (UpdateDistributionRequest) super.clone();
    }
}