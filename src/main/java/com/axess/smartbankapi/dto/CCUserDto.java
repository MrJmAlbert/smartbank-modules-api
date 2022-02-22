package com.axess.smartbankapi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author Zhe Liu
 */
@Data
@ApiModel("CCUserDto")
public class CCUserDto {

    private long ccNumber;

    private String ccName;

    private String userName;

    private String userId;

    private String password;

    private double availableRedeemPoints;

    private double totalRewardsGained;
}
