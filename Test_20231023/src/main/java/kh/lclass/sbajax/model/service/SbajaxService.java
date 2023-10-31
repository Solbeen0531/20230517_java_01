package kh.lclass.sbajax.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SbajaxService {

	@Autowired
	private SbajaxMapper mapper;

	// 아이디 중복체크 mapper 접근
	public int idCheck(String id) {
		int cnt = mapper.idCheck(id);
		System.out.println("cnt: " + cnt);
		return cnt;
	}
}
