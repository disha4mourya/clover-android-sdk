/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v1.inventory;

@SuppressWarnings("all")
public class Discount implements android.os.Parcelable, com.clover.sdk.v1.Validator {

  protected String jsonString = null;
  protected org.json.JSONObject jsonObject = null;

  public Discount(String json, boolean ignore) {
    this.jsonString = json;
  }

  public Discount(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  public Discount(java.lang.String name, java.lang.Long amount, java.lang.Long percentage) throws org.json.JSONException {
    if (name == null) {
      throw new IllegalArgumentException("'name' is required to be non-null");
    }
    setName(name);
    setAmount(amount);
    setPercentage(percentage);
  }

  public Discount(java.lang.String id, java.lang.String name, java.lang.Long amount, java.lang.Long percentage) throws org.json.JSONException {
    if (name == null) {
      throw new IllegalArgumentException("'name' is required to be non-null");
    }
    setId(id);
    setName(name);
    setAmount(amount);
    setPercentage(percentage);
  }

  protected org.json.JSONObject getJSONObject() {
    try {
      if (jsonObject == null) {
        if (jsonString != null) {
          jsonObject = (org.json.JSONObject) new org.json.JSONTokener(jsonString).nextValue();
          jsonString = null; // null this so it will be recreated if jsonObject is modified
        } else {
          jsonObject = new org.json.JSONObject();
        }
      }
    } catch (org.json.JSONException e) {
      // print some kind of error
    }
    return jsonObject;
  }

  public void validate() throws org.json.JSONException {
    if (getName() == null) {
      throw new IllegalArgumentException("'name' is required to be non-null");
    }
    java.lang.String id = getId();
    if (id != null && id.length() > 13) {
      throw new IllegalArgumentException("Maximum string length exceeded for 'id'");
    }
    java.lang.String name = getName();
    if (name != null && name.length() > 127) {
      throw new IllegalArgumentException("Maximum string length exceeded for 'name'");
    }
    java.lang.Long amount = getAmount();
    if (amount != null && amount > 0) {
      throw new IllegalArgumentException("Invalid value for 'amount'");
    }
    java.lang.Long percentage = getPercentage();
    if (percentage != null && percentage < 0) {
      throw new IllegalArgumentException("Invalid value for 'percentage'");
    }
    // TODO: also validate string length, valid ranges and other integrity checks
  }

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return getJSONObject().optString("id");
  }

  /**
   * Name of the discount
   */
  public java.lang.String getName() {
    if (getJSONObject().has("name")) {
      return getJSONObject().optString("name");
    } else {
      return null;
    }
  }

  /**
   * Discount amount in 1/100 of currency unit (e.g. cents)
   */
  public java.lang.Long getAmount() {
    if (hasAmount()) {
      return getJSONObject().optLong("amount");
    } else {
      return null;
    }
  }

  /**
   * Discount amount in percent
   */
  public java.lang.Long getPercentage() {
    if (hasPercentage()) {
      return getJSONObject().optLong("percentage");
    } else {
      return null;
    }
  }


  /**
   * Checks whether the 'id' field has been set
   */
  public boolean hasId() {
    return getJSONObject().has("id");
  }

  /**
   * Checks whether the 'name' field has been set
   */
  public boolean hasName() {
    return getJSONObject().has("name");
  }

  /**
   * Checks whether the 'amount' field has been set
   */
  public boolean hasAmount() {
    return getJSONObject().has("amount");
  }

  /**
   * Checks whether the 'percentage' field has been set
   */
  public boolean hasPercentage() {
    return getJSONObject().has("percentage");
  }

  public void setId(java.lang.String id) throws org.json.JSONException {
    if (id != null && id.length() > 13) {
      throw new IllegalArgumentException("Maximum string length exceeded for 'id'");
    }
    getJSONObject().put("id", id);
  }

  public void setName(java.lang.String name) throws org.json.JSONException {
    if (name != null && name.length() > 127) {
      throw new IllegalArgumentException("Maximum string length exceeded for 'name'");
    }
    getJSONObject().put("name", name);
  }

  public void setAmount(java.lang.Long amount) throws org.json.JSONException {
    if (amount != null && amount > 0) {
      throw new IllegalArgumentException("Invalid value for 'amount'");
    }
    getJSONObject().put("amount", amount);
  }

  public void setPercentage(java.lang.Long percentage) throws org.json.JSONException {
    if (percentage != null && percentage < 0) {
      throw new IllegalArgumentException("Invalid value for 'percentage'");
    }
    getJSONObject().put("percentage", percentage);
  }


  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    String json = jsonString != null ? jsonString : getJSONObject().toString();
    dest.writeString(json);
  }

  public static final android.os.Parcelable.Creator<Discount> CREATOR = new android.os.Parcelable.Creator<Discount>() {
    public Discount createFromParcel(android.os.Parcel in) {
      String json = in.readString();
      return new Discount(json, true);
    }

    public Discount[] newArray(int size) {
      return new Discount[size];
    }
  };

  public static class Builder {

    private java.lang.String name;
    private java.lang.Long amount;
    private java.lang.Long percentage;

    public Builder() {
    }

    public Builder name(java.lang.String name) {
      if (name != null && name.length() > 127) {
        throw new IllegalArgumentException("Maximum string length exceeded for 'name'");
      }
      this.name = name;
      return this;
    }

    public Builder amount(java.lang.Long amount) {
      if (amount != null && amount > 0) {
        throw new IllegalArgumentException("Invalid value for 'amount'");
      }
      this.amount = amount;
      return this;
    }

    public Builder percentage(java.lang.Long percentage) {
      if (percentage != null && percentage < 0) {
        throw new IllegalArgumentException("Invalid value for 'percentage'");
      }
      this.percentage = percentage;
      return this;
    }

    public Discount build() throws org.json.JSONException {
      return new Discount(name, amount, percentage);
    }
  }

}
