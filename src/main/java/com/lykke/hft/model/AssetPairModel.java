/*
 * HighFrequencyTrading API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.lykke.hft.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AssetPairModel
 *
 * @author niau
 * @version $Id: $Id
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-06T23:34:32.567+02:00")
public class AssetPairModel {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Accuracy")
  private Integer accuracy = null;

  @JsonProperty("InvertedAccuracy")
  private Integer invertedAccuracy = null;

  @JsonProperty("BaseAssetId")
  private String baseAssetId = null;

  @JsonProperty("QuotingAssetId")
  private String quotingAssetId = null;

  /**
   * <p>id.</p>
   *
   * @param id a {@link java.lang.String} object.
   * @return a {@link com.lykke.hft.model.AssetPairModel} object.
   */
  public AssetPairModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * <p>name.</p>
   *
   * @param name a {@link java.lang.String} object.
   * @return a {@link com.lykke.hft.model.AssetPairModel} object.
   */
  public AssetPairModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * <p>accuracy.</p>
   *
   * @param accuracy a {@link java.lang.Integer} object.
   * @return a {@link com.lykke.hft.model.AssetPairModel} object.
   */
  public AssetPairModel accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * Get accuracy
   *
   * @return accuracy
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getAccuracy() {
    return accuracy;
  }

  /**
   * <p>Setter for the field <code>accuracy</code>.</p>
   *
   * @param accuracy a {@link java.lang.Integer} object.
   */
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   * <p>invertedAccuracy.</p>
   *
   * @param invertedAccuracy a {@link java.lang.Integer} object.
   * @return a {@link com.lykke.hft.model.AssetPairModel} object.
   */
  public AssetPairModel invertedAccuracy(Integer invertedAccuracy) {
    this.invertedAccuracy = invertedAccuracy;
    return this;
  }

  /**
   * Get invertedAccuracy
   *
   * @return invertedAccuracy
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getInvertedAccuracy() {
    return invertedAccuracy;
  }

  /**
   * <p>Setter for the field <code>invertedAccuracy</code>.</p>
   *
   * @param invertedAccuracy a {@link java.lang.Integer} object.
   */
  public void setInvertedAccuracy(Integer invertedAccuracy) {
    this.invertedAccuracy = invertedAccuracy;
  }

  /**
   * <p>baseAssetId.</p>
   *
   * @param baseAssetId a {@link java.lang.String} object.
   * @return a {@link com.lykke.hft.model.AssetPairModel} object.
   */
  public AssetPairModel baseAssetId(String baseAssetId) {
    this.baseAssetId = baseAssetId;
    return this;
  }

  /**
   * Get baseAssetId
   *
   * @return baseAssetId
   */
  @ApiModelProperty(value = "")
  public String getBaseAssetId() {
    return baseAssetId;
  }

  /**
   * <p>Setter for the field <code>baseAssetId</code>.</p>
   *
   * @param baseAssetId a {@link java.lang.String} object.
   */
  public void setBaseAssetId(String baseAssetId) {
    this.baseAssetId = baseAssetId;
  }

  /**
   * <p>quotingAssetId.</p>
   *
   * @param quotingAssetId a {@link java.lang.String} object.
   * @return a {@link com.lykke.hft.model.AssetPairModel} object.
   */
  public AssetPairModel quotingAssetId(String quotingAssetId) {
    this.quotingAssetId = quotingAssetId;
    return this;
  }

  /**
   * Get quotingAssetId
   *
   * @return quotingAssetId
   */
  @ApiModelProperty(value = "")
  public String getQuotingAssetId() {
    return quotingAssetId;
  }

  /**
   * <p>Setter for the field <code>quotingAssetId</code>.</p>
   *
   * @param quotingAssetId a {@link java.lang.String} object.
   */
  public void setQuotingAssetId(String quotingAssetId) {
    this.quotingAssetId = quotingAssetId;
  }


  /** {@inheritDoc} */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetPairModel assetPairModel = (AssetPairModel) o;
    return Objects.equals(this.id, assetPairModel.id) &&
        Objects.equals(this.name, assetPairModel.name) &&
        Objects.equals(this.accuracy, assetPairModel.accuracy) &&
        Objects.equals(this.invertedAccuracy, assetPairModel.invertedAccuracy) &&
        Objects.equals(this.baseAssetId, assetPairModel.baseAssetId) &&
        Objects.equals(this.quotingAssetId, assetPairModel.quotingAssetId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(id, name, accuracy, invertedAccuracy, baseAssetId, quotingAssetId);
  }


  /** {@inheritDoc} */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetPairModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    invertedAccuracy: ").append(toIndentedString(invertedAccuracy)).append("\n");
    sb.append("    baseAssetId: ").append(toIndentedString(baseAssetId)).append("\n");
    sb.append("    quotingAssetId: ").append(toIndentedString(quotingAssetId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

