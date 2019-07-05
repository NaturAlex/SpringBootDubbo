package com.sixone.client.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @Author: zhangtengchen
 * @Date: 2019/7/5 12:00
 */
@Data
public class User implements Serializable {
	private static final long serialVersionUID = -8953890158185814165L;
	private Long id;

	private Integer age;

	private String name;

}
