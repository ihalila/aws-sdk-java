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

package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Run JSON Unmarshaller
 */
public class RunJsonUnmarshaller implements
        Unmarshaller<Run, JsonUnmarshallerContext> {

    public Run unmarshall(JsonUnmarshallerContext context) throws Exception {
        Run run = new Run();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    run.setArn(StringJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    run.setName(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    run.setType(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    run.setPlatform(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    run.setCreated(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    run.setStatus(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("result", targetDepth)) {
                    context.nextToken();
                    run.setResult(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("started", targetDepth)) {
                    context.nextToken();
                    run.setStarted(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("stopped", targetDepth)) {
                    context.nextToken();
                    run.setStopped(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("counters", targetDepth)) {
                    context.nextToken();
                    run.setCounters(CountersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    run.setMessage(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("totalJobs", targetDepth)) {
                    context.nextToken();
                    run.setTotalJobs(IntegerJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("completedJobs", targetDepth)) {
                    context.nextToken();
                    run.setCompletedJobs(IntegerJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("billingMethod", targetDepth)) {
                    context.nextToken();
                    run.setBillingMethod(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("deviceMinutes", targetDepth)) {
                    context.nextToken();
                    run.setDeviceMinutes(DeviceMinutesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return run;
    }

    private static RunJsonUnmarshaller instance;

    public static RunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RunJsonUnmarshaller();
        return instance;
    }
}
