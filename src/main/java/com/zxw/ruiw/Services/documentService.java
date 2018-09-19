package com.zxw.ruiw.Services;

import com.zxw.ruiw.Mapper.documentMapper;
import com.zxw.ruiw.Model.document;
import org.springframework.beans.factory.annotation.Autowired;

public interface documentService {
    public document GetDocument(int id);
    void Add(document doc);
    void Delete(int id);
    void Update(document doc);
}
