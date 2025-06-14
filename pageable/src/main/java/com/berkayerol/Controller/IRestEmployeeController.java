package com.berkayerol.Controller;

import com.berkayerol.Dto.DtoEmployee;
import com.berkayerol.Utils.RestPageableEntity;
import com.berkayerol.Utils.RestPageableRequest;
import com.berkayerol.Utils.RestRootEntity;

public interface IRestEmployeeController {

    public RestRootEntity<RestPageableEntity<DtoEmployee>> findAllPageable(RestPageableRequest pageableRequest);
}
