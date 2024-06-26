/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.configs.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class DCRConfig  {
  
    private Boolean authenticationRequired;
    private String ssaJwks;
    private Boolean enableFapiEnforcement;
    private Boolean mandateSSA;

    /**
    * If false, the authentication is not required for the DCR create request, otherwise, the configured authentication mechanism will be used.
    **/
    public DCRConfig authenticationRequired(Boolean authenticationRequired) {

        this.authenticationRequired = authenticationRequired;
        return this;
    }
    
    @ApiModelProperty(example = "false", value = "If false, the authentication is not required for the DCR create request, otherwise, the configured authentication mechanism will be used.")
    @JsonProperty("authenticationRequired")
    @Valid
    public Boolean getAuthenticationRequired() {
        return authenticationRequired;
    }
    public void setAuthenticationRequired(Boolean authenticationRequired) {
        this.authenticationRequired = authenticationRequired;
    }

    /**
    * The JWKS endpoint to validate the SSA.
    **/
    public DCRConfig ssaJwks(String ssaJwks) {

        this.ssaJwks = ssaJwks;
        return this;
    }
    
    @ApiModelProperty(example = "https://example.com/samplejwks.jwks", value = "The JWKS endpoint to validate the SSA.")
    @JsonProperty("ssaJwks")
    @Valid
    public String getSsaJwks() {
        return ssaJwks;
    }
    public void setSsaJwks(String ssaJwks) {
        this.ssaJwks = ssaJwks;
    }

    /**
    * If true, a FAPI compliant app will be create with DCR create request.
    **/
    public DCRConfig enableFapiEnforcement(Boolean enableFapiEnforcement) {

        this.enableFapiEnforcement = enableFapiEnforcement;
        return this;
    }
    
    @ApiModelProperty(example = "true", value = "If true, a FAPI compliant app will be create with DCR create request.")
    @JsonProperty("enableFapiEnforcement")
    @Valid
    public Boolean getEnableFapiEnforcement() {
        return enableFapiEnforcement;
    }
    public void setEnableFapiEnforcement(Boolean enableFapiEnforcement) {
        this.enableFapiEnforcement = enableFapiEnforcement;
    }

    /**
    * If true, the software_statement parameter is mandatory for the DCR create request.
    **/
    public DCRConfig mandateSSA(Boolean mandateSSA) {

        this.mandateSSA = mandateSSA;
        return this;
    }
    
    @ApiModelProperty(example = "true", value = "If true, the software_statement parameter is mandatory for the DCR create request.")
    @JsonProperty("mandateSSA")
    @Valid
    public Boolean getMandateSSA() {
        return mandateSSA;
    }
    public void setMandateSSA(Boolean mandateSSA) {
        this.mandateSSA = mandateSSA;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DCRConfig dcRConfig = (DCRConfig) o;
        return Objects.equals(this.authenticationRequired, dcRConfig.authenticationRequired) &&
            Objects.equals(this.ssaJwks, dcRConfig.ssaJwks) &&
            Objects.equals(this.enableFapiEnforcement, dcRConfig.enableFapiEnforcement) &&
            Objects.equals(this.mandateSSA, dcRConfig.mandateSSA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationRequired, ssaJwks, enableFapiEnforcement, mandateSSA);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class DCRConfig {\n");
        
        sb.append("    authenticationRequired: ").append(toIndentedString(authenticationRequired)).append("\n");
        sb.append("    ssaJwks: ").append(toIndentedString(ssaJwks)).append("\n");
        sb.append("    enableFapiEnforcement: ").append(toIndentedString(enableFapiEnforcement)).append("\n");
        sb.append("    mandateSSA: ").append(toIndentedString(mandateSSA)).append("\n");
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
        return o.toString().replace("\n", "\n");
    }
}

