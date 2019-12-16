package com.hwj.service;

import com.hwj.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author GongXings
 * @createTime 31 11:54
 * @description
 */
@FeignClient(value = "CLOUD-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/add",method = RequestMethod.GET)
    public boolean add( Dept deptEntity);

    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    public Dept findById(@PathVariable Long deptNo);

    @RequestMapping(value = "/dept/findAll",method = RequestMethod.GET)
    public List findAll();
}