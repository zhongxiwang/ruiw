package com.zxw.ruiw.Controler;

import com.zxw.ruiw.Model.menum;
import com.zxw.ruiw.Services.MenumServicelim;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MenumController {
    @Autowired
    MenumServicelim menumservice;

    @ApiOperation(value="删除用户", notes="根据url的id来指定删除用户")
    //@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int", paramType = "int")
    @RequestMapping(value = "/Menum",method = RequestMethod.GET)
    public  @ResponseBody List<menum> GetMenum(int id){

        List<menum> list= menumservice.GetMenumByParentid(id);
        return list;
    }
    @RequestMapping(value = "/Menum/{id}",method = RequestMethod.GET)
    public  @ResponseBody menum GetMenumf(@PathVariable int id){

        menum men= menumservice.GetMenumById(id);
        return men;
    }

    @ApiOperation(value="更新信息", notes="根据url的id来指定更新用户信息")
    //@ApiImplicitParam(name="menum",value="用户菜单",required = true,dataType = "json",paramType = "menum")
    @RequestMapping(value = "/Menum",method = RequestMethod.POST)
    public  @ResponseBody String Add(@RequestBody menum men){
        menumservice.Add(men);
        return "1";

    }

    @RequestMapping(value = "/Menum",method = RequestMethod.DELETE)
    public  void Delete(int id){
        menumservice.Delete(id);
    }

    @RequestMapping(value="/Menuminfo",method = RequestMethod.GET)
    public void CreateData(String menumname)
    {
        menum men=new menum();
        men.setMenumName(menumname);
        men.setParetmenum(0);
        men.setDocumentid(0);
        menumservice.Add(men);
    }
    @RequestMapping(value="/Menum",method = RequestMethod.PUT)
    public void UpdateData(String MenumName,int id)
    {
        menum men=new menum();
        men.setMenumName(MenumName);
        men.setId(id);
        men.setParetmenum(0);
        menumservice.Update(men);

    }
}
