package cz.zcu.kiv.WorkflowDesigner;

import java.io.Serializable;
import java.util.ArrayList;

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
 * Table, 2018/17/05 6:32 Joey Pinto
 *
 * This file hosts the Table data type required to return a table as the output of a workflow block
 **********************************************************************************************************************/

public class Table implements Serializable {
    private ArrayList<String> columnHeaders;
    private ArrayList<String> rowHeaders;
    private ArrayList<ArrayList<String>>rows;

    public ArrayList<String> getColumnHeaders() {
        return columnHeaders ;
    }

    public void setColumnHeaders(ArrayList<String> columnHeaders) {
        this.columnHeaders = columnHeaders;
    }

    public ArrayList<String> getRowHeaders() {
        return rowHeaders;
    }

    public void setRowHeaders(ArrayList<String> rowHeaders) {
        this.rowHeaders = rowHeaders;
    }

    public ArrayList<ArrayList<String>> getRows() {
        return rows;
    }

    public void setRows(ArrayList<ArrayList<String>> rows) {
        this.rows = rows;
    }

    /**
     * getHTML -Joey Pinto
     * @return An HTML String representing the table data
     */
    public String getHTML(){
        StringBuilder html=new StringBuilder();
        html.append("<table border=\"1\">\n");
        boolean hasColumnHeaders = getColumnHeaders().size()>0;
        boolean hasRowHeaders = getRowHeaders().size()>0;
        if(hasColumnHeaders){
            html.append("<tr>");
            if(hasRowHeaders){
                html.append("<th></th>");
            }
            for(String header:columnHeaders){
                html.append("<th>"+header+"</th>");
            }
            html.append("</tr>\n");
        }

        for(int i=0;i<rows.size();i++){
            html.append("<tr>");
            if(hasRowHeaders){
                html.append("<th>"+getRowHeaders().get(i)+"</th>");
            }
            for(String col:rows.get(i)){
                html.append("<td>"+col+"</td>");
            }
            html.append("</tr>\n");
        }
        html.append("</table>");
        return html.toString();
    }
}