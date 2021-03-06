/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.dmn.client.editors.expressions.types.function.supplementary;

import java.util.Optional;
import java.util.function.Supplier;

import org.kie.workbench.common.dmn.api.definition.v1_1.Context;
import org.kie.workbench.common.dmn.client.editors.expressions.types.ExpressionEditorDefinitions;
import org.kie.workbench.common.dmn.client.editors.expressions.types.context.ContextUIModelMapper;
import org.uberfire.ext.wires.core.grids.client.model.GridData;

public class FunctionSupplementaryGridUIModelMapper extends ContextUIModelMapper {

    public FunctionSupplementaryGridUIModelMapper(final Supplier<GridData> uiModel,
                                                  final Supplier<Optional<Context>> dmnModel,
                                                  final Supplier<ExpressionEditorDefinitions> expressionEditorDefinitionsSupplier) {
        super(uiModel,
              dmnModel,
              expressionEditorDefinitionsSupplier);
    }

    @Override
    protected boolean isLastRow(final int rowIndex) {
        return false;
    }
}
