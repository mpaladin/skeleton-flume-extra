/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package ch.cern.skeleton.flume.sink;

import org.apache.flume.EventDeliveryException;
import org.apache.flume.lifecycle.LifecycleException;
import org.junit.Before;
import org.junit.Test;

public class TestDummySink {

    private DummySink sink;

    @Before
    public void setUp() {
        sink = new DummySink();
    }

    /**
     * Test something.
     */
    @Test
    public void testSomething() throws InterruptedException, LifecycleException,
            EventDeliveryException {
        // test something
    }

}