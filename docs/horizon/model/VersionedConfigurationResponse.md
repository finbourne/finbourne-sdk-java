# com.finbourne.sdk.services.horizon.model.VersionedConfigurationResponse
classname VersionedConfigurationResponse
Represents a versioned configuration record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The logical name of the configuration. | [default to String]
**configType** | **String** | The category of configuration. | [default to String]
**majorVersion** | **Integer** | The major version number. | [default to Integer]
**minorVersion** | **Integer** | The minor version number. | [default to Integer]
**value** | **String** | The JSON configuration value. | [default to String]
**isDraft** | **Boolean** | Whether this version is still in draft state. Draft versions can be edited; locked versions cannot. | [default to Boolean]

```java
import com.finbourne.sdk.services.horizon.model.VersionedConfigurationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String configType = "example configType";
Integer majorVersion = new Integer("100.00");
Integer minorVersion = new Integer("100.00");
String value = "example value";
Boolean isDraft = true;


VersionedConfigurationResponse versionedConfigurationResponseInstance = new VersionedConfigurationResponse()
    .name(name)
    .configType(configType)
    .majorVersion(majorVersion)
    .minorVersion(minorVersion)
    .value(value)
    .isDraft(isDraft);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)