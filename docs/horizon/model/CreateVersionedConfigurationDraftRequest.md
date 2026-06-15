# com.finbourne.sdk.services.horizon.model.CreateVersionedConfigurationDraftRequest
classname CreateVersionedConfigurationDraftRequest
Request to create a new draft versioned configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**majorVersion** | **Integer** | The major version for the new draft. Must be supplied together with minorVersion, or both omitted to auto-assign the next version. | [optional] [default to Integer]
**minorVersion** | **Integer** | The minor version for the new draft. Must be supplied together with MajorVersion, or both omitted to auto-assign the next version. | [optional] [default to Integer]
**sourceMajorVersion** | **Integer** | The major version of an existing record to copy the value from. Must be supplied together with SourceMinorVersion. If omitted, the new draft is initialised with an empty JSON object. | [optional] [default to Integer]
**sourceMinorVersion** | **Integer** | The minor version of an existing record to copy the value from. Must be supplied together with SourceMajorVersion. If omitted, the new draft is initialised with an empty JSON object. | [optional] [default to Integer]
**value** | **String** | The initial JSON value for the new draft. If omitted, the draft is initialised with an empty JSON object. Cannot be supplied together with SourceMajorVersion/SourceMinorVersion. | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.CreateVersionedConfigurationDraftRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Integer majorVersion = new Integer("100.00");
@javax.annotation.Nullable Integer minorVersion = new Integer("100.00");
@javax.annotation.Nullable Integer sourceMajorVersion = new Integer("100.00");
@javax.annotation.Nullable Integer sourceMinorVersion = new Integer("100.00");
@javax.annotation.Nullable String value = "example value";


CreateVersionedConfigurationDraftRequest createVersionedConfigurationDraftRequestInstance = new CreateVersionedConfigurationDraftRequest()
    .majorVersion(majorVersion)
    .minorVersion(minorVersion)
    .sourceMajorVersion(sourceMajorVersion)
    .sourceMinorVersion(sourceMinorVersion)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)