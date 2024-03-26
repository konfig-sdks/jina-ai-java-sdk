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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ApiSchemasEmbeddingUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Output of the embedding service
 */
@ApiModel(description = "Output of the embedding service")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ColbertModelEmbeddingsOutput {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "list";

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Object> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private ApiSchemasEmbeddingUsage usage;

  public ColbertModelEmbeddingsOutput() {
  }

  public ColbertModelEmbeddingsOutput model(String model) {
    
    
    
    
    this.model = model;
    return this;
  }

   /**
   * The identifier of the model.  Available models and corresponding param size and dimension: - &#x60;jina-embedding-t-en-v1&#x60;, 14m, 312 - &#x60;jina-embedding-s-en-v1&#x60;, 35m, 512 (default) - &#x60;jina-embedding-b-en-v1&#x60;, 110m, 768 - &#x60;jina-embedding-l-en-v1&#x60;, 330, 1024  For more information, please checkout our [technical blog](https://arxiv.org/abs/2307.11224). 
   * @return model
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier of the model.  Available models and corresponding param size and dimension: - `jina-embedding-t-en-v1`, 14m, 312 - `jina-embedding-s-en-v1`, 35m, 512 (default) - `jina-embedding-b-en-v1`, 110m, 768 - `jina-embedding-l-en-v1`, 330, 1024  For more information, please checkout our [technical blog](https://arxiv.org/abs/2307.11224). ")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    
    
    
    this.model = model;
  }


  public ColbertModelEmbeddingsOutput _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "list", value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    
    this._object = _object;
  }


  public ColbertModelEmbeddingsOutput data(List<Object> data) {
    
    
    
    
    this.data = data;
    return this;
  }

  public ColbertModelEmbeddingsOutput addDataItem(Object dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * A list of Embedding Objects returned by the embedding service
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of Embedding Objects returned by the embedding service")

  public List<Object> getData() {
    return data;
  }


  public void setData(List<Object> data) {
    
    
    
    this.data = data;
  }


  public ColbertModelEmbeddingsOutput usage(ApiSchemasEmbeddingUsage usage) {
    
    
    
    
    this.usage = usage;
    return this;
  }

   /**
   * Total usage of the request. Sums up the usage from each individual input
   * @return usage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total usage of the request. Sums up the usage from each individual input")

  public ApiSchemasEmbeddingUsage getUsage() {
    return usage;
  }


  public void setUsage(ApiSchemasEmbeddingUsage usage) {
    
    
    
    this.usage = usage;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ColbertModelEmbeddingsOutput instance itself
   */
  public ColbertModelEmbeddingsOutput putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColbertModelEmbeddingsOutput colbertModelEmbeddingsOutput = (ColbertModelEmbeddingsOutput) o;
    return Objects.equals(this.model, colbertModelEmbeddingsOutput.model) &&
        Objects.equals(this._object, colbertModelEmbeddingsOutput._object) &&
        Objects.equals(this.data, colbertModelEmbeddingsOutput.data) &&
        Objects.equals(this.usage, colbertModelEmbeddingsOutput.usage)&&
        Objects.equals(this.additionalProperties, colbertModelEmbeddingsOutput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, _object, data, usage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColbertModelEmbeddingsOutput {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("model");
    openapiFields.add("object");
    openapiFields.add("data");
    openapiFields.add("usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("usage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ColbertModelEmbeddingsOutput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ColbertModelEmbeddingsOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ColbertModelEmbeddingsOutput is not found in the empty JSON string", ColbertModelEmbeddingsOutput.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ColbertModelEmbeddingsOutput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("data") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      // validate the required field `usage`
      ApiSchemasEmbeddingUsage.validateJsonObject(jsonObj.getAsJsonObject("usage"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ColbertModelEmbeddingsOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ColbertModelEmbeddingsOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ColbertModelEmbeddingsOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ColbertModelEmbeddingsOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ColbertModelEmbeddingsOutput>() {
           @Override
           public void write(JsonWriter out, ColbertModelEmbeddingsOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ColbertModelEmbeddingsOutput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ColbertModelEmbeddingsOutput instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ColbertModelEmbeddingsOutput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ColbertModelEmbeddingsOutput
  * @throws IOException if the JSON string is invalid with respect to ColbertModelEmbeddingsOutput
  */
  public static ColbertModelEmbeddingsOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ColbertModelEmbeddingsOutput.class);
  }

 /**
  * Convert an instance of ColbertModelEmbeddingsOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

