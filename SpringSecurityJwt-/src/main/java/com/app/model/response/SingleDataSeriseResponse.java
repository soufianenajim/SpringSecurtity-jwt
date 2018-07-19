//This is a common http response model for providing data series

package com.app.model.response;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.app.model.data.SingleSerise;

@Data
@EqualsAndHashCode(callSuper=false)
public class SingleDataSeriseResponse extends OperationResponse {
    private List<SingleSerise> items;
}
