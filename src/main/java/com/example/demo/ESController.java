//package com.example.demo;
//
//import com.example.demo.dao.MouldDao;
//import com.example.demo.entity.MouldEntity;
//import com.example.demo.res.EsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import tk.mybatis.mapper.entity.Example;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/es")
//public class ESController {
//
//    @Autowired
//    MouldDao mouldDao;
//
//    @Autowired
//    private EsRepository esRepository;
//
//    @GetMapping("/delete")
//    public Object test(String key){
//
//        esRepository.deleteAll();
//        return "1";
//    }
//
//    @GetMapping("/search")
//    public Page<MouldEntity> search(String keyword) {
//        // es默认索引从0开始,mp默认从1开始
//        QueryPage queryPage = new QueryPage();
//        queryPage.setSize(40);
//        queryPage.setCurrent(10);
//        PageRequest pageRequest = PageRequest.of(queryPage.getCurrent() - 1, queryPage.getSize());
//        return esRepository.findByNameOrTagsLike(keyword,keyword,pageRequest);
//    }
//
//    @GetMapping("/add")
//    public Object addAll() {
//        int offset = 0;
//        int size = 5000;
//        findAndAdd(offset,size);
//
//        long count = esRepository.count();
//        return count;
//    }
//
//    private void findAndAdd(int offset, int size) {
//        List<MouldEntity> mouldEntities;
//        mouldEntities = mouldDao.selectByLimit(offset * size, size);
//        esRepository.saveAll(mouldEntities);
//        System.out.println(mouldEntities.get(0).getId());
//        if (mouldEntities.size() >= 5000){
//            mouldEntities = null;
//            findAndAdd(++offset,5000);
//        }
//    }
//}
