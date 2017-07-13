package action;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
/**
 * ��½Action
 * @author ����
 * @date 2017��7��3��15:03:18
 * @modify BUPT
 * @modifyDate 
 */
import com.opensymphony.xwork2.ActionSupport;

import domain.Commodity;
import domain.Order;
import domain.Shop;
import domain.User;
import service.IUserService;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String passWord;

	public LoginAction(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	@Resource
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String login() throws Exception {
		// TODO Auto-generated method stub
		
		User user = userService.findUser(userName, passWord);
		Shop shop = new Shop();
		Set<Shop> shops = user.getShops();
		Iterator<Shop> iterator = shops.iterator();
		while (iterator.hasNext()) {
			shop = (Shop) iterator.next();
		}
		
		
		if (user != null) {
			System.out.println("size :" +user.getShops().size());
			System.out.println("size2 :" +user.getOrders().size());
			ActionContext actionContext = ActionContext.getContext();
			actionContext.getSession().put("User", user);
			return SUCCESS;
		} else {
			return ERROR;
		}

	}
	
	public String logout() throws Exception {
		
		ActionContext actionContext = ActionContext.getContext();
		actionContext.getSession().remove("User");
		return SUCCESS;
		
	}
	
	
	public LoginAction() {
		super();
	}

}
