package spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import spring.entity.ItemDto;
import spring.repository.ItemDao;

public class DetailController implements Controller{
	private ItemDao itemDao;
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		int no = Integer.parseInt(req.getParameter("no"));
		ItemDto itemDto = itemDao.get(no);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/view/detauk.jsp?no=" + req.getParameter("no"));
		mv.addObject("dto", itemDao.get(no));
		return mv;
}
}