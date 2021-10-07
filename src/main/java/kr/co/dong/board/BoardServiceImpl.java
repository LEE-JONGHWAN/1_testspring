package kr.co.dong.board;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO boardDAO; 
	
	@Override
	public Map login(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return boardDAO.login(map);
	}

}
