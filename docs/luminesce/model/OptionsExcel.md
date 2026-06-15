# com.finbourne.sdk.services.luminesce.model.OptionsExcel
classname OptionsExcel
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnNames** | **String** | Column Names either overrides the header row or steps in when there is no header row (comma delimited list) | [optional] [default to String]
**columnTypes** | **String** | Column types (comma delimited list of: &#39;{types}&#39;, some columns may be left blank while others are specified) | [optional] [default to String]
**inferTypeRowCount** | **Integer** | If non-zero and &#39;types&#39; is not specified (or not specified for some columns) this will look through N rows to attempt to work out the column types for columns not pre-specified | [optional] [default to Integer]
**noHeader** | **Boolean** | Set this if there is no header row | [optional] [default to Boolean]
**calculate** | **Boolean** | Whether to attempt a calculation of the imported cell range prior to import | [optional] [default to Boolean]
**password** | **String** | If specified will be used as the password used for password protected workbooks | [optional] [default to String]
**worksheet** | **String** | The worksheet containing the cell range to import (name or index, will default to first) | [optional] [default to String]
**rangeOrTable** | **String** | The cell range to import as either a specified range or a table name | [optional] [default to String]
**ignoreInvalidCells** | **Boolean** | If specified cells which can not be successfully converted to the target type will be ignored | [optional] [default to Boolean]
**ignoreBlankRows** | **Boolean** | If the entire rows has only blank cells it will be ignored will be ignored | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.OptionsExcel;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String columnNames = "example columnNames";
@javax.annotation.Nullable String columnTypes = "example columnTypes";
Integer inferTypeRowCount = new Integer("100.00");
Boolean noHeader = true;
Boolean calculate = true;
@javax.annotation.Nullable String password = "example password";
@javax.annotation.Nullable String worksheet = "example worksheet";
@javax.annotation.Nullable String rangeOrTable = "example rangeOrTable";
Boolean ignoreInvalidCells = true;
Boolean ignoreBlankRows = true;


OptionsExcel optionsExcelInstance = new OptionsExcel()
    .columnNames(columnNames)
    .columnTypes(columnTypes)
    .inferTypeRowCount(inferTypeRowCount)
    .noHeader(noHeader)
    .calculate(calculate)
    .password(password)
    .worksheet(worksheet)
    .rangeOrTable(rangeOrTable)
    .ignoreInvalidCells(ignoreInvalidCells)
    .ignoreBlankRows(ignoreBlankRows);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)