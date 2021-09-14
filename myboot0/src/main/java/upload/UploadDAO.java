package upload;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository // dao를 객체로 만들어주세요
public interface UploadDAO {
	public void insertFiles(UploadVO vo);
	public List<UploadVO> selectFiles(String name);
}
