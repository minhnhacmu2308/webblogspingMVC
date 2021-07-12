package Spring1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Spring1.Dao.BlogDao;

@Controller
public class AdminGetListBlogController {
	@Autowired
	BlogDao hd = new BlogDao();
	
	@RequestMapping(value = {"/admin/listblogs"},method = RequestMethod.GET)
	public ModelAndView listBlog() {
		ModelAndView mv = new ModelAndView("admin/listblogs");
		mv.addObject("listBlogs",hd.getListBlogs());
		return mv;
	}
}
