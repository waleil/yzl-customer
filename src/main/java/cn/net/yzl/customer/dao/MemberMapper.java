package cn.net.yzl.customer.dao;

import cn.net.yzl.customer.dto.member.MemberSerchConditionDTO;
import cn.net.yzl.customer.model.Member;
import com.github.pagehelper.PageInfo;

public interface MemberMapper  extends IBaseDAO<Member,Integer>{

    int insert(Member record);

    PageInfo<Member> findPageByCondition(MemberSerchConditionDTO dto);



    int updateByMemberCardSelective(Member dto);
}