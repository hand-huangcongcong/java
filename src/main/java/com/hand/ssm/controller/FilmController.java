package com.hand.ssm.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hand.ssm.dto.Film;
import com.hand.ssm.service.FilmService;

@Controller
public class FilmController {
     @Autowired
	private FilmService filmService;
     
     
    
    @RequestMapping("/kaishi")
    public String index(Map<String, Object> map){   	
        return"login";
    }
    
   
    @RequestMapping("/select")
    public String select(Map<String, Object> map){
    	Film film=new Film();  	
        int page=1;
    	film.setCursor((page-1)*10);
    	map.put("list", filmService.select(film));
        return"show";
   
    }
    

    @RequestMapping("/tianjia")
    public String tianjia(){
        return"tianjia";
    }
    
    @RequestMapping("/tianjia1")
    public String tianjia1(HttpServletRequest request,HttpServletResponse response){
    	String title=request.getParameter("title");
    	String description=request.getParameter("description");
    	String language_id1=request.getParameter("language_id");

    	double b = Math.random() * 10000;
    	int id=(int) b;
    	int language_id=Integer.parseInt(language_id1);
    	Film f=new Film();
    	/*f.setFilmId(id);*/
    	f.setTitle(title);
    	f.setDescription(description);
    	f.setLanguageId(language_id);

    	filmService.insert(f);
  
        return "login";

    }
    
    
}