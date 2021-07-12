package Spring1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Spring1.Dao.HomeDao;

@Controller
public class HomeController {
		@Autowired
		HomeDao hd = new HomeDao();
		
		@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
		public ModelAndView index() {
			ModelAndView mv = new ModelAndView("user/index");	
			mv.addObject("key","home");
			return mv;
		}
		
		
}
