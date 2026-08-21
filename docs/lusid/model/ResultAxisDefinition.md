# com.finbourne.sdk.services.lusid.model.ResultAxisDefinition
classname ResultAxisDefinition
Describes one labelled axis of a matrix-shaped result (Result1D/Result2D), so consumers can  tell what the labels on that axis mean without opening each value.  A Result1D has a single Y axis; a Result2D has a Y (row) and an X (column) axis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**axis** | **String** | Which axis of the result this describes: \&quot;Y\&quot; labels the rows (the only axis of a Result1D,  serialized as labelsY on the value); \&quot;X\&quot; labels the columns of a Result2D (labelsX). | [optional] [default to String]
**name** | **String** | The display name of the axis, e.g. \&quot;Bucket\&quot; or \&quot;Expiry\&quot;. | [optional] [default to String]
**labelType** | **String** | What kind of value the axis labels are drawn from, e.g. \&quot;Tenor\&quot;, \&quot;Date\&quot; or \&quot;Strike\&quot;.  Consumers can switch rendering on well-known values and fall back to showing labels verbatim. | [optional] [default to String]
**description** | **String** | What the axis means for this result. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResultAxisDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String axis = "example axis";
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String labelType = "example labelType";
@javax.annotation.Nullable String description = "example description";


ResultAxisDefinition resultAxisDefinitionInstance = new ResultAxisDefinition()
    .axis(axis)
    .name(name)
    .labelType(labelType)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)