package com.hwj.service.impl;

import com.hwj.dao.DeptDao;
import com.hwj.entities.Dept;
import com.hwj.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kris
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept deptEntity) {
        return   deptDao.addDept(deptEntity);
    }

    @Override
    public Dept findById(Long deptNo) {
        return  deptDao.findById(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
