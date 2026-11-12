# com.finbourne.sdk.services.workflow.model.LuminesceMultiQuery
classname LuminesceMultiQuery
Configuration for a Worker that runs a Luminesce custom multi-query saved in Workspaces, saving its results to Drive as one file. Its parameters are the multi-query's scalar parameters, and the export settings below, which a task may override through the worker's `export-*` parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**workspaceKey** | **String** | The Workspaces key of the multi-query, e.g. &#x60;shared/SomeWorkspace/items/sets/SomeSet&#x60;, read as each run starts. An item of a personal workspace can only be read by the user who saved it, so only runs as that user can use it. | [default to String]
**driveLocationAndFileName** | **String** | Where in Drive to save the results. May contain the placeholders &#x60;{executionId}&#x60;, &#x60;{date:format}&#x60; (when the queries started, UTC) and &#x60;{param:name}&#x60; (a scalar parameter&#39;s value); the extension comes from the format. | [default to String]
**format** | **String** | The format to save in: csv (the default), pipe, excel, json, jsonProper, jsonProperWithLineage, jsonProperByTable, xml, parquet, sqlite or pdf. Several results are one worksheet each for excel, one table each for sqlite, one key each for jsonProperByTable, and otherwise one file each within a zip. | [optional] [default to String]
**mayOverwrite** | **Boolean** | Whether an existing file of the same name may be overwritten, rather than the run failing. False by default. | [optional] [default to Boolean]
**driveTemplateLocation** | **String** | The Drive path and file name of a template to save with. Only excel and pdf support templates. | [optional] [default to String]
**dateTimeFormat** | **String** | The format to write DateTime values in, Luminesce&#39;s default (&#x60;yyyy-MM-dd HH:mm:ss.fff&#x60;) when not given. | [optional] [default to String]
**whenSomeFail** | **Boolean** | Whether the results of the queries that succeeded are still saved when others did not, the worker then completing with the status PartiallyCompleted. False by default, the worker then failing with nothing saved. | [optional] [default to Boolean]
**keepForSeconds** | **Integer** | How long Luminesce keeps the results once done, e.g. to look into a run or save them again: 2 hours by default, at most 31 days. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.workflow.model.LuminesceMultiQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String workspaceKey = "example workspaceKey";
String driveLocationAndFileName = "example driveLocationAndFileName";
@javax.annotation.Nullable String format = "example format";
@javax.annotation.Nullable Boolean mayOverwrite = true;
@javax.annotation.Nullable String driveTemplateLocation = "example driveTemplateLocation";
@javax.annotation.Nullable String dateTimeFormat = "example dateTimeFormat";
@javax.annotation.Nullable Boolean whenSomeFail = true;
@javax.annotation.Nullable Integer keepForSeconds = new Integer("100.00");


LuminesceMultiQuery luminesceMultiQueryInstance = new LuminesceMultiQuery()
    .type(type)
    .workspaceKey(workspaceKey)
    .driveLocationAndFileName(driveLocationAndFileName)
    .format(format)
    .mayOverwrite(mayOverwrite)
    .driveTemplateLocation(driveTemplateLocation)
    .dateTimeFormat(dateTimeFormat)
    .whenSomeFail(whenSomeFail)
    .keepForSeconds(keepForSeconds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)