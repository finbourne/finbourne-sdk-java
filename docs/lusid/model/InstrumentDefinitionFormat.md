# com.finbourne.sdk.services.lusid.model.InstrumentDefinitionFormat
classname InstrumentDefinitionFormat
What is the provenance of an instrument. This defines who creates/owns it, what format it is in (e.g. a proprietary format or a common and known one)              and what the version of that is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceSystem** | **String** | which source system does the format originate from | [default to String]
**vendor** | **String** | An instrument will potentially have been created by any number of different organisations. Some will be understood completely (e.g. LUSID&#39;s), some won&#39;t.              The provenance of an instrument indicates who \&quot;owns\&quot; the associated format. | [default to String]
**version** | **String** | Version of the document. Would be preferable to avoid the need, but LUSID will not control other organisations&#39; trade formats. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentDefinitionFormat;
import java.util.*;
import java.lang.System;
import java.net.URI;

String sourceSystem = "example sourceSystem";
String vendor = "example vendor";
String version = "example version";


InstrumentDefinitionFormat instrumentDefinitionFormatInstance = new InstrumentDefinitionFormat()
    .sourceSystem(sourceSystem)
    .vendor(vendor)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)