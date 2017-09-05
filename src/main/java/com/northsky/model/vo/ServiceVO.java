package com.northsky.model.vo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.northsky.util.UUIDUtil;

/**
 * 类名：Service值对象
 * 用途：公共报文类，用于service对请求和响应报文进行封装，包含请求和响应的流水号、时间、域等信息，以便溯源、统计、分析。
 * @author Jiakun
 * @version 1.0
 * @param <VO>
 */
public class ServiceVO
{
	private Header 	header;		
	private Object	body;
	
	public ServiceVO()
	{
		header = new Header();
	}

	public Header getHeader() 
	{
		return header;
	}

	public Object getBody() 
	{
		return body;
	}

	public void setBody(Object body) 
	{
		this.body = body;
	}
	
	public String getHeaderRequestSerialNo() 
	{
		return this.getHeader().getRequestSerialNo();
	}
	
	public void setHeaderRequestSerialNo(String requestSerialNo) 
	{
		this.getHeader().setRequestSerialNo(requestSerialNo);
	}
	
	public String getHeaderRequestTime() 
	{
		return this.getHeader().getRequestTime();
	}
	
	public void setHeaderRequestTime(String requestTime) 
	{
		this.getHeader().setRequestTime(requestTime);
	}
	
	public void setHeaderRequestTime(Date requestTime) 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		
		this.getHeader().setRequestTime(dateFormat.format(requestTime));
	}
	
	public String getHeaderRequestDomain() 
	{
		return this.getHeader().getRequestDomain();
	}
	
	public void setHeaderRequestDomain(String requestDomain) 
	{
		this.getHeader().setRequestDomain(requestDomain);
	}
	
	public String getHeaderResponseSerialNo() 
	{
		return this.getHeader().getResponseSerialNo();
	}
	
	public void setHeaderResponseSerialNo(String responseSerialNo) 
	{
		this.getHeader().setResponseSerialNo(responseSerialNo);
	}
	
	public String getHeaderResponsetHeaderime() 
	{
		return this.getHeader().getResponseTime();
	}
	
	public void setHeaderResponseTime(String responseTime) 
	{
		this.getHeader().setResponseTime(responseTime);
	}
	
	public void setHeaderResponseTime(Date responseTime) 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");		
		
		this.getHeader().setResponseTime(dateFormat.format(responseTime));
	}
	
	public String getHeaderResponseDomain() 
	{
		return this.getHeader().getResponseDomain();
	}
	
	public void setHeaderResponseDomain(String responseDomain) 
	{
		this.getHeader().setResponseDomain(responseDomain);
	}
	
	public String getHeaderResponseCode() 
	{
		return this.getHeader().getResponseCode();
	}
	
	public void setHeaderResponseCode(String responseCode) 
	{
		this.getHeader().setResponseCode(responseCode);
	}
	
	public String getHeaderResponseDescription() 
	{
		return this.getHeader().getResponseDescription();
	}
	
	public void setHeaderResponseDescription(String responseDescription) 
	{
		this.getHeader().setResponseDescription(responseDescription);
	}
	
	public String toString()
	{
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("header:\t");
		stringBuffer.append("requestSerialNo:");
		stringBuffer.append(this.getHeaderRequestSerialNo());
		//TODO
		
		return stringBuffer.toString();
	}
	
	class Header
	{
		private String 	requestSerialNo;		//请求流水号
		private String 	requestTime;			//请求发起时间
		private String 	requestDomain;			//请求机构
		private String 	responseSerialNo;		//响应流水号
		private String 	responseTime;			//响应时间
		private String 	responseDomain;			//响应机构
		private String 	responseCode;			//响应代码（业务级）
		private String 	responseDescription;	//响应描述（业务级）
		
		public Header()
		{
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
			
			Date date = new Date();
			this.setRequestSerialNo(UUIDUtil.getUUID());
			this.setRequestTime(dateFormat.format(date));
			
			this.setResponseSerialNo(UUIDUtil.getUUID());
			this.setResponseTime(dateFormat.format(date));
			//TODO 0000响应码后面要替换成ENUM类
			this.setResponseCode("0000");
		}
		
		public String getRequestSerialNo() 
		{
			return requestSerialNo;
		}
		
		public void setRequestSerialNo(String requestSerialNo) 
		{
			this.requestSerialNo = requestSerialNo;
		}
		
		public String getRequestTime() 
		{
			return requestTime;
		}
		
		public void setRequestTime(String requestTime) 
		{
			this.requestTime = requestTime;
		}
		
		public String getRequestDomain() 
		{
			return requestDomain;
		}
		
		public void setRequestDomain(String requestDomain) 
		{
			this.requestDomain = requestDomain;
		}
		
		public String getResponseSerialNo() 
		{
			return responseSerialNo;
		}
		
		public void setResponseSerialNo(String responseSerialNo) 
		{
			this.responseSerialNo = responseSerialNo;
		}
		
		public String getResponseTime() 
		{
			return responseTime;
		}
		
		public void setResponseTime(String responseTime) 
		{
			this.responseTime = responseTime;
		}
		
		public String getResponseDomain() 
		{
			return responseDomain;
		}
		
		public void setResponseDomain(String responseDomain) 
		{
			this.responseDomain = responseDomain;
		}
		
		public String getResponseCode() 
		{
			return responseCode;
		}
		
		public void setResponseCode(String responseCode) 
		{
			this.responseCode = responseCode;
		}
		
		public String getResponseDescription() 
		{
			return responseDescription;
		}
		
		public void setResponseDescription(String responseDescription) 
		{
			this.responseDescription = responseDescription;
		}
	}
}
