package cn.net.yzl.customer.service.impl;

import cn.net.yzl.customer.dao.MemberMapper;
import cn.net.yzl.customer.dto.member.MemberSerchConditionDTO;
import cn.net.yzl.customer.model.Member;
import cn.net.yzl.customer.service.MemberService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public PageInfo<Member> findPage(MemberSerchConditionDTO dto) {
        PageInfo<Member> result = memberMapper.findPageByCondition(dto);
        return result;
    }

    /**
     * 插入
     * @param dto
     * @return
     */
    @Override
    public int save(Member dto) {
       int count =  memberMapper.updateByMemberCardSelective(dto);
       if(count == 0 ){
          count =  memberMapper.insert(dto);
       }
       return  count;
    }

    @Override
    public int update(Member dto) {
       return memberMapper.updateByMemberCardSelective(dto);
    }
}
