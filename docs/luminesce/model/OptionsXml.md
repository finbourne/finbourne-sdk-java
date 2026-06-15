# com.finbourne.sdk.services.luminesce.model.OptionsXml
classname OptionsXml
Additional options applicable to the given SourceType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnTypes** | **String** | Column types (comma delimited list of: &#39;{types}&#39;, some columns may be left blank while others are specified) | [optional] [default to String]
**inferTypeRowCount** | **Integer** | If non-zero and &#39;types&#39; is not specified (or not specified for some columns) this will look through N rows to attempt to work out the column types for columns not pre-specified | [optional] [default to Integer]
**valuesToMakeNull** | **String** | Regex of values to map to &#39;null&#39; in the returned data. | [optional] [default to String]
**columnNames** | **String** | Column Names either overrides the header row or steps in when there is no header row (comma delimited list) | [optional] [default to String]
**nodePath** | **String** | XPath query that selects the nodes to map to rows | [optional] [default to String]
**namespaces** | **String** | Selected prefix(es) and namespace(s):prefix1&#x3D;namespace1-uri1,prefix2&#x3D;namespace2-uri2,...prefixN&#x3D;namespaceN-uriN | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.OptionsXml;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String columnTypes = "example columnTypes";
Integer inferTypeRowCount = new Integer("100.00");
@javax.annotation.Nullable String valuesToMakeNull = "example valuesToMakeNull";
@javax.annotation.Nullable String columnNames = "example columnNames";
@javax.annotation.Nullable String nodePath = "example nodePath";
@javax.annotation.Nullable String namespaces = "example namespaces";


OptionsXml optionsXmlInstance = new OptionsXml()
    .columnTypes(columnTypes)
    .inferTypeRowCount(inferTypeRowCount)
    .valuesToMakeNull(valuesToMakeNull)
    .columnNames(columnNames)
    .nodePath(nodePath)
    .namespaces(namespaces);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)