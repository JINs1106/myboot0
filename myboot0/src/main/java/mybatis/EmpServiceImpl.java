package mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// main / mvc ==> service 1개 가능 메소드 == dao(1개 sql 메소드)
@Service("service")
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO dao;
	
	@Override
	public List<EmpVO> getEmpList() {
		// dao 1개 메소드  / select count(*) from employees aql 몇명의 사원?
		return dao.emplist();
	}
	
	@Override
	public EmpVO getEmpOne(int id) { 
		return dao.empone(id); 
	}
	
	@Override
	public void insertEmp(EmpVO vo) { 
		EmpVO RESULT =dao.empone(vo.getEmployee_id());
		if(RESULT == null) { 
		dao.insertemp(vo); 
		}
	 }
	
	@Override
	public void updateEmp(EmpVO vo) {
		dao.updateemp(vo);
	}
	
	@Override
	public void deleteEmp(String name) { 
		name = "%" + name + "%";
		dao.deleteemp(name);
	}
	
	@Override
	public int countEmp() {
		return dao.cnt();
	}
	
	 @Override
	 public List<EmpVO> empDeptList(int[] a) {
		 return dao.empdeptlist(a);
	 }
	
	/*
	 * @Override public EmpVO getEmpOne(int id) { return dao.getEmpOne(id); }
	 * 
	 * @Override public void insertEmp(EmpVO vo) { 
	 * EmpVO RESULT =dao.getEmpOne(vo.getEmployee_id());
	 * 	 if(RESULT == null) { 
	 * dao.insertEmp(vo); 
	 * }
	 * }
	 * 
	 * @Override public void updateEmp(EmpVO vo) { dao.updateEmp(vo); }
	 * 
	 * @Override public void deleteEmp(String name) { name = "%" + name + "%";
	 * dao.deleteEmp(name); }
	 * 
	 * @Override public int countEmp() { return dao.countEmp(); }
	 * 
	 * @Override public List<EmpVO> empDeptList(int[] a) { return
	 * dao.empDeptList(a); }
	 */
	
	

}
