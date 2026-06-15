# com.finbourne.sdk.services.lusid.model.VendorModelRule
classname VendorModelRule
A rule that identifies the set of preferences to be used for a given library, model and instrument type.  There can be many such rules, though only the first found for a given combination would be used.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supplier** | **String** | Available values: Lusid, RefinitivQps, RefinitivTracsWeb, VolMaster, IsdaCds, YieldBook, LusidCalc. | [default to String]
**modelName** | **String** | The vendor library model name | [default to String]
**instrumentType** | **String** | The vendor library instrument type | [default to String]
**parameters** | **String** | THIS FIELD IS DEPRECATED - use ModelOptions  The set of opaque model parameters, provided as a Json object, that is a string object which will internally be converted to a dictionary of string to object.  Note that this is not intended as the final form of this object. It will be replaced with a more structured object as the set of parameters that are possible is  better understood. | [optional] [default to String]
**modelOptions** | [**ModelOptions**](ModelOptions.md) |  | [optional] [default to ModelOptions]
**instrumentId** | **String** | This field should generally not be required. It indicates a specific case where there is a particular need to make a rule apply to only a single instrument  specified by an identifier on that instrument such as its LUID. One particular example would be to control the behaviour of a look-through portfolio scaling  methodology, such as where there is a mixture of indices and credit-debit portfolios where scaling on the sum of valuation would be deemed incorrectly for one  set but desired in general. | [optional] [default to String]
**addressKeyFilters** | [**List&lt;AddressKeyFilter&gt;**](AddressKeyFilter.md) | Condition for model selection. If a condition is satisfied the default model for valuation is overridden (for that instrument). | [optional] [default to List<AddressKeyFilter>]

```java
import com.finbourne.sdk.services.lusid.model.VendorModelRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String supplier = "example supplier";
String modelName = "example modelName";
String instrumentType = "example instrumentType";
@javax.annotation.Nullable String parameters = "example parameters";
ModelOptions modelOptions = new ModelOptions();
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable List<AddressKeyFilter> addressKeyFilters = new List<AddressKeyFilter>();


VendorModelRule vendorModelRuleInstance = new VendorModelRule()
    .supplier(supplier)
    .modelName(modelName)
    .instrumentType(instrumentType)
    .parameters(parameters)
    .modelOptions(modelOptions)
    .instrumentId(instrumentId)
    .addressKeyFilters(addressKeyFilters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)