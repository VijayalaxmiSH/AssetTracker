package com.lk.assettracker.query;

import com.lk.assettracker.model.AssetMaster;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Or;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@Or({
        @Spec(path = "assetType",params = "assetType", spec = Equal.class),
        @Spec(path = "branch", params = "branch", spec = Equal.class),
        @Spec(path = "department", params = "department", spec = Equal.class),
        @Spec(path = "status", params = "status", spec = Equal.class)
})
public interface AssetSpec extends Specification<AssetMaster> {
}
