/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jackrabbit.oak.plugins.segment.standby.jmx;

import org.apache.jackrabbit.oak.commons.jmx.Description;

@Deprecated
public interface ClientStandbyStatusMBean extends StandbyStatusMBean {

    @Description("number of consecutive failed requests")
    @Deprecated
    int getFailedRequests();

    @Description("number of seconds since last successful request")
    @Deprecated
    int getSecondsSinceLastSuccess();

    @Description("Local timestamp of the moment when the last sync cycle was started")
    @Deprecated
    long getSyncStartTimestamp();

    @Description("Local timestamp of the moment when the last sync cycle ended")
    @Deprecated
    long getSyncEndTimestamp();

    // expose the informations as operations, too

    @Description("number of consecutive failed requests")
    @Deprecated
    int calcFailedRequests();

    @Description("number of seconds since last successful request")
    @Deprecated
    int calcSecondsSinceLastSuccess();

    @Description("Runs garbage collection")
    @Deprecated
    void cleanup();

}
