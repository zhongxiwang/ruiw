package com.zxw.ruiw;

import com.zxw.ruiw.Controler.HomeController;
import com.zxw.ruiw.Controler.ImageController;
import com.zxw.ruiw.Controler.MenumController;
import com.zxw.ruiw.Model.menum;
import com.zxw.ruiw.Services.MenumServicelim;
import org.junit.Test;
import  org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.*;

import javax.validation.constraints.AssertTrue;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RuiwApplicationTests {

	@Autowired
	MenumController hcon;
	@Autowired
	MenumServicelim menum;
	@Autowired
	ImageController Image;
	@Test
	public void contextLoads()
	{
			menum men = new menum();
			men.setMenumName("Test");
			men.setParetmenum(0);
			hcon.Add(men);
			List<menum> ls= hcon.GetMenum(0);

			//AssertEquals(true,ls.toArray().length>0?true:false);
	}

	@Test
	public void Image()
	{
		menum men=new menum();
		men.setMenumName("Test");
		men.setDocumentid(0);
		men.setParetmenum(0);
		menum.Add(men);
	}
}
