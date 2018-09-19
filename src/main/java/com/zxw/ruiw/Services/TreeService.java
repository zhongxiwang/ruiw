package com.zxw.ruiw.Services;

import com.zxw.ruiw.Model.Tree;
import com.zxw.ruiw.Model.menum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TreeService implements Treelim
{

    @Value("${TreeHref}")
    private String Url;
    final int NullDocumentId=-1;

    int index=0;
    @Autowired
    MenumService Menum;
    public void GetData(Tree tree)
    {

        List<Tree> lt=new ArrayList<Tree>();
        List<menum> list= Menum.GetMenumByParentid(tree.getSilfid());
        for(menum key:list)
        {

            Tree tr= GetTree(key);
            if(key.getDocumentid()==NullDocumentId){
                GetData(tr);
            }
            lt.add(tr);
        }
        tree.setChildren(lt);
    }

    @Override
    public List<Tree> GetTree(int id) {
         List<Tree> lt=new ArrayList<Tree>();
         List<menum> men= Menum.GetMenumByParentid(id);
         for(menum key :men){
             Tree tmp= GetTree(key);
             GetData(tmp);
             lt.add(tmp);
         }
         index=0;
        return lt;
    }
    public Tree GetTree(menum men){
        Tree tree=new Tree();
        tree.setId(index);
        tree.setName(men.getMenumName());
        tree.setHref(Url.replace("#id",String.valueOf(men.getId())));
        tree.setSilfid(men.getId());
        tree.setDocid(men.getDocumentid());
        index++;
        return tree;
    }
    public menum ParemetById(menum men){
            return null;
    }
    public List<menum> SelectParent(int id)
    {
        return Menum.GetMenumByParentid(id);
    }
}
