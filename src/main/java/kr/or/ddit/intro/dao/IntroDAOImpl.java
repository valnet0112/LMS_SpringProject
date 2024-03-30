package kr.or.ddit.intro.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.common.paging.PaginationInfo;
import kr.or.ddit.db.CustomSqlSessionFactoryBuilder;

public class IntroDAOImpl implements IntroDAO {
	
	private SqlSessionFactory sqlSessionFactory = CustomSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Map<String, Object>> selectProfessorList(PaginationInfo paging) {
		try(
			SqlSession sqlSession = sqlSessionFactory.openSession();
		){
			IntroDAO proxyMapper = sqlSession.getMapper(IntroDAO.class);
			return proxyMapper.selectProfessorList(paging);
		}
	}

	@Override
	public List<Map<String, Object>> selectStudentList(PaginationInfo paging) {
		try(
				SqlSession sqlSession = sqlSessionFactory.openSession();
			){
				IntroDAO proxyMapper = sqlSession.getMapper(IntroDAO.class);
				return proxyMapper.selectStudentList(paging);
			}
	}

	@Override
	public int totalProfessor(PaginationInfo paging) {
		try(
				SqlSession sqlSession = sqlSessionFactory.openSession();
			){
				IntroDAO proxyMapper = sqlSession.getMapper(IntroDAO.class);
				return proxyMapper.totalProfessor(paging);
			}
	}

	@Override
	public int totalStudent(PaginationInfo paging) {
		try(
				SqlSession sqlSession = sqlSessionFactory.openSession();
			){
				IntroDAO proxyMapper = sqlSession.getMapper(IntroDAO.class);
				return proxyMapper.totalStudent(paging);
			}
	}
}
