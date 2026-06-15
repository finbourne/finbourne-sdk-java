# com.finbourne.sdk.services.luminesce.model.OptionsCsv
classname OptionsCsv
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnNames** | **String** | Column Names either overrides the header row or steps in when there is no header row (comma delimited list) | [optional] [default to String]
**columnNamesWanted** | **String** | Column (by Name) that should be returned (comma delimited list) | [optional] [default to String]
**columnTypes** | **String** | Column types (comma delimited list of: &#39;{types}&#39;, some columns may be left blank while others are specified) | [optional] [default to String]
**inferTypeRowCount** | **Integer** | If non-zero and &#39;types&#39; is not specified (or not specified for some columns) this will look through N rows to attempt to work out the column types for columns not pre-specified | [optional] [default to Integer]
**noHeader** | **Boolean** | Set this if there is no header row | [optional] [default to Boolean]
**delimiter** | **String** | The delimiter between values (\\t for tab) | [optional] [default to String]
**escape** | **String** | Character used to escape the &#39;Quote&#39; character when within a value | [optional] [default to String]
**quote** | **String** | Character used around any field containing the &#39;delimiter&#39; or a line break. | [optional] [default to String]
**valuesToMakeNull** | **String** | Regex of values to map to &#39;null&#39; in the returned data. | [optional] [default to String]
**skipPreHeader** | **Integer** | Number of rows to ignore before the header row | [optional] [default to Integer]
**skipPostHeader** | **Integer** | Number of rows to ignore after the header row | [optional] [default to Integer]
**skipInvalidRows** | **Boolean** | Skip invalid data rows (totally invalid ones),  This also allows for potentially wrong data if it can be handled somewhat e.g. embedded quotes misused (and still returns such rows). In either case a warning will show in the progress feedback. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.OptionsCsv;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String columnNames = "example columnNames";
@javax.annotation.Nullable String columnNamesWanted = "example columnNamesWanted";
@javax.annotation.Nullable String columnTypes = "example columnTypes";
Integer inferTypeRowCount = new Integer("100.00");
Boolean noHeader = true;
@javax.annotation.Nullable String delimiter = "example delimiter";
@javax.annotation.Nullable String escape = "example escape";
@javax.annotation.Nullable String quote = "example quote";
@javax.annotation.Nullable String valuesToMakeNull = "example valuesToMakeNull";
Integer skipPreHeader = new Integer("100.00");
Integer skipPostHeader = new Integer("100.00");
Boolean skipInvalidRows = true;


OptionsCsv optionsCsvInstance = new OptionsCsv()
    .columnNames(columnNames)
    .columnNamesWanted(columnNamesWanted)
    .columnTypes(columnTypes)
    .inferTypeRowCount(inferTypeRowCount)
    .noHeader(noHeader)
    .delimiter(delimiter)
    .escape(escape)
    .quote(quote)
    .valuesToMakeNull(valuesToMakeNull)
    .skipPreHeader(skipPreHeader)
    .skipPostHeader(skipPostHeader)
    .skipInvalidRows(skipInvalidRows);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)