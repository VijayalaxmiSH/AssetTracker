package com.lk.assettracker.query;

import com.lk.assettracker.model.EmployeeMaster;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Or;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@Or({
        @Spec(path = "employeeId", params = "employeeId", spec = Equal.class),
        @Spec(path = "contactNumber", params = "contactNumber", spec = Equal.class),
        @Spec(path = "emailId", params = "emailId", spec = Equal.class)
})
public interface EmployeeSpec extends Specification<EmployeeMaster> {

}
