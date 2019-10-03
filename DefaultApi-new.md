# swagger_client.DefaultApi

All URIs are relative to *https://api.nexmo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**redact_message**](DefaultApi.md#redact_message) | **POST** /v1/redact/transaction | Redact a specific message

# **redact_message**
> redact_message(body, api_key, api_secret=api_secret)

Redact a specific message

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
body = swagger_client.RedactTransaction() # RedactTransaction | 
api_key = 'api_key_example' # str | Your API key
api_secret = 'api_secret_example' # str | Your API secret. Required unless `sig` is provided (optional)

try:
    # Redact a specific message
    api_instance.redact_message(body, api_key, api_secret=api_secret)
except ApiException as e:
    print("Exception when calling DefaultApi->redact_message: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RedactTransaction**](RedactTransaction.md)|  | 
 **api_key** | **str**| Your API key | Example: abcd1234
 **api_secret** | **str**| Your API secret. Required unless &#x60;sig&#x60; is provided | [optional] Example: abcdef0123456789

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

