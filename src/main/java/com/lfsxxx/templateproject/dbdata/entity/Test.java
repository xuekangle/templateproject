package com.lfsxxx.templateproject.dbdata.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xxx
 * @since 2018-09-22
 */
@TableName(value = "test",resultMap = "TestResultMap")
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String name;
	private String sex;


	public Integer getId() {
		return id;
	}

	public Test setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Test setName(String name) {
		this.name = name;
		return this;
	}

	public String getSex() {
		return sex;
	}

	public Test setSex(String sex) {
		this.sex = sex;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
