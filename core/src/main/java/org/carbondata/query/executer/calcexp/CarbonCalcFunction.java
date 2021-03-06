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

package org.carbondata.query.executer.calcexp;

import java.io.Serializable;

import org.carbondata.core.carbon.Exp;
import org.carbondata.query.aggregator.MeasureAggregator;
import org.carbondata.query.executer.calcexp.impl.CalcExpressionModel;

//import mondrian.carbon.Exp;

/**
 * This calculates the calculated measures.
 */
public interface CarbonCalcFunction extends Serializable {

  /**
   * Calculate the function by using aggregates
   *
   * @param msrAggs
   * @return
   */
  double calculate(MeasureAggregator[] msrAggs);

  /**
   * @param model
   * @param exp
   */
  void compile(CalcExpressionModel model, Exp exp);

}
