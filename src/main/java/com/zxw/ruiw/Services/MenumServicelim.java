package com.zxw.ruiw.Services;

import com.zxw.ruiw.Mapper.menumMapper;
import com.zxw.ruiw.Model.menum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenumServicelim implements MenumService {
    @Autowired
    private menumMapper men;
    @Override
    public menum GetMenumById(int id) {
        return men.GetMenumById(id);
    }

    @Override
    public List<menum> GetMenumByParentid(int id) {
        return men.GetMenumByParentId(id);
    }

    @Override
    public void Add(menum mens) {
        men.InsertMenum(mens);
    }

    @Override
    public void Delete(int id) {
        men.Delete(id);
    }

    @Override
    public void Update(menum mens) {
        men.Update(mens);
    }

    @Override
    public void UpdateName(String MenumName,int id) {
        men.UpdateName(MenumName,id);
    }
}
