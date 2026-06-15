# com.finbourne.sdk.services.horizon.model.InstanceDestinations
classname InstanceDestinations
record containing details of the destinations for an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationType** | **String** |  | [default to String]
**name** | **String** |  | [default to String]
**destinationPath** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.InstanceDestinations;
import java.util.*;
import java.lang.System;
import java.net.URI;

String destinationType = "example destinationType";
String name = "example name";
String destinationPath = "example destinationPath";


InstanceDestinations instanceDestinationsInstance = new InstanceDestinations()
    .destinationType(destinationType)
    .name(name)
    .destinationPath(destinationPath);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)