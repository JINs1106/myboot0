package mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class EmpMybatisController {
	// select * from employees ---> List<EmpVO> 리턴
	
	@Autowired
	EmpService service;
	
	@RequestMapping("/emplist")
	public ModelAndView empList() {
		List<EmpVO> list = service.getEmpList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("emplist", list);
		mv.setViewName("/mybatis/emplist");
		return mv;
	}
	/*
	 * // 1. "/empdeptlist" : get checkbox 형태 10 20 ... 100 나열 복수개 폼 뷰 생성
	 * mybatis/empdeptform.jsp
	 * 
	 * @RequestMapping(value="/empdeptlist", method=RequestMethod.GET) public String
	 * empDeptForm() { return "/mybatis/empdeptform"; }
	 * 
	 * 
	 * // 2. "/empdeptlist" : post 1번 선택 요소 배열로 전달 받아 부서원 이름 코드 급여ㅅ정보 입력 /
	 * empdeptlist.jsp
	 * 
	 * @RequestMapping(value="/empdeptlist", method=RequestMethod.POST) public
	 * ModelAndView empDeptList(int[] dept_list) { List<EmpVO> deptlist =
	 * service.empDeptList(dept_list); ModelAndView mv = new ModelAndView();
	 * mv.addObject("empdeptlist", deptlist);
	 * mv.setViewName("/mybatis/empdeptlist"); return mv; }
	 */
}
