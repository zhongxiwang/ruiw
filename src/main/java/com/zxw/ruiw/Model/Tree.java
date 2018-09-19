package com.zxw.ruiw.Model;

import java.util.List;

public class Tree {
    String  name;
    String  alias;
    int id;
    int silfid;
    int docid;
    Boolean spread;
    String href;
    List<Tree> children;

    public  int getSilfid(){return silfid;}

    public  void setSilfid(int silfid){this.silfid=silfid;}

    public Boolean getSpread() {
        return spread;
    }

    public String getAlias() {
        return alias;
    }

    public int getId() {
        return id;
    }

    public String getHref() {
        return href;
    }

    public String getName() {
        return name;
    }

    public List<Tree> getChildren() {
        return children;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpread(Boolean spread) {
        this.spread = spread;
    }

    public void setDocid(int id){
        this.docid=id;
    }
    public int getDocid(){return this.docid;}
}
