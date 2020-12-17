package cn.net.yzl.customer.model.mogo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class DemoMongo {

    private String _id;

    private String name;


    private Integer pvcId;


    private Short pvcCapital;


    private Short phonePrefixCode;


    private Short phoneLength;


    private String enAbbr;


    private String zip;


    private Date createTime;


    private Date updateTime;


}