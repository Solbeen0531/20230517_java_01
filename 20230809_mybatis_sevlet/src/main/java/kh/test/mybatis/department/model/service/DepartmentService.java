package kh.test.mybatis.department.model.service;

import java.util.List;

import kh.test.mybatis.department.model.dao.DepartmentDao;
import kh.test.mybatis.department.model.dto.DepartmentDto;

public class DepartmentService {
	private DepartmentDao dao = new DepartmentDao();

	public List<DepartmentDto> selectList() {
		System.out.println("selectList");
		List<DepartmentDto> result = null;
		return result;
	}

}
