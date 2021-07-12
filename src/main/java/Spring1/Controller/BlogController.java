package Spring1.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Spring1.Dao.BlogDao;


@Controller
public class BlogController {
	@Autowired
	BlogDao hd = new BlogDao();
	@RequestMapping(value = {"/blogs"}, method = RequestMethod.GET)
	public ModelAndView blog() {
		
		ModelAndView mv = new ModelAndView("user/blogs");
		mv.addObject("key","blog");
		mv.addObject("listBlogs",hd.getListBlogs());
		return mv;
	}
	@RequestMapping(value = {"/detailblog"}, method = RequestMethod.GET)
	public ModelAndView detailBlog(HttpServletRequest request ,@RequestParam(defaultValue="id",required=true) int id ) {
		ModelAndView mv = new ModelAndView("user/detailpost");	
	
		mv.addObject("detailBlog",hd.getDetailBlog(id));
		return mv;
	}
}
