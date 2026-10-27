package com.onepep.model.dao;

import com.onepep.db.DB;
import com.onepep.model.dao.impl.DepartmentDaoJDBC;
import com.onepep.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
