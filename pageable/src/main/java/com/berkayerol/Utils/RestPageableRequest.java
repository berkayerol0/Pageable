package com.berkayerol.Utils;

import lombok.Data;

@Data
public class RestPageableRequest {

    private int pageNumber;

    private int pageSize;

    private String columnName;

    private boolean asc;
}
