/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hp.hpl.jena.tdb.transaction;

import org.junit.After ;
import org.junit.Before ;

import com.hp.hpl.jena.tdb.StoreConnection ;
import com.hp.hpl.jena.tdb.base.file.Location ;

/** Basic tests and tests of ordering (single thread) */
public class TestTransSequentialMem extends AbstractTestTransSeq
{
    @Before public void setup()
    {
        StoreConnection.reset() ;
    }
  
    @After public void teardown() {}
    
    @Override
    protected StoreConnection getStoreConnection()
    {
        return StoreConnection.make(Location.mem()) ;
    }
}

