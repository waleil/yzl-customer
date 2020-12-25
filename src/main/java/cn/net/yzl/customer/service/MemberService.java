package cn.net.yzl.customer.service;

import cn.net.yzl.customer.dto.member.MemberSerchConditionDTO;
import cn.net.yzl.customer.model.Member;
import com.github.pagehelper.PageInfo;

public interface MemberService {
    PageInfo<Member> findPage(MemberSerchConditionDTO params);

    public int save(Member dto);

    public int update(Member dto);
}
