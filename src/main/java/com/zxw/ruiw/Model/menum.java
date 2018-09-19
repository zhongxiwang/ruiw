package com.zxw.ruiw.Model;

public class menum {
    private  int id;
    private String MenumName;
    private int paretmenum;
    private  String createdate;

    public int getDocumentid() {
        return documentid;
    }

    public void setDocumentid(int documentid) {
        this.documentid = documentid;
    }

    private  int documentid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenumName() {
        return MenumName;
    }

    public void setMenumName(String menumName) {
        MenumName = menumName;
    }

    public int getParetmenum() {
        return paretmenum;
    }

    public void setParetmenum(int paretmenum) {
        this.paretmenum = paretmenum;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}
