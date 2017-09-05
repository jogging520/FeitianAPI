package com.northsky.util;

import java.util.UUID;

/**
 * 类名：UUID工具类
 * 用途：获取分布式环境下的唯一标识号
 * @author cr7
 *
 */
public class UUIDUtil 
{
	/**
	 * 方法：获取UUID编号
	 * @return UUID编号
	 */
	public static String getUUID()
	{
		String uuid = UUID.randomUUID().toString();
		
		uuid = uuid.replaceAll("-", "");
		
		return uuid;
	}
}
