package com.semi.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.semi.command.Criteria;
import com.semi.datasource.OracleMybatisSqlSessionFactory;
import com.semi.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {
	//test용임. 삭제 필요.
	public static void main(String[] args) {
		MemberDAOImpl memberDao = new MemberDAOImpl();
		memberDao.setSqlSessionFactory(new OracleMybatisSqlSessionFactory());
		try {
			MemberVO mv = memberDao.selectMemberById("han");
			System.out.println(mv.getMemberId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	//메서드 이름 바꿔야함. selectMemberInfoById
	@Override
	public MemberVO selectMemberById(String id) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			MemberVO member = session.selectOne("Member-Mapper.selectMemberInfoById", id);
			
			
			return member;
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
	}

	
	
	//여기부터 구현해야함.
	@Override
	public List<MemberVO> selectMemberList(Criteria cri) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			int offset = cri.getStartRowNum();
			int limit = cri.getPerPageNum();
			RowBounds rowBounds = new RowBounds(offset, limit);

			List<MemberVO> memberList = session.selectList("Member-Mapper.selectMemberList", cri, rowBounds);

			return memberList;
		} catch (Exception e) { // 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}

	}

	@Override
	public int selectMemberListCount(Criteria cri) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {

			int count = session.selectOne("Member-Mapper.selectMemberListCount", cri);
			return count;
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			session.update("Member-Mapper.insertMember", member);
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}

	}

	@Override
	public void updateMember(MemberVO member) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			session.update("Member-Mapper.updateMember", member);
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}

	}

	@Override
	public void deleteMember(String id) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			session.update("Member-Mapper.deleteMember", id);
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public List<MemberVO> selectMathBodyList() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			
			List<MemberVO> bodyList = session.selectList("Member-Mapper.selectMathBodyList");
			return bodyList;
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		
	}

	@Override
	public List<MemberVO> selectMathCharacterList() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			
			List<MemberVO> charList = session.selectList("Member-Mapper.selectMathCharacterList");
			return charList;
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		
	}
		
	

	@Override
	public List<MemberVO> selectMathFaceList() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			List<MemberVO> faceList = session.selectList("Member-Mapper.selectMathFaceList");
			return faceList;
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		
	}

	@Override
	public List<MemberVO> selectMathHobbyList() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			List<MemberVO> hobbyList = session.selectList("Member-Mapper.selectMathHobbyList");
			return hobbyList;
		} catch (Exception e) {
			// 에러처리
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		
	}
	
	@Override
	public List<MemberVO> selectMemberAllList() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {			  
			List<MemberVO> memberList  = session.selectList("Member-Mapper.selectMemberAllList");	
			return memberList;
		}catch(Exception e) {
			//에러처리
			throw e;
		}finally {
			if(session != null)session.close();
		}
		
		
	}

}
