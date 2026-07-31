# com.finbourne.sdk.services.insights.model.QueryableLogType
classname QueryableLogType
The queryable fields of a single log type, returned by the queryable-fields metadata endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logType** | **String** | The log type, e.g. Requests, Vendor, Access, Trace or TraceEvent. | [default to String]
**fields** | [**List&lt;QueryableLogField&gt;**](QueryableLogField.md) | The fields of this log type that can be selected and/or filtered. | [default to List<QueryableLogField>]

```java
import com.finbourne.sdk.services.insights.model.QueryableLogType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String logType = "example logType";
List<QueryableLogField> fields = new List<QueryableLogField>();


QueryableLogType queryableLogTypeInstance = new QueryableLogType()
    .logType(logType)
    .fields(fields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)