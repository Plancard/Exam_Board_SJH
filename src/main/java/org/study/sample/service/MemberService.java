package org.study.sample.service;

import java.util.List;

import org.study.sample.model.MemberDTO;

public interface MemberService {

	void memberInsert(MemberDTO dto);
	List<MemberDTO> memberList();
	MemberDTO memberRead(String m_no);
	void memberUpdate(MemberDTO dto);
	void memberDelete(String m_no);
	String login(MemberDTO dto);

}
