# com.finbourne.sdk.services.lusid.model.SidesDefinitionRequest
classname SidesDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | **String** | A unique label identifying the side definition. | [default to String]
**sideRequest** | [**SideDefinitionRequest**](SideDefinitionRequest.md) |  | [default to SideDefinitionRequest]

```java
import com.finbourne.sdk.services.lusid.model.SidesDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String side = "example side";
SideDefinitionRequest sideRequest = new SideDefinitionRequest();


SidesDefinitionRequest sidesDefinitionRequestInstance = new SidesDefinitionRequest()
    .side(side)
    .sideRequest(sideRequest);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)