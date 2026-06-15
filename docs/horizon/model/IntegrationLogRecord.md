# com.finbourne.sdk.services.horizon.model.IntegrationLogRecord
classname IntegrationLogRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  | [optional] [default to String]
**idType** | **String** |  | [optional] [default to String]
**idValue** | **String** |  | [optional] [default to String]
**attributeName** | **String** |  | [optional] [default to String]
**attributeValue** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationLogRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String recordType = "example recordType";
@javax.annotation.Nullable String idType = "example idType";
@javax.annotation.Nullable String idValue = "example idValue";
@javax.annotation.Nullable String attributeName = "example attributeName";
@javax.annotation.Nullable String attributeValue = "example attributeValue";


IntegrationLogRecord integrationLogRecordInstance = new IntegrationLogRecord()
    .recordType(recordType)
    .idType(idType)
    .idValue(idValue)
    .attributeName(attributeName)
    .attributeValue(attributeValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)