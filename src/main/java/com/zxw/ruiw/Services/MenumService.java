package com.zxw.ruiw.Services;

import com.zxw.ruiw.Model.menum;

import java.util.List;

public interface MenumService {
    menum GetMenumById(int id);
    List<menum> GetMenumByParentid(int id);
    void Add(menum men);
    void Delete(int id);
    void Update(menum men);
    void UpdateName(String Name,int id);
}
