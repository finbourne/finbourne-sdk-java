# com.finbourne.sdk.services.horizon.model.IntegrationLogTargetRecord
classname IntegrationLogTargetRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordAction** | **String** |  | [optional] [default to String]
**recordType** | **String** |  | [optional] [default to String]
**idType** | **String** |  | [optional] [default to String]
**idValue** | **String** |  | [optional] [default to String]
**attributeName** | **String** |  | [optional] [default to String]
**attributeValue** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationLogTargetRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String recordAction = "example recordAction";
@javax.annotation.Nullable String recordType = "example recordType";
@javax.annotation.Nullable String idType = "example idType";
@javax.annotation.Nullable String idValue = "example idValue";
@javax.annotation.Nullable String attributeName = "example attributeName";
@javax.annotation.Nullable String attributeValue = "example attributeValue";


IntegrationLogTargetRecord integrationLogTargetRecordInstance = new IntegrationLogTargetRecord()
    .recordAction(recordAction)
    .recordType(recordType)
    .idType(idType)
    .idValue(idValue)
    .attributeName(attributeName)
    .attributeValue(attributeValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)