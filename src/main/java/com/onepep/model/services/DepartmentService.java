package com.onepep.model.services;

import java.util.List;

import com.onepep.model.dao.DaoFactory;
import com.onepep.model.dao.DepartmentDao;
import com.onepep.model.entities.Department;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }
}
