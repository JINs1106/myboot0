package edu.spring.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMVCConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 현재 부트프로젝트 src/main/resources/static 폴더 이미지들 외부에 있는 것 추가
		registry.addResourceHandler("/upload/**").addResourceLocations("file:///c:/kdigital2/upload/");
	}
	
}
