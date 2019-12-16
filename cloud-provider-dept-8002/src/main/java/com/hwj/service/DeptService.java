package com.hwj.service;

import com.hwj.entities.Dept;

import java.util.List;

/**
 * @author kris
 *
 */
public interface DeptService {

        /**
         * 插入
         * @param dept
         * @return
         */
        boolean addDept(Dept dept);

        /**
         * 根据id查找
         * @param deptNo
         * @return
         */
        Dept findById(Long deptNo);

        /**
         * 查询全部
         * @return
         */
        List<Dept> findAll();

}
