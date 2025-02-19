/*
 * The Jina Embedding Serving API
 * This is the UniversalAPI to access all the Jina embedding models
 *
 * The version of the OpenAPI document: 0.0.86
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.BodyStartBulkEmbeddingV1BulkEmbeddingsPost;
import com.konfigthis.client.model.BulkEmbeddingJobResponse;
import com.konfigthis.client.model.DownloadResultResponse;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BulkEmbeddingsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BulkEmbeddingsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public BulkEmbeddingsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call downloadResultPostCall(String jobId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/bulk-embeddings/{job_id}/download-result"
            .replace("{" + "job_id" + "}", localVarApiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadResultPostValidateBeforeCall(String jobId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling downloadResultPost(Async)");
        }

        return downloadResultPostCall(jobId, _callback);

    }


    private ApiResponse<DownloadResultResponse> downloadResultPostWithHttpInfo(String jobId) throws ApiException {
        okhttp3.Call localVarCall = downloadResultPostValidateBeforeCall(jobId, null);
        Type localVarReturnType = new TypeToken<DownloadResultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call downloadResultPostAsync(String jobId, final ApiCallback<DownloadResultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadResultPostValidateBeforeCall(jobId, _callback);
        Type localVarReturnType = new TypeToken<DownloadResultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DownloadResultPostRequestBuilder {
        private final String jobId;

        private DownloadResultPostRequestBuilder(String jobId) {
            this.jobId = jobId;
        }

        /**
         * Build call for downloadResultPost
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Download the result of a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return downloadResultPostCall(jobId, _callback);
        }


        /**
         * Execute downloadResultPost request
         * @return DownloadResultResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Download the result of a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public DownloadResultResponse execute() throws ApiException {
            ApiResponse<DownloadResultResponse> localVarResp = downloadResultPostWithHttpInfo(jobId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute downloadResultPost request with HTTP info returned
         * @return ApiResponse&lt;DownloadResultResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Download the result of a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DownloadResultResponse> executeWithHttpInfo() throws ApiException {
            return downloadResultPostWithHttpInfo(jobId);
        }

        /**
         * Execute downloadResultPost request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Download the result of a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DownloadResultResponse> _callback) throws ApiException {
            return downloadResultPostAsync(jobId, _callback);
        }
    }

    /**
     * Download Result
     * 
     * @param jobId  (required)
     * @return DownloadResultPostRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Download the result of a bulk embedding job </td><td>  -  </td></tr>
     </table>
     */
    public DownloadResultPostRequestBuilder downloadResultPost(String jobId) throws IllegalArgumentException {
        if (jobId == null) throw new IllegalArgumentException("\"jobId\" is required but got null");
            

        return new DownloadResultPostRequestBuilder(jobId);
    }
    private okhttp3.Call getJobCall(String jobId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/bulk-embeddings/{job_id}"
            .replace("{" + "job_id" + "}", localVarApiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getJobValidateBeforeCall(String jobId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getJob(Async)");
        }

        return getJobCall(jobId, _callback);

    }


    private ApiResponse<BulkEmbeddingJobResponse> getJobWithHttpInfo(String jobId) throws ApiException {
        okhttp3.Call localVarCall = getJobValidateBeforeCall(jobId, null);
        Type localVarReturnType = new TypeToken<BulkEmbeddingJobResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getJobAsync(String jobId, final ApiCallback<BulkEmbeddingJobResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getJobValidateBeforeCall(jobId, _callback);
        Type localVarReturnType = new TypeToken<BulkEmbeddingJobResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetJobRequestBuilder {
        private final String jobId;

        private GetJobRequestBuilder(String jobId) {
            this.jobId = jobId;
        }

        /**
         * Build call for getJob
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get information about a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getJobCall(jobId, _callback);
        }


        /**
         * Execute getJob request
         * @return BulkEmbeddingJobResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get information about a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public BulkEmbeddingJobResponse execute() throws ApiException {
            ApiResponse<BulkEmbeddingJobResponse> localVarResp = getJobWithHttpInfo(jobId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getJob request with HTTP info returned
         * @return ApiResponse&lt;BulkEmbeddingJobResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get information about a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BulkEmbeddingJobResponse> executeWithHttpInfo() throws ApiException {
            return getJobWithHttpInfo(jobId);
        }

        /**
         * Execute getJob request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get information about a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BulkEmbeddingJobResponse> _callback) throws ApiException {
            return getJobAsync(jobId, _callback);
        }
    }

    /**
     * Retrieve Job
     * 
     * @param jobId  (required)
     * @return GetJobRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get information about a bulk embedding job </td><td>  -  </td></tr>
     </table>
     */
    public GetJobRequestBuilder getJob(String jobId) throws IllegalArgumentException {
        if (jobId == null) throw new IllegalArgumentException("\"jobId\" is required but got null");
            

        return new GetJobRequestBuilder(jobId);
    }
    private okhttp3.Call uploadFileAndGetEmbeddingsCall(File _file, String model, BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost, String email, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = bodyStartBulkEmbeddingV1BulkEmbeddingsPost;

        // create path and map variables
        String localVarPath = "/v1/bulk-embeddings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (email != null) {
            localVarFormParams.put("email", email);
        }

        if (model != null) {
            localVarFormParams.put("model", model);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "HTTPBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadFileAndGetEmbeddingsValidateBeforeCall(File _file, String model, BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost, String email, final ApiCallback _callback) throws ApiException {
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling uploadFileAndGetEmbeddings(Async)");
        }

        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling uploadFileAndGetEmbeddings(Async)");
        }

        // verify the required parameter 'bodyStartBulkEmbeddingV1BulkEmbeddingsPost' is set
        if (bodyStartBulkEmbeddingV1BulkEmbeddingsPost == null) {
            throw new ApiException("Missing the required parameter 'bodyStartBulkEmbeddingV1BulkEmbeddingsPost' when calling uploadFileAndGetEmbeddings(Async)");
        }

        return uploadFileAndGetEmbeddingsCall(_file, model, bodyStartBulkEmbeddingV1BulkEmbeddingsPost, email, _callback);

    }


    private ApiResponse<BulkEmbeddingJobResponse> uploadFileAndGetEmbeddingsWithHttpInfo(File _file, String model, BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost, String email) throws ApiException {
        okhttp3.Call localVarCall = uploadFileAndGetEmbeddingsValidateBeforeCall(_file, model, bodyStartBulkEmbeddingV1BulkEmbeddingsPost, email, null);
        Type localVarReturnType = new TypeToken<BulkEmbeddingJobResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call uploadFileAndGetEmbeddingsAsync(File _file, String model, BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost, String email, final ApiCallback<BulkEmbeddingJobResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadFileAndGetEmbeddingsValidateBeforeCall(_file, model, bodyStartBulkEmbeddingV1BulkEmbeddingsPost, email, _callback);
        Type localVarReturnType = new TypeToken<BulkEmbeddingJobResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UploadFileAndGetEmbeddingsRequestBuilder {
        private final File _file;
        private final String model;
        private String email;

        private UploadFileAndGetEmbeddingsRequestBuilder(File _file, String model) {
            this._file = _file;
            this.model = model;
        }

        /**
         * Set email
         * @param email  (optional)
         * @return UploadFileAndGetEmbeddingsRequestBuilder
         */
        public UploadFileAndGetEmbeddingsRequestBuilder email(String email) {
            this.email = email;
            return this;
        }
        
        /**
         * Build call for uploadFileAndGetEmbeddings
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Start a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost = buildBodyParams();
            return uploadFileAndGetEmbeddingsCall(_file, model, bodyStartBulkEmbeddingV1BulkEmbeddingsPost, email, _callback);
        }

        private BodyStartBulkEmbeddingV1BulkEmbeddingsPost buildBodyParams() {
            BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost = new BodyStartBulkEmbeddingV1BulkEmbeddingsPost();
            bodyStartBulkEmbeddingV1BulkEmbeddingsPost._file(this._file);
            bodyStartBulkEmbeddingV1BulkEmbeddingsPost.email(this.email);
            bodyStartBulkEmbeddingV1BulkEmbeddingsPost.model(this.model);
            return bodyStartBulkEmbeddingV1BulkEmbeddingsPost;
        }

        /**
         * Execute uploadFileAndGetEmbeddings request
         * @return BulkEmbeddingJobResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Start a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public BulkEmbeddingJobResponse execute() throws ApiException {
            BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost = buildBodyParams();
            ApiResponse<BulkEmbeddingJobResponse> localVarResp = uploadFileAndGetEmbeddingsWithHttpInfo(_file, model, bodyStartBulkEmbeddingV1BulkEmbeddingsPost, email);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute uploadFileAndGetEmbeddings request with HTTP info returned
         * @return ApiResponse&lt;BulkEmbeddingJobResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Start a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BulkEmbeddingJobResponse> executeWithHttpInfo() throws ApiException {
            BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost = buildBodyParams();
            return uploadFileAndGetEmbeddingsWithHttpInfo(_file, model, bodyStartBulkEmbeddingV1BulkEmbeddingsPost, email);
        }

        /**
         * Execute uploadFileAndGetEmbeddings request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Start a bulk embedding job </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BulkEmbeddingJobResponse> _callback) throws ApiException {
            BodyStartBulkEmbeddingV1BulkEmbeddingsPost bodyStartBulkEmbeddingV1BulkEmbeddingsPost = buildBodyParams();
            return uploadFileAndGetEmbeddingsAsync(_file, model, bodyStartBulkEmbeddingV1BulkEmbeddingsPost, email, _callback);
        }
    }

    /**
     * Start Bulk Embedding
     * Upload a file and get embeddings for each row
     * @param _file  (required)
     * @param model  (required)
     * @param bodyStartBulkEmbeddingV1BulkEmbeddingsPost  (required)
     * @return UploadFileAndGetEmbeddingsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Start a bulk embedding job </td><td>  -  </td></tr>
     </table>
     */
    public UploadFileAndGetEmbeddingsRequestBuilder uploadFileAndGetEmbeddings(File _file, String model) throws IllegalArgumentException {
        if (_file == null) throw new IllegalArgumentException("\"_file\" is required but got null");
        if (model == null) throw new IllegalArgumentException("\"model\" is required but got null");
            

        return new UploadFileAndGetEmbeddingsRequestBuilder(_file, model);
    }
}
