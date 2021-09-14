package upload;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("uploadservice")
public class UploadServiceImpl implements UploadService {

	@Autowired
	UploadDAO dao;
	
	@Override
	public void insertFiles(UploadVO vo) {
		dao.insertFiles(vo);
	}

	@Override
	public List<UploadVO> myfilelist(String name) {
		List<UploadVO> list = dao.selectFiles(name);
		return list;
	}
	
	
	
}
