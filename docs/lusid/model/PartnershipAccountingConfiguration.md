# com.finbourne.sdk.services.lusid.model.PartnershipAccountingConfiguration
classname PartnershipAccountingConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  | [default to Boolean]
**configPack** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**commitmentCurrencyPolicy** | **String** | Available values: FundCurrencyOnly, AllowLineCurrency. | [optional] [default to String]
**registerPortfolioGroup** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**capitalModel** | **String** | Available values: PartnershipCapitalAccounts, SeriesUnitised. | [optional] [default to String]
**capabilityOverrides** | [**List&lt;CapabilityOverride&gt;**](CapabilityOverride.md) |  | [optional] [default to List<CapabilityOverride>]
**series** | [**SeriesConfiguration**](SeriesConfiguration.md) |  | [optional] [default to SeriesConfiguration]
**effectiveCapabilities** | **Map&lt;String, String&gt;** | Derived on the way out; ignored on the way in. | [optional] [default to Map<String, String>]
**presentation** | [**PresentationConfiguration**](PresentationConfiguration.md) |  | [optional] [default to PresentationConfiguration]

```java
import com.finbourne.sdk.services.lusid.model.PartnershipAccountingConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean enabled = true;
ResourceId configPack = new ResourceId();
@javax.annotation.Nullable String commitmentCurrencyPolicy = "example commitmentCurrencyPolicy";
ResourceId registerPortfolioGroup = new ResourceId();
@javax.annotation.Nullable String capitalModel = "example capitalModel";
@javax.annotation.Nullable List<CapabilityOverride> capabilityOverrides = new List<CapabilityOverride>();
SeriesConfiguration series = new SeriesConfiguration();
@javax.annotation.Nullable Map<String, String> effectiveCapabilities = new Map<String, String>();
PresentationConfiguration presentation = new PresentationConfiguration();


PartnershipAccountingConfiguration partnershipAccountingConfigurationInstance = new PartnershipAccountingConfiguration()
    .enabled(enabled)
    .configPack(configPack)
    .commitmentCurrencyPolicy(commitmentCurrencyPolicy)
    .registerPortfolioGroup(registerPortfolioGroup)
    .capitalModel(capitalModel)
    .capabilityOverrides(capabilityOverrides)
    .series(series)
    .effectiveCapabilities(effectiveCapabilities)
    .presentation(presentation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)