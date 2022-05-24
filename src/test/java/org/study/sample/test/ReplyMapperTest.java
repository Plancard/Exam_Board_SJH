package org.study.sample.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.sample.mapper.ReplyMapper;
import org.study.sample.model.ReplyDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTest {
	
	//@Autowired
	//private ReplyMapper mapper;
	
	//@Test
//	public void replyListTest() {
//		log.info("replyListTest() Start");
//		List<ReplyDTO> dto = mapper.replyList("9");
//		for(int i = 0; i < dto.size(); i++) {
//			log.info(dto.get(i));
//		}
//	}
	
	//@Test
//	public void replyInsertTest() {
//		log.info("commentInsert Start");
//		ReplyDTO dto = new ReplyDTO();
//		mapper.replyInsert(dto);
//	}
}
