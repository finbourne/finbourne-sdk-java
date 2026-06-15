# com.finbourne.sdk.services.luminesce.model.FileReaderBuilderResponse
classname FileReaderBuilderResponse
Information on how to construct a file-read sql query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | The generated SQL | [optional] [default to String]
**error** | **String** | The error from running generated SQL Query, if any | [optional] [default to String]
**columns** | [**List&lt;ColumnInfo&gt;**](ColumnInfo.md) | Column information for the results | [optional] [default to List<ColumnInfo>]
**data** | **Object** | The resulting data from running the Query | [optional] [default to Object]

```java
import com.finbourne.sdk.services.luminesce.model.FileReaderBuilderResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String query = "example query";
@javax.annotation.Nullable String error = "example error";
@javax.annotation.Nullable List<ColumnInfo> columns = new List<ColumnInfo>();
@javax.annotation.Nullable Object 

FileReaderBuilderResponse fileReaderBuilderResponseInstance = new FileReaderBuilderResponse()
    .query(query)
    .error(error)
    .columns(columns)
    .data(data);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)