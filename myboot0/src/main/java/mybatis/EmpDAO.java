package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EmpDAO {
	
	public List<EmpVO> emplist();
	public EmpVO empone(int id);
	public void insertemp(EmpVO vo);
	public void updateemp(EmpVO vo);
	public void deleteemp(String name);
	public int cnt();
	public List<EmpVO> empdeptlist(int [] dept_list);
	
	/*
	 *  { EmpVO vo = session.selectOne("emp.empone",id); //
	 * System.out.println(vo.getEmployee_id() + " : " + vo.getFirst_name() +
	 * " : " + vo.getHire_date() + " : " + vo.getSalary()); return vo; }
	 * 
	 * public void insertEmp(EmpVO vo) { session.insert("emp.insertemp", vo); }
	 * 
	 * public void updateEmp(EmpVO vo) { session.update("emp.updateemp", vo); }
	 * 
	 * public void deleteEmp(String name) { session.delete("emp.deleteemp", name); }
	 * 
	 * public int countEmp() { int cnt = session.selectOne("emp.cnt"); return cnt; }
	 * 
	 * public List<EmpVO> empDeptList(int [] dept_list) { List<EmpVO> list =
	 * session.selectList("emp.empdeptlist", dept_list); return list; }
	 */
}



