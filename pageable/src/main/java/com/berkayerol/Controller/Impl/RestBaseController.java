package com.berkayerol.Controller.Impl;

import com.berkayerol.Utils.PagerUtil;
import com.berkayerol.Utils.RestPageableEntity;
import com.berkayerol.Utils.RestPageableRequest;
import com.berkayerol.Utils.RestRootEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public class RestBaseController {

    public Pageable toPageable(RestPageableRequest request) {
        return PagerUtil.toPageable(request);
    }

    public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {
        return PagerUtil.toPageableResponse(page, content);

    }

    public <T> RestRootEntity<T> ok(T payload) {
        return RestRootEntity.ok(payload);
    }
}
