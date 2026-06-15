package com.finbourne.sdk.extensions;

import com.finbourne.sdk.ApiClient;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
* Utility class that builds pre-configured fINBOURNE API instances to access fINBOURNE.
*
*/
public class ApiFactory {


    /**
    * The unique package that hosts all the fINBOURNE API classes
    */
    public static final String API_PACKAGE = "com.finbourne.sdk.services";

    private final ApiClient apiClient;
    private final Map<Class<?>, Object> initialisedApis;

    /**
    * Create a API factory based on an {@link ApiClient}
    *
    * @param apiClient configured to a specific application
    */
    public ApiFactory(ApiClient apiClient) {
        this.apiClient = apiClient;
        initialisedApis = new HashMap<>();
    }

    /**
    * Get the {@link ApiClient} associated with this factory.
    *
    * @return the {@link ApiClient} instance
    */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
    * Builds an instance of a fINBOURNE API 
    *
    * For each instance of an {@link ApiFactory} only a singleton instance of each fINBOURNE API class exist. The APIs
    * are lazily initialised on request.
    *
    *
    * @param apiClass - class of the fINBOURNE API to create
    * @param <T> fINBOURNE API type
    * @return instance of the fINBOURNE API type configured as per the {@link ApiClient}
    *
    * @throws UnsupportedOperationException is the apiClass does not belong to the import com.finbourne.sdk.api package or
    * if the class has no constructor that accepts an {@link ApiClient} parameter.
    */
    public synchronized <T> T build(Class<T> apiClass) {
        checkIsSupportedApiClass(apiClass);

        @SuppressWarnings (value="unchecked")
        T apiInstance = (T) initialisedApis.get(apiClass);
        if (apiInstance == null) {
            Constructor<T> constructor = getApiConstructor(apiClass);
            apiInstance = createInstance(constructor);
            initialisedApis.put(apiClass, apiInstance);
        }
        return apiInstance;
    }

    private <T> T createInstance(Constructor<T> constructor){
        try {
            return constructor.newInstance(apiClient);
        } catch (ReflectiveOperationException e) {
            throw new UnsupportedOperationException("Construction of " + constructor.getDeclaringClass().getName() + " failed " +
                    "due to an invalid instantiation call.", e);
        }
    }

    private <T> Constructor<T> getApiConstructor(Class<T> apiClass){
        try {
            return apiClass.getDeclaredConstructor(ApiClient.class);
        } catch (NoSuchMethodException e) {
            throw new UnsupportedOperationException(apiClass.getName() + " has no single argument constructor taking " +
                    ApiClient.class.getName());
        }
    }

    /**
    * Checks the class lives in a sub-package of the services package.
    * API classes live in packages like com.finbourne.sdk.services.lusid.api,
    * com.finbourne.sdk.services.drive.api, etc.
    *
    * @throws UnsupportedOperationException if API class does not live in a supported package
    */
    private void checkIsSupportedApiClass(Class<?> apiClass){
        if (!isInApiPackage(apiClass)) {
            throw new UnsupportedOperationException(apiClass.getName() + " class is not a supported API class. " +
                    "Supported API classes live under the " + ApiFactory.API_PACKAGE + " package.");
        }
    }

    private boolean isInApiPackage(Class<?> clazz){
        var packageName = clazz.getPackage().getName();
        return packageName.startsWith(API_PACKAGE + ".");
    }


}
