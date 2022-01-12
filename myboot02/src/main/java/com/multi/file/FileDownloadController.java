package com.multi.file;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileDownloadController {
	
	// 파일 다운로드 폼으로 이동 : upload 폴더 안의 모든 파일 목록 출력
	@RequestMapping("/fileDownloadList")
	public ModelAndView fileDownloadList() {
		 ModelAndView mv = new ModelAndView();
		
		File path = new File("D:/Full_Stackc_Study/spring_study/upload/");
		String[] fileList = path.list();
		
		mv.addObject("fileList", fileList);
		mv.setViewName("upload/fileDownloadListView");
		
		return mv;
	}
	
	
}
