# com.finbourne.sdk.services.luminesce.model.AvailableField
classname AvailableField
Information about a field that can be designed on (regardless if it currently is) Kind of a \"mini-available catalog entry\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Field | [default to String]
**dataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**fieldType** | [**FieldType**](FieldType.md) |  | [default to FieldType]
**isMain** | **Boolean** | Is this a Main Field within the Provider | [optional] [default to Boolean]
**isPrimaryKey** | **Boolean** | Is this a member of the PrimaryKey of the Provider | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.AvailableField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
DataType FieldType @javax.annotation.Nullable Boolean isMain = true;
@javax.annotation.Nullable Boolean isPrimaryKey = true;


AvailableField availableFieldInstance = new AvailableField()
    .name(name)
    .dataType(dataType)
    .fieldType(fieldType)
    .isMain(isMain)
    .isPrimaryKey(isPrimaryKey);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)