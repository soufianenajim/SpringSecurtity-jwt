package com.app.model.session;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import com.app.model.response.OperationResponse;

@Data
@EqualsAndHashCode(callSuper=false)
public class SessionResponse extends OperationResponse {
  @ApiModelProperty(required = true, value = "")
  private SessionItem item;
}
