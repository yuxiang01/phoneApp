package com.phone.www.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("handset")
@Data
public class Handset implements Serializable {
  @TableId(type = IdType.AUTO)
  private Integer hsId;

  private String nameType;

  private Integer price;

  private String networkMode;
  /**
   * 外观设计
   */
  private String facade;
  /**
   * 触摸屏
   */
  private String screenSize;
}
