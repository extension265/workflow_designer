package cz.zcu.kiv.WorkflowDesigner;
/***********************************************************************************************************************
 *
 * This file is part of the Workflow Designer project

 * ==========================================
 *
 * Copyright (C) 2018 by University of West Bohemia (http://www.zcu.cz/en/)
 *
 ***********************************************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 ***********************************************************************************************************************
 *
 * FieldMismatchException, 2018/17/05 6:32 Joey Pinto
 *
 * Custom exception throw if there is a mismatch between I/O fields.
 **********************************************************************************************************************/

public class FieldMismatchException extends Exception {
    public FieldMismatchException(String field,String type){
        super("No match found for "+type+" "+ field);
    }
}
