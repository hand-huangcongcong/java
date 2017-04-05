package controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import bean.Customer;
import bean.Staff;
import service.ManageContentService;

@Controller
public class AllController {
	@Resource 
	  private ManageContentService manageContentServiceImpl;
	@RequestMapping("/login")
	  public String login(HttpServletRequest request,HttpSession session,Staff staff){
		  if(manageContentServiceImpl.login(staff.getFirst_name(), staff.getPassword())==0){
			  request.setAttribute("First_name",staff.getFirst_name());
			  System.out.println("First_name"+staff.getFirst_name()+","+staff.getPassword());
			/*List<Customer> list=new ArrayList<Customer>();
			list.add(customer);*/
			request.getSession().setAttribute("list", manageContentServiceImpl.queryCustomer());
			System.out.println(manageContentServiceImpl.queryCustomer());
		   return "index";
		  }else{
			  request.setAttribute("fail", "Ê§°Ü");
			  System.out.println("First_name"+staff.getFirst_name()+","+staff.getPassword());
			  return "login";
		  }
	  }
	 @RequestMapping("/queryCustomer")
	  public String queryCustomer(HttpServletRequest request,HttpSession session ){
		 request.getSession().setAttribute("list", manageContentServiceImpl.queryCustomer());
		return  "main";
		 
	  }
	 @RequestMapping("/queryCustomerByid")
	  public String queryCustomerByid(HttpServletRequest request,HttpSession session ,Customer customer){
		 System.out.println("customer.getCustomer_id()"+customer.getCustomer_id());
		 request.setAttribute("Customer", manageContentServiceImpl.queryCustomerByid(customer.getCustomer_id()));
		 System.out.println(request.getAttribute("Customer"));
		 request.getSession().setAttribute("list", manageContentServiceImpl.queryAddress());
		 System.out.println("customer.getCustomerbyid()");
		 return  "update";
		 
	  }
	 @RequestMapping("/insertCustomer")
	  public String insertCustomer(HttpServletRequest request,HttpSession session ,Customer customer){
		 System.out.println("customer.getAddress_id()"+customer.getAddress_id());
		 System.out.println("customer.getFirst_name()"+customer.getFirst_name());
		  if(manageContentServiceImpl.create(customer.getFirst_name(), customer.getLast_name(), customer.getEmail(), customer.getAddress_id())>0){
			  return  "main";
		  }else{
			  return  "main"; 
		  }
		 
		
		 
	  }
	 @RequestMapping("/updateCustomer")
	  public String updateCustomer(HttpServletRequest request,HttpSession session,Customer customer ){
		 System.out.println("customer.getCustomer_id()"+customer.getCustomer_id());
		 System.out.println("customer.getAddress_id()"+customer.getAddress_id());
		 request.setAttribute("list", manageContentServiceImpl.updateCustomer( customer.getFirst_name(), customer.getLast_name(), customer.getEmail(),customer.getAddress_id(),customer.getCustomer_id()));
		 System.out.println("end updateCustomer");
		 return  "main"; 
		 
	  }
	 @RequestMapping("/delCustomer")
	  public String delCustomer(HttpServletRequest request,HttpSession session,Customer customer ){
		 request.getSession().setAttribute("list", manageContentServiceImpl.delCustomer(customer.getCustomer_id()));
		return  "main";
		 
	  }
	 @RequestMapping("/queryAddress")
	  public String queryAddress(HttpServletRequest request,HttpSession session ){
		 request.getSession().setAttribute("list", manageContentServiceImpl.queryAddress());
		return  "insert";
		 
	  }
	 
	 
	 
}
