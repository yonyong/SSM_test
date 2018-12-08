package cn.lianwei.yonyong.service.impl;

import cn.lianwei.yonyong.dao.InfoDao;
import cn.lianwei.yonyong.dao.UserDao;
import cn.lianwei.yonyong.pojo.Info;
import cn.lianwei.yonyong.pojo.User;
import cn.lianwei.yonyong.service.InfoService;
import cn.lianwei.yonyong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    InfoDao infoDao;

    @Override
    public ArrayList<Info> queryInfo() {
        return infoDao.queryInfo();
    }

    @Override
    public Info queryInfoById(int temp_id) {
        return infoDao.queryInfoById(temp_id);
    }

    @Override
    public int editInfo(int id, String title, String date, String content) {
        return infoDao.editInfo(id,title,date,content);
    }

    @Override
    public int deleteInfo(int temp_id) {
        return infoDao.deleteInfo(temp_id);
    }

    @Override
    public int addInfo(String title, String content, String date) {
        return infoDao.addInfo(title,content,date);
    }
}
