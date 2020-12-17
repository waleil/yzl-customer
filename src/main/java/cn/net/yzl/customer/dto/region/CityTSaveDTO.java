package cn.net.yzl.customer.dto.region;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="省份新增参数类",description="参数类" )
@Data
public class CityTSaveDTO {


    @ApiModelProperty(value = "城市名称")
    private String name;

    @ApiModelProperty(value = "省的主键")
    private Integer pvcId;

    @ApiModelProperty(value = "是否为省会城市")
    private Integer pvcCapital;

    @ApiModelProperty(value = "座机电话区号")
    private Integer phonePrefixCode;

    @ApiModelProperty(value = "座机电话长度")
    private Integer phoneLength;

    @ApiModelProperty(value = "城市拼音简写")
    private String enAbbr;

    @ApiModelProperty(value = "邮编")
    private String zip;



}