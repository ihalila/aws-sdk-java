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

package com.amazonaws.services.sqs.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ReceiveMessageRequest Marshaller
 */

public class ReceiveMessageRequestMarshaller implements
        Marshaller<Request<ReceiveMessageRequest>, ReceiveMessageRequest> {

    public Request<ReceiveMessageRequest> marshall(
            ReceiveMessageRequest receiveMessageRequest) {

        if (receiveMessageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ReceiveMessageRequest> request = new DefaultRequest<ReceiveMessageRequest>(
                receiveMessageRequest, "AmazonSQS");
        request.addParameter("Action", "ReceiveMessage");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (receiveMessageRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl",
                    StringUtils.fromString(receiveMessageRequest.getQueueUrl()));
        }

        com.amazonaws.internal.SdkInternalList<String> attributeNamesList = (com.amazonaws.internal.SdkInternalList<String>) receiveMessageRequest
                .getAttributeNames();
        if (!attributeNamesList.isEmpty()
                || !attributeNamesList.isAutoConstruct()) {
            int attributeNamesListIndex = 1;

            for (String attributeNamesListValue : attributeNamesList) {
                if (attributeNamesListValue != null) {
                    request.addParameter("AttributeName."
                            + attributeNamesListIndex,
                            StringUtils.fromString(attributeNamesListValue));
                }
                attributeNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> messageAttributeNamesList = (com.amazonaws.internal.SdkInternalList<String>) receiveMessageRequest
                .getMessageAttributeNames();
        if (!messageAttributeNamesList.isEmpty()
                || !messageAttributeNamesList.isAutoConstruct()) {
            int messageAttributeNamesListIndex = 1;

            for (String messageAttributeNamesListValue : messageAttributeNamesList) {
                if (messageAttributeNamesListValue != null) {
                    request.addParameter("MessageAttributeName."
                            + messageAttributeNamesListIndex, StringUtils
                            .fromString(messageAttributeNamesListValue));
                }
                messageAttributeNamesListIndex++;
            }
        }

        if (receiveMessageRequest.getMaxNumberOfMessages() != null) {
            request.addParameter("MaxNumberOfMessages",
                    StringUtils.fromInteger(receiveMessageRequest
                            .getMaxNumberOfMessages()));
        }

        if (receiveMessageRequest.getVisibilityTimeout() != null) {
            request.addParameter("VisibilityTimeout", StringUtils
                    .fromInteger(receiveMessageRequest.getVisibilityTimeout()));
        }

        if (receiveMessageRequest.getWaitTimeSeconds() != null) {
            request.addParameter("WaitTimeSeconds", StringUtils
                    .fromInteger(receiveMessageRequest.getWaitTimeSeconds()));
        }

        return request;
    }

}
