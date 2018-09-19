package com.zxw.ruiw.Services;

import com.zxw.ruiw.Mapper.documentMapper;
import com.zxw.ruiw.Model.document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class documetServicelim implements documentService {

    @Autowired
    private documentMapper docm;
    @Override
    public document GetDocument(int id) {
        return docm.GetdocumentById(id);
    }

    @Override
    public void Add(document doc) {
        docm.Insertdocument(doc);
    }

    @Override
    public void Delete(int id) {
        docm.Delete(id);
    }

    @Override
    public void Update(document doc) {
        docm.Update(doc);
    }

    public int GetId()
    {
        return docm.GetId();
    }
}
