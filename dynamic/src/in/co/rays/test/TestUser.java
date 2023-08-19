package in.co.rays.test;

import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {
	public static void main(String[] args) throws Exception{
		
		testUser();
		
	}
	private static void testUser() throws Exception{
		String date = "10/05/2022";
		SimpleDateFormat sql=new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean = new UserBean();
		bean.setId(11);
		bean.setFirstName("dipanshu)");
		bean.setLastName("patidar");
		bean.setLoginId("25654");
		bean.setPassword("25648");
		bean.setDob(sql.parse(date));
		
		UserModel model = new UserModel();
		model.add(bean);
		
		
	}

}
