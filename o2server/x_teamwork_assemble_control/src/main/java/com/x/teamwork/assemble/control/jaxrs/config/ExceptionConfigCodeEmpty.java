package com.x.teamwork.assemble.control.jaxrs.config;

import com.x.base.core.project.exception.PromptException;

class ExceptionConfigCodeEmpty extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionConfigCodeEmpty() {
		super("查询操作传入的设置编码Code为空，无法进行查询或者保存操作.");
	}
}
