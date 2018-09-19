package com.zxw.ruiw.Controler;

import com.zxw.ruiw.Model.document;
import com.zxw.ruiw.Model.menum;
import com.zxw.ruiw.Services.MenumService;
import com.zxw.ruiw.Services.documetServicelim;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Calendar;

@RestController
@CrossOrigin
public class documentController {

    @Autowired
    private documetServicelim docService;

    @Autowired
    private MenumService ms;

    @ApiOperation(value="创建文档", notes="创建文档")
    @RequestMapping(value = "/document/{menumid}",method = RequestMethod.POST)
    public int Add(@PathVariable int menumid, @RequestBody document doc){
        //  Calendar now = Calendar.getInstance();
        //  int day= now.get(Calendar.DATE);//DAY
        //  int year=now.get(Calendar.YEAR);
        //  int month=now.get(Calendar.MONTH);
        //  Date dNow = new Date(year,month,day );
        //SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        //doc.setLastupdate(ft.format(dNow));
        java.util.Date udts=new  java.util.Date();
        Date dt=new Date(udts.getTime());
        doc.setLastupdate(dt);
        docService.Add(doc);
        int firstid= docService.GetId();
        menum men=ms.GetMenumById(menumid);
        men.setMenumName(doc.getTitle());
        men.setDocumentid(firstid);
        men.setParetmenum(menumid);
        ms.Add(men);
        return firstid;
    }

    @ApiOperation(value="get文档",notes="获取文档")
    @RequestMapping(value="/document/{id}",method=RequestMethod.GET)
    @ResponseBody
    public document Get(@PathVariable int id){
        return docService.GetDocument(id);
    }
    @ApiOperation(value="更新文档",notes="更新文档")
    @RequestMapping(value="/document/{id}",method = RequestMethod.PUT)
    public void Put(@PathVariable int id, @RequestBody document doc){
        doc.setId(id);
        docService.Update(doc);
    }

    @RequestMapping(value="/document/{id}/{mid}",method = RequestMethod.DELETE)
    public void Delete( @PathVariable int id,@PathVariable int mid)
    {
        ms.Delete(mid);
        docService.Delete(id);
    }

}
