/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.carbondata.core.keygenerator.directdictionary;

import org.carbondata.core.carbon.SqlStatement;
import org.carbondata.core.carbon.metadata.datatype.DataType;
import org.carbondata.core.keygenerator.directdictionary.timestamp.TimeStampDirectDictionaryGenerator;

/**
 * Factory for DirectDictionary Key generator
 */
public final class DirectDictionaryKeyGeneratorFactory {
  /**
   * private constructor
   */
  private DirectDictionaryKeyGeneratorFactory() {

  }

  //@TODO The SqlStatement.Type should be removed from the data processing flow
  // Two method are exposed because the data processing flow has SqlStatement.Type
  // and query flow has org.carbondata.core.carbon.metadata.datatype.DataType
  /**
   * The method returns the DirectDictionaryGenerator based for direct dictionary
   * column based on dataType
   *
   * @param dataType SqlStatement.Type
   * @return the generator instance
   */
  public static DirectDictionaryGenerator getDirectDictionaryGenerator(SqlStatement.Type dataType) {
    DirectDictionaryGenerator directDictionaryGenerator = null;
    switch (dataType) {
      case TIMESTAMP:
        directDictionaryGenerator = new TimeStampDirectDictionaryGenerator();
        break;
      default:

    }
    return directDictionaryGenerator;
  }

  /**
   * The method returns the DirectDictionaryGenerator based for direct dictionary
   * column based on dataType
   *
   * @param dataType DataType
   * @return the generator instance
   */
  public static DirectDictionaryGenerator getDirectDictionaryGenerator(DataType dataType) {
    DirectDictionaryGenerator directDictionaryGenerator = null;
    switch (dataType) {
      case TIMESTAMP:
        directDictionaryGenerator = new TimeStampDirectDictionaryGenerator();
        break;
      default:

    }
    return directDictionaryGenerator;
  }
}
