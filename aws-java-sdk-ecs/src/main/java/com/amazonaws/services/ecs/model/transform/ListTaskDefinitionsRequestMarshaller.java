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

package com.amazonaws.services.ecs.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ListTaskDefinitionsRequest Marshaller
 */
public class ListTaskDefinitionsRequestMarshaller
        implements
        Marshaller<Request<ListTaskDefinitionsRequest>, ListTaskDefinitionsRequest> {

    public Request<ListTaskDefinitionsRequest> marshall(
            ListTaskDefinitionsRequest listTaskDefinitionsRequest) {

        if (listTaskDefinitionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListTaskDefinitionsRequest> request = new DefaultRequest<ListTaskDefinitionsRequest>(
                listTaskDefinitionsRequest, "AmazonECS");
        request.addHeader("X-Amz-Target",
                "AmazonEC2ContainerServiceV20141113.ListTaskDefinitions");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (listTaskDefinitionsRequest.getFamilyPrefix() != null) {
                jsonWriter.key("familyPrefix").value(
                        listTaskDefinitionsRequest.getFamilyPrefix());
            }

            if (listTaskDefinitionsRequest.getStatus() != null) {
                jsonWriter.key("status").value(
                        listTaskDefinitionsRequest.getStatus());
            }

            if (listTaskDefinitionsRequest.getSort() != null) {
                jsonWriter.key("sort").value(
                        listTaskDefinitionsRequest.getSort());
            }

            if (listTaskDefinitionsRequest.getNextToken() != null) {
                jsonWriter.key("nextToken").value(
                        listTaskDefinitionsRequest.getNextToken());
            }

            if (listTaskDefinitionsRequest.getMaxResults() != null) {
                jsonWriter.key("maxResults").value(
                        listTaskDefinitionsRequest.getMaxResults());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
