package Spring1.Controller;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import Spring1.Dao.AdminDao;
import Spring1.Entity.blog;

@Controller
public class AdminAddBlog {

	@Autowired
	
	AdminDao adm = new AdminDao();
	
	@RequestMapping(value = {"/admin/addblog"},method = RequestMethod.GET)
	public ModelAndView addBlog(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("admin/addblog");
		
		return mv;
	}
	@RequestMapping(value = {"/admin/addblog"},method = RequestMethod.POST)
	public ModelAndView addBlogs(HttpServletRequest request,@RequestParam("image") CommonsMultipartFile commonsMultipartFile,ModelMap modelMap) {
		ModelAndView mv = new ModelAndView("admin/addblog");
		String image = commonsMultipartFile.getOriginalFilename();
		if(!"".equals(image)) {
			String dirname = request.getServletContext().getRealPath("images");
			
			String rootPath = "D:/Folder all/Vinaenter/Spring MVC/SPRING1/src/main/webapp";
			File dir = new File(rootPath + File.separator+"images"); 
		
			String name = String.valueOf(new Date().getTime()+image);
			try {
				 commonsMultipartFile.transferTo(new File(dir + File.separator + name));
			  
			}catch (Exception e1) {
				 e1.printStackTrace(); 
			} 
	        if(!dir.exists()) {
				  dir.mkdir(); 
		    }
	        
			File filedir = new File(dirname);
			if(!filedir.exists()) {
				filedir.mkdir();
			}
			
			try {
				
				commonsMultipartFile.transferTo(new File(filedir + File.separator + name));
				String title = request.getParameter("title");
				String author = request.getParameter("author");
				String detail = request.getParameter("detail");
				blog bl = new blog();
				bl.setAuthor(author);
				bl.setDetail(detail);
				bl.setImage(name);
				bl.setTitle(title);
				adm.addBlog(bl);
				System.out.println("Theem thanh cong");
			} catch (Exception e) {
				System.out.println("Them that baij");
				e.printStackTrace();
			} 
			
		};
		
		
		return mv;
	}
}
