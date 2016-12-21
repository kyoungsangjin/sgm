package com.spring.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("MainController")
public class MainController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	//메인페이지
	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	
	//로그인
	@RequestMapping(value = "/loginForm")
	public String loginForm() {
		
		return "login";
	}
	//id찾기
	@RequestMapping(value = "/idFind")
	public String idFind() {
		
		return "idFind";
	}
	//pw찾기
	@RequestMapping(value = "/pwFind")
	public String pwFind() {
		
		return "pwFind";
	}
	//회원가입
	@RequestMapping(value = "/join")
	public String join() {
		
		return "join";
	}
	//마이페이지
	@RequestMapping(value = "/myPage")
	public String myPage() {
		
		return "myPage";
	}
	//회원정보수정
	@RequestMapping(value = "/userModify")
	public String userModify() {
		
		return "userModify";
	}
	//쪽지리스트
	@RequestMapping(value = "/msgPage")
	public String msgPage() {
		
		return "msgPage";
	}
	
	//회원관리
	@RequestMapping(value = "/usManager")
	public String usManager() {
		logger.info("회원관리");
		return "usManager";
	}
	//팀관리
	@RequestMapping(value = "/teamManager")
	public String teamManager() {
		logger.info("팀관리");
		return "teamManager";
	}
	
	//결과
	@RequestMapping(value = "/result")
	public String result() {
		logger.info("광고수정");
		return "adModify";
	}
	

	//비디오
	@RequestMapping(value = "/vidioList")
	public String vidioList() {
		
		return "vidioList";
	}
	//매칭 상세보
	@RequestMapping(value = "/matchDetail")
	public String matchDetail() {
		logger.info("매칭 상세보기");
		return "matchDetail";
	}
	
	//팀 상세보기
	@RequestMapping(value = "/teamDetail")
	public String teamDetail() {
		logger.info("팀 상세보기");
		return "teamDetail";
	}
	
	//팀 일지 상세보기
	@RequestMapping(value = "/tdDetail")
	public String tdDetail() {
		logger.info("팀 일지 상세보기");
		return "tdDetail";
	}
	
	//팀 정보 수정
		@RequestMapping(value = "/teamModify")
		public String teamModify() {
			logger.info("팀 정보 수정");
			return "teamModify";
		}
	
	
	//장소목록 상세보기
	@RequestMapping(value = "/placeDetail")
	public String placeDetail() {
		logger.info("장소목록 상세보기");
		return "placeDetail";
	}
	
	//영상 상세보기
	@RequestMapping(value = "/vidioDetail")
	public String vidioDetail() {
		logger.info("영상 상세보기");
		return "vidioDetail";
	}
	
	//자유 상세보기
	@RequestMapping(value = "/freeDetail")
	public String freeDetail() {
		logger.info("영상 상세보기");
		return "freeDetail";
	}
	
}
