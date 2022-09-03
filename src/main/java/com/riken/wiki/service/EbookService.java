package com.riken.wiki.service;

import com.github.pagehelper.PageHelper;
import com.riken.wiki.domain.Ebook;
import com.riken.wiki.domain.EbookExample;
import com.riken.wiki.mapper.EbookMapper;
import com.riken.wiki.req.EbookReq;
import com.riken.wiki.resp.EbookResp;
import com.riken.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        PageHelper.startPage(1,3);
        EbookExample ebookExample = new EbookExample();
//        Criteriaはwhereの意味
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty(req.getName())){
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
//            //            ebookResp.setId(123L);   テスト用
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
//        Objectのコピー
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }

//        listのコピー
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }

}
