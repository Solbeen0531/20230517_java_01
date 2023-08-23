package kh.lclass.db1.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lclass.db1.member.model.vo.MemberVo;

@Repository("memberDao")
public class MemberDao {
	
	// Autowired 사용시 Spring에서 이미 만들어진 빈 객체를 가져다 씀
	// 따라서 == null 또는 == new 객체() 생성을 하지 않아야 함
	@Autowired
	private SqlSession sqlSession;

//	public List<MemberVo> selectList(SqlSession session){
//		return session.selectList("member.selectList");
//	}
	public List<MemberVo> selectList() {
		return sqlSession.selectList("member.selectList");
	}
	
	public MemberVo selectOne(String pk) {
		return sqlSession.selectOne("member.selectOne",pk);
	}

	public int insert(MemberVo vo) {
		return sqlSession.insert("member.insert",vo);
	}
	
	public int update(MemberVo vo) {
		return sqlSession.update("member.update",vo);
	}
	
	public int delete(MemberVo pk) {
		return sqlSession.delete("member.delete",pk);
	}
	
	
}
