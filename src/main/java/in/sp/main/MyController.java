package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	//@RequestMapping(value="/helloPage", method = RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage()
	{
		System.out.println("openHelloPage() method executed");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		
		return mav;
	}
	
	@GetMapping("/aboutUs")
	public String openAboutUsPage()
	{
		return "about-us";
	}
	
	@GetMapping("/myForm")
	public String openMyFormPage()
	{
		return "my-form";
	}
	// -------- 1ST WAY ---------------------------------
//	@PostMapping("/submitForm")
//	public String handleMyForm(HttpServletRequest req)
//	{
//		String myname = req.getParameter("name1");
//		String myemail = req.getParameter("email1");
//		String myphno = req.getParameter("phoneno1");
//		
//		System.out.println("Name : "+myname);
//		System.out.println("Email Id : "+myemail);
//		System.out.println("Phone no : "+myphno);
//		
//		return "profile";
//	}

	
	// -------- 2ND WAY ---------------------------------
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phoneno1") String myphno,
//			Model model
//			
//				)
//	{
//
//		
//		System.out.println("Name : "+myname);
//		System.out.println("Email Id : "+myemail);
//		System.out.println("Phone no : "+myphno);
//		
//		model.addAttribute("model_name", myname);
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_phone", myphno);
//		
//		return "profile";
//	}
	
	// -------- 3RD WAY ---------------------------------
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phoneno1") String myphno,
//			Model model
//			
//				)
//	{
//
//		
//		System.out.println("Name : "+myname);
//		System.out.println("Email Id : "+myemail);
//		System.out.println("Phone no : "+myphno);
//		
//		User user = new User();
//		user.setName(myname);
//		user.setEmail(myemail);
//		user.setPhoneno(myphno);
//		
//		model.addAttribute("model_user", user);
//		
//		
//		return "profile";
//	}
	
	// -------- 4th WAY ---------------------------------
	@PostMapping("/submitForm")
	public String handleMyForm(@ModelAttribute("model_user") User user)
	{

		return "profile";
	}
	
}
