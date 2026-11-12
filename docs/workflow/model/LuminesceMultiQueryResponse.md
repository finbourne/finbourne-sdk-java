# com.finbourne.sdk.services.workflow.model.LuminesceMultiQueryResponse
classname LuminesceMultiQueryResponse
Readonly configuration for the Luminesce custom multi-query Worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**workspaceKey** | **String** | The Workspaces key of the multi-query the worker runs | [optional] [default to String]
**driveLocationAndFileName** | **String** | Where in Drive the results are saved, which may contain placeholders | [optional] [default to String]
**format** | **String** | The format the results are saved in, csv when not given | [optional] [default to String]
**mayOverwrite** | **Boolean** | Whether an existing file of the same name may be overwritten | [optional] [default to Boolean]
**driveTemplateLocation** | **String** | The Drive path of the template the results are saved with | [optional] [default to String]
**dateTimeFormat** | **String** | The format DateTime values are written in | [optional] [default to String]
**whenSomeFail** | **Boolean** | Whether the results of the queries that succeeded are still saved when others did not | [optional] [default to Boolean]
**keepForSeconds** | **Integer** | How long Luminesce keeps the results once done, in seconds | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.workflow.model.LuminesceMultiQueryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String workspaceKey = "example workspaceKey";
@javax.annotation.Nullable String driveLocationAndFileName = "example driveLocationAndFileName";
@javax.annotation.Nullable String format = "example format";
@javax.annotation.Nullable Boolean mayOverwrite = true;
@javax.annotation.Nullable String driveTemplateLocation = "example driveTemplateLocation";
@javax.annotation.Nullable String dateTimeFormat = "example dateTimeFormat";
@javax.annotation.Nullable Boolean whenSomeFail = true;
Integer keepForSeconds = new Integer("100.00");


LuminesceMultiQueryResponse luminesceMultiQueryResponseInstance = new LuminesceMultiQueryResponse()
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