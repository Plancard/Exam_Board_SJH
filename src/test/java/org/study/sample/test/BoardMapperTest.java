package org.study.sample.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.sample.mapper.BoardMapper;
import org.study.sample.model.BoardDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper mapper;
	
		//@Test
		public void boardInsertTest() {
		log.info("boardInsertTest() Start");
		BoardDTO dto = new BoardDTO();
		dto.setB_title("testTitle");
		dto.setB_content("testContent");
		dto.setB_writer("abcd");
		log.info(dto);
		mapper.boardInsert(dto);
		log.info("memberInsertTest() END");
	}
		
		//@Test
		public void boardListTest() {
			List<BoardDTO> list = mapper.boardList();
			for(BoardDTO dto : list) {
				log.info(dto);
			}
		}
		
		//@Test
		public void boardReadTest() {
			BoardDTO dto = mapper.boardRead("2");
			log.info(dto.toString());
		}
	
		//@Test
		public void boardUpdateTest() {
			BoardDTO dto = new BoardDTO();
			dto.setB_no(5);
			dto.setB_title("beast");
			dto.setB_content("beast");
			
			mapper.boardUpdate(dto);
			BoardDTO dto1 = mapper.boardRead("5");
			System.out.println(dto1.toString());
		}
		
		//@Test
		public void boardDeleteTest() {
			mapper.boardDelete("2");
			
			List<BoardDTO> list = mapper.boardList();
			for(BoardDTO dto : list) {
				log.info(dto);
			}
		}
	
}
