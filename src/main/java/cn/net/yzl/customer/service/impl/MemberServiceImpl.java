package cn.net.yzl.customer.service.impl;

import cn.net.yzl.common.entity.Page;
import cn.net.yzl.common.util.AssemblerResultUtil;
import cn.net.yzl.customer.dao.IBaseDAO;
import cn.net.yzl.customer.dao.MemberMapper;
import cn.net.yzl.customer.dto.member.MemberSerchConditionDTO;
import cn.net.yzl.customer.model.Member;
import cn.net.yzl.customer.service.MemberService;
import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public Page<Member> findPage(MemberSerchConditionDTO dto) {
        if(dto.getCurrentPage() == null){
            dto.setCurrentPage(1);
        }
        if(dto.getPageSize()== null){
            dto.setPageSize(10);
        }
        PageHelper.startPage(dto.getCurrentPage(),dto.getPageSize());
        List<Member> list = memberMapper.findPageByCondition(dto);
        Page<Member> page = AssemblerResultUtil.resultAssembler(list);

        return page;
    }



    @Override
    public int updateByMemberCardSelective(Member dto) {
       return memberMapper.updateByMemberCardSelective(dto);
    }

    @Override
    public IBaseDAO<Member, Integer> getDao() {
        return memberMapper;
    }
}
