package org.study.sample.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.sample.mapper.MemberMapper;
import org.study.sample.model.MemberDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTest {
	
	@Autowired
	private MemberMapper mapper;
	
	//@Test
	public void memberInsertDummyTest() {
		for(int i = 7; i < 100 ; i++) {
			MemberDTO dto = new MemberDTO();
			dto.setM_id("testID" + i);
			dto.setM_pw("testPW" + i);
			dto.setM_address("우주" + i);
			log.info(dto);
			mapper.memberInsert(dto);
		}
	}
	
	//@Test
	public void memberInsertTest() {
		log.info("memberInsertTest() Start");
		MemberDTO dto = new MemberDTO();
		dto.setM_id("testID");
		dto.setM_pw("testPW");
		dto.setM_address("대구");
		log.info(dto);
		mapper.memberInsert(dto);
		log.info("memberInsertTest() END");
	}
	
	//@Test
	public void memberListTest() {
		log.info("memberListTest() Start");
		List<MemberDTO> list = mapper.memberList();
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
	}
	
	//@Test
	public void memberDeleteTest() {
		mapper.memberDelete("3");
		
	}
	
	//@Test
	public void memberReadTest() {
		MemberDTO dto = mapper.memberRead("1");
		log.info(dto);
	}
	
	@Test
	public void memberUpdateTest() {
		MemberDTO dto = new MemberDTO(); 
		
		dto.setM_address("서울");
		dto.setM_pw("tjdnf");
		dto.setM_no(10);
		
		mapper.memberUpdate(dto);
		MemberDTO tto = mapper.memberRead("10");
		log.info(tto.toString());
	}
	
	
}
