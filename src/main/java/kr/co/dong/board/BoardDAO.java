/* CRUD 기능별
 * 메소드 원형 작업
 * 
 */
package kr.co.dong.board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {

	
	//로그인 처리를 위한 메소드
	public Map login(Map<String,Object> map);

}
