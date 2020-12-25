package cn.net.yzl.customer.service;

import cn.net.yzl.common.entity.Page;
import cn.net.yzl.customer.dto.member.MemberSerchConditionDTO;
import cn.net.yzl.customer.model.Member;

public interface MemberService extends IBaseService<Member,Integer>{
    Page<Member> findPage(MemberSerchConditionDTO params);
    int updateByMemberCardSelective(Member dto);
    Member getMemberService(String memberCard);

}
